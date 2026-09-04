# Day 95 - Smallest Stable Index I

## 🚀 LeetCode #3903

### Problem

Given an integer array `nums` and an integer `k`, an index `i` is called **stable** if:

```text
max(nums[0...i]) - min(nums[i...n-1]) <= k
```

Return the **smallest stable index**.

If no stable index exists, return:

```text
-1
```

---

## 💡 Key Idea

For every index `i`, we need two values:

```text
Maximum from the LEFT
+
Minimum from the RIGHT
```

So we calculate:

### Prefix Maximum

The largest value from index `0` to `i`.

```text
max(nums[0...i])
```

### Suffix Minimum

The smallest value from index `i` to the end.

```text
min(nums[i...n-1])
```

Then:

```text
instability = prefix maximum - suffix minimum
```

If:

```text
instability <= k
```

then the index is stable.

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
answer = 3
```

---

## 🧠 Approach

### Step 1: Build Suffix Minimum

Traverse from right to left.

```java
right[i] = Math.min(right[i + 1], nums[i]);
```

After this:

```text
right[i]
```

contains the minimum value from `i` to the end.

### Step 2: Track Prefix Maximum

Traverse from left to right.

```java
left = Math.max(left, nums[i]);
```

Now `left` represents:

```text
max(nums[0...i])
```

### Step 3: Check Stability

For every index:

```java
if (left - right[i] <= k)
```

return that index immediately.

Because we move from left to right, the first valid index is the smallest stable index.

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

        int left = 0;

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

We traverse the array twice.

**Space Complexity:** `O(n)`

The `right` array stores the suffix minimum for every index.

---

## 📌 Key Takeaway

Remember this formula:

```text
        PREFIX             SUFFIX

   maximum till i       minimum from i
          │                   │
          └─────────┬─────────┘
                    ↓
          maximum - minimum
                    ↓
               <= k ?
              ↙       ↘
            YES        NO
             ↓          ↓
          answer       continue
```

The entire problem boils down to:

```text
leftMax - rightMin <= k
```

and return the first index where this condition is satisfied.

### LeetCode

**Problem:** Smallest Stable Index I
**LeetCode:** #3903
**Difficulty:** Easy
