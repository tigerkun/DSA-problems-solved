# Day 96 - Smallest Stable Index II

## 🚀 LeetCode #3904

### Problem

Given an integer array `nums` and an integer `k`, the instability of an index `i` is:

```text
max(nums[0...i]) - min(nums[i...n-1])
```

An index is called **stable** if its instability is less than or equal to `k`.

Return the **smallest stable index**.

If no stable index exists, return `-1`.

---

## 💡 Key Idea

For every index, we need two things:

```text
Maximum from the LEFT
Minimum from the RIGHT
```

Instead of calculating these repeatedly, we preprocess the **suffix minimum** and maintain the **prefix maximum** while traversing.

---

## 🔑 Approach

### Step 1 — Suffix Minimum

Create an array:

```text
right[i]
```

where:

```text
right[i] = minimum value from i to n-1
```

Build it from right to left.

```java
right[i] = Math.min(right[i + 1], nums[i]);
```

---

### Step 2 — Prefix Maximum

Traverse from left to right and maintain:

```java
left = Math.max(left, nums[i]);
```

Now `left` represents:

```text
max(nums[0...i])
```

---

### Step 3 — Check Stability

For every index:

```text
instability = left - right[i]
```

If:

```text
left - right[i] <= k
```

then the index is stable.

Since we check indices from left to right, the first valid index is automatically the **smallest stable index**.

---

## 🔍 Example

```text
nums = [5, 0, 1, 4]
k = 3
```

### Index 0

```text
prefix max = 5
suffix min = 0

5 - 0 = 5
```

Not stable.

### Index 1

```text
prefix max = 5
suffix min = 0

5 - 0 = 5
```

Not stable.

### Index 2

```text
prefix max = 5
suffix min = 1

5 - 1 = 4
```

Not stable.

### Index 3

```text
prefix max = 5
suffix min = 4

5 - 4 = 1
```

Since:

```text
1 <= 3
```

index `3` is stable.

Therefore:

```text
Answer = 3
```

---

## 💻 Java Solution

```java
class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] right = new int[n];

        right[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.min(right[i + 1], nums[i]);
        }

        int left = nums[0];

        for (int i = 0; i < n; i++) {

            left = Math.max(left, nums[i]);

            if (left - right[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}
```

---

## ⏱️ Complexity

**Time Complexity:** `O(n)`

We make one backward pass and one forward pass.

**Space Complexity:** `O(n)`

The suffix minimum array requires `O(n)` extra space.

---

## 📌 Key Takeaway

Remember this formula:

```text
Stable if:

PREFIX MAX - SUFFIX MIN <= k
```

Implementation pattern:

```text
Build suffix minimum
        ↓
Scan from left
        ↓
Maintain prefix maximum
        ↓
Check:
leftMax - rightMin <= k
        ↓
Return first valid index
```

### LeetCode

**Problem:** Smallest Stable Index II
**LeetCode:** #3904
**Difficulty:** Medium
