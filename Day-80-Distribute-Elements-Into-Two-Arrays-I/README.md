# Day 80 - Distribute Elements Into Two Arrays I

## 🚀 LeetCode #3069

### Problem

You are given a 1-indexed array of distinct integers `nums`.

Distribute the elements into two arrays, `arr1` and `arr2`, according to these rules:

1. Put the first element into `arr1`.
2. Put the second element into `arr2`.
3. For every remaining element:

   * If the last element of `arr1` is greater than the last element of `arr2`, add the element to `arr1`.
   * Otherwise, add it to `arr2`.
4. Finally, concatenate `arr1` and `arr2` and return the result.

### Example

**Input:**

```text
nums = [2,1,3]
```

**Output:**

```text
[2,3,1]
```

### 💡 Approach

This problem can be solved using **simple simulation**.

First initialize:

```text
arr1 = [nums[0]]
arr2 = [nums[1]]
```

Then start from the third element.

For every element:

```text
if last(arr1) > last(arr2)
        ↓
    add to arr1
else
        ↓
    add to arr2
```

After all elements are distributed, append `arr2` to `arr1`.

### 🔍 Example Walkthrough

For:

```text
nums = [5,4,3,8]
```

Initially:

```text
arr1 = [5]
arr2 = [4]
```

### Step 1

Compare:

```text
5 > 4
```

So `3` goes into `arr1`.

```text
arr1 = [5,3]
arr2 = [4]
```

### Step 2

Compare the last elements:

```text
3 > 4 → false
```

So `8` goes into `arr2`.

```text
arr1 = [5,3]
arr2 = [4,8]
```

Finally concatenate:

```text
[5,3] + [4,8]
```

Result:

```text
[5,3,4,8]
```

### 💻 Java Solution

```java
import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1))
                arr1.add(nums[i]);
            else
                arr2.add(nums[i]);
        }

        arr1.addAll(arr2);

        return arr1.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

We process every element once and store all elements in the two arrays.

### 📌 Key Takeaway

The main idea is simply to **simulate the given rules**:

```text
First element  → arr1
Second element → arr2

Remaining elements:
    Compare last(arr1) and last(arr2)
             ↓
    arr1 > arr2 → arr1
    otherwise   → arr2

Finally:
    result = arr1 + arr2
```

This is a straightforward **Array Simulation** problem, so no complex data structure is required.

### 🔗 LeetCode

**Problem:** Distribute Elements Into Two Arrays I
**LeetCode:** #3069
**Difficulty:** Easy
