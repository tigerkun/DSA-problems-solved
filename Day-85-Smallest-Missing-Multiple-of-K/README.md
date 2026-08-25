# Day 85 - Smallest Missing Multiple of K

## 🚀 LeetCode #3718

### Problem

Given an integer array `nums` and a positive integer `k`, return the smallest positive multiple of `k` that is missing from `nums`.

The positive multiples of `k` are:

```text
k, 2k, 3k, 4k, ...
```

### Example

**Input:**

```text
nums = [8,2,3,4,6]
k = 2
```

**Output:**

```text
10
```

### Explanation

The multiples of `2` are:

```text
2, 4, 6, 8, 10, 12, ...
```

The values `2`, `4`, `6`, and `8` are present in the array.

The first missing multiple is:

```text
10
```

### 💡 Approach

Use a `HashSet` to store all the elements of the array.

Then start from `k` and keep checking its multiples.

```text
k → 2k → 3k → 4k → ...
```

As soon as a multiple is not present in the set, return it.

### 🔍 Example Walkthrough

```text
nums = [8,2,3,4,6]
k = 2
```

Store the elements:

```text
{8, 2, 3, 4, 6}
```

Now check:

```text
2  → present
4  → present
6  → present
8  → present
10 → missing
```

Therefore:

```text
Answer = 10
```

### 💻 Java Solution

```java
import java.util.HashSet;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(n + m)`
* **Space Complexity:** `O(n)`

where `n` is the number of elements in `nums` and `m` is the number of multiples checked before finding the answer.

### 📌 Key Takeaway

The entire solution can be remembered as:

```text
Put all numbers in HashSet
          ↓
Start from k
          ↓
Check k, 2k, 3k, 4k...
          ↓
First missing multiple
          ↓
Return it
```

The `HashSet` makes checking whether a number exists quick and keeps the solution simple.

### 🔗 LeetCode

**Problem:** Smallest Missing Multiple of K
**LeetCode:** #3718
**Difficulty:** Easy
