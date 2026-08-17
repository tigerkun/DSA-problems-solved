# Day 77 - Remove Duplicates from Sorted Array

## 🚀 LeetCode #26

### Problem

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once.

Return the number of unique elements.

The relative order of the elements should be maintained.

### Example

**Input:**

```text
nums = [1,1,2]
```

**Output:**

```text
2
```

The modified array becomes:

```text
[1,2,_]
```

The first `2` elements contain the unique values.

### 💡 Approach

Since the array is already **sorted**, duplicate values are next to each other.

Use the **Two-Pointer technique**:

1. Keep `k` at the position where the next unique element should be placed.
2. Start scanning from index `1`.
3. Compare the current element with the previous element.
4. If they are different, the element is unique.
5. Place it at `nums[k]` and increment `k`.
6. Return `k` as the number of unique elements.

### 🔍 Example Walkthrough

```text
nums = [1,1,2,2,3]
```

Initially:

```text
k = 1
```

Compare:

```text
1 == 1 → duplicate → skip

2 != 1 → unique
nums[1] = 2
k = 2

2 == 2 → duplicate → skip

3 != 2 → unique
nums[2] = 3
k = 3
```

Final array:

```text
[1,2,3,2,3]
```

Only the first `k = 3` elements matter:

```text
[1,2,3]
```

### 💻 Java Solution

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

### 📌 Key Takeaway

Because the array is sorted, duplicates are always adjacent.

```text
Sorted Array
     ↓
Compare current with previous
     ↓
Different → Keep it
Same → Skip it
     ↓
Use second pointer to overwrite duplicates
```

The important concept is **in-place modification using two pointers**.

### 🔗 LeetCode

**Problem:** Remove Duplicates from Sorted Array
**LeetCode:** #26
**Difficulty:** Easy
