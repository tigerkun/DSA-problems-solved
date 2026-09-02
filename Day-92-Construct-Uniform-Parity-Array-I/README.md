# Day 92 - Construct Uniform Parity Array I

## 🚀 LeetCode #3875

### Problem

Given an integer array `nums`, construct an array in which all elements have the **same parity**.

An integer is:

* **Even** if `num % 2 == 0`
* **Odd** if `num % 2 != 0`

The goal is to make the parity of all elements uniform.

---

## 💡 Key Idea

The important concept in this problem is **parity**.

For every number:

```text
num % 2 == 0 → Even
num % 2 != 0 → Odd
```

We can traverse the array and check whether the elements contain both even and odd numbers.

If all elements already have the same parity, no changes are needed.

---

## 🔍 Example

Consider:

```text
nums = [1, 3, 5, 2]
```

Parity:

```text
1 → Odd
3 → Odd
5 → Odd
2 → Even
```

The array contains both parities.

We can make the odd numbers even:

```text
1 → 0
3 → 2
5 → 4
2 → 2
```

Result:

```text
[0, 2, 4, 2]
```

Now every element is even.

---

## 🧠 Approach

### Step 1

Traverse the array and check:

```text
Has an even number?
Has an odd number?
```

### Step 2

If only one type exists:

```text
All Even
OR
All Odd
```

return the array as it is.

### Step 3

If both types exist, make the odd elements even.

```text
odd → odd - 1
```

For example:

```text
7 → 6
9 → 8
11 → 10
```

Now all elements have even parity.

---

## 💻 Java Solution

```java
class Solution {
    public int[] uniformArray(int[] nums) {

        boolean hasEven = false;
        boolean hasOdd = false;

        for (int num : nums) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // Already uniform
        if (!hasEven || !hasOdd) {
            return nums;
        }

        // Make all elements even
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i]--;
            }
        }

        return nums;
    }
}
```

---

## ⏱️ Complexity

**Time Complexity:** `O(n)`

We traverse the array a constant number of times.

**Space Complexity:** `O(1)` extra space.

The returned array is the input array itself.

---

## 📌 Key Takeaway

Remember:

```text
num % 2 == 0
      ↓
    EVEN

num % 2 != 0
      ↓
     ODD
```

Then:

```text
Check parity
     ↓
Already same?
   ↙       ↘
 YES       NO
  ↓         ↓
Return    Make odd
          numbers even
```

### LeetCode

**Problem:** Construct Uniform Parity Array I
**LeetCode:** #3875
