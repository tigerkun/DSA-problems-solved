# Day 89 - Make Lexicographically Smallest Array by Swapping Elements

## 🚀 LeetCode #2948

### Problem

You are given an integer array `nums` and an integer `limit`.

You can swap two elements `nums[i]` and `nums[j]` if:

```text
|nums[i] - nums[j]| <= limit
```

You can perform the operation any number of times.

Return the **lexicographically smallest array** that can be obtained.

---

## 💡 Key Observation

The important idea is that elements can form **groups**.

After sorting the values, if two consecutive values satisfy:

```text
arr[i + 1] - arr[i] <= limit
```

they can belong to the same connected group.

For example:

```text
nums = [1, 5, 3, 9]
limit = 2
```

Sorted values:

```text
1  3  5  9
```

Differences:

```text
3 - 1 = 2  ✓
5 - 3 = 2  ✓
9 - 5 = 4  ✗
```

So the groups are:

```text
[1, 3, 5]   [9]
```

The elements inside `[1, 3, 5]` can be rearranged among their original positions.

---

## 🔍 Why Grouping Works

Suppose:

```text
1 → 3 → 5
```

Even though `1` and `5` differ by more than `limit`, we can swap through the intermediate value:

```text
1 ↔ 3
3 ↔ 5
```

Therefore, all three values belong to the same connected component.

This is why we only need to check the difference between **adjacent sorted values**.

---

## 🧠 Greedy Strategy

Once we identify a group:

1. Get all values in the group.
2. Get their original indices.
3. Sort the indices.
4. Put the smallest value at the smallest index.
5. Put the next smallest value at the next smallest index.

Example:

```text
Values:
[1, 3, 5]

Original indices:
[2, 0, 1]
```

Sort indices:

```text
[0, 1, 2]
```

Assign:

```text
index 0 → 1
index 1 → 3
index 2 → 5
```

This gives the lexicographically smallest arrangement for that group.

---

## 💻 Java Solution

```java
import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = 0;

        while (start < n) {

            int end = start;

            while (end + 1 < n &&
                   arr[end + 1][0] - arr[end][0] <= limit) {
                end++;
            }

            int[] indices = new int[end - start + 1];

            for (int i = start; i <= end; i++) {
                indices[i - start] = arr[i][1];
            }

            Arrays.sort(indices);

            for (int i = start; i <= end; i++) {
                nums[indices[i - start]] = arr[i][0];
            }

            start = end + 1;
        }

        return nums;
    }
}
```

---

## ⏱️ Complexity

Sorting the elements:

```text
O(n log n)
```

Sorting the indices of the groups:

```text
O(n log n)
```

Therefore:

**Time Complexity:** `O(n log n)`

**Space Complexity:** `O(n)`

---

## 📌 Key Takeaway

Remember this problem as:

```text
Sort values
    ↓
Find connected groups
    ↓
Collect original indices
    ↓
Sort indices
    ↓
Put smallest values at smallest indices
```

The most important observation:

```text
If consecutive sorted values differ by <= limit,
they belong to the same swappable group.
```

Then simply arrange each group's smallest values at its smallest original indices.

### LeetCode

**Problem:** Make Lexicographically Smallest Array by Swapping Elements
**LeetCode:** #2948
**Difficulty:** Medium
