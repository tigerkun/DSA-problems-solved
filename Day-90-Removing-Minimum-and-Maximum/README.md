# Day 90 - Removing Minimum and Maximum From Array

## 🚀 LeetCode #2091

### Problem

Given an integer array `nums`, remove the minimum and maximum elements using the minimum number of deletions.

In one operation, you can remove an element from either:

* The beginning of the array
* The end of the array

Return the minimum number of deletions required to remove both the minimum and maximum elements.

---

## 💡 Key Observation

First find the positions of:

```text
minimum element
maximum element
```

Suppose:

```text
minIndex < maxIndex
```

There are only **three possible strategies**.

### 1️⃣ Remove Both From the Left

To remove the maximum at `maxIndex`, we must remove everything before it.

Number of deletions:

```text
maxIndex + 1
```

---

### 2️⃣ Remove Both From the Right

To remove the minimum at `minIndex`, we can remove everything after it.

Number of deletions:

```text
n - minIndex
```

---

### 3️⃣ Remove One From Each Side

Remove the minimum from the left and the maximum from the right.

Cost:

```text
(minIndex + 1) + (n - maxIndex)
```

---

## 🔍 Example

Consider:

```text
nums = [2, 10, 7, 5, 4, 1, 8, 6]
```

Minimum:

```text
1 → index 5
```

Maximum:

```text
10 → index 1
```

Rearrange the indexes:

```text
minIndex = 1
maxIndex = 5
```

Now calculate:

### Both from left

```text
maxIndex + 1
= 5 + 1
= 6
```

### Both from right

```text
n - minIndex
= 8 - 1
= 7
```

### One from each side

```text
(minIndex + 1) + (n - maxIndex)

= (1 + 1) + (8 - 5)

= 2 + 3

= 5
```

Therefore:

```text
answer = 5
```

---

## 💻 Java Solution

```java
class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {

            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Put smaller index first
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // Both removed from left
        int left = maxIndex + 1;

        // Both removed from right
        int right = n - minIndex;

        // One from each side
        int both = (minIndex + 1) + (n - maxIndex);

        return Math.min(left, Math.min(right, both));
    }
}
```

---

## ⏱️ Complexity

**Time Complexity:** `O(n)`

We scan the array once to find the minimum and maximum.

**Space Complexity:** `O(1)`

Only a few variables are used.

---

## 📌 Key Takeaway

Remember the problem using these **3 cases**:

```text
             Remove Min + Max
                    |
        ┌───────────┼───────────┐
        ↓           ↓           ↓
   Both Left    Both Right   One Each
        ↓           ↓           ↓
 maxIndex + 1   n-minIndex   minIndex+1
                              + n-maxIndex
        └───────────┬───────────┘
                    ↓
                 MINIMUM
```

The trick is simply to find the positions of the minimum and maximum and calculate these three possibilities.

### LeetCode

**Problem:** Removing Minimum and Maximum From Array
**LeetCode:** #2091
**Difficulty:** Medium
