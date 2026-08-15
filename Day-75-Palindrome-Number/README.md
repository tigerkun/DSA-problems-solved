# Day 75 - Palindrome Number

## 🚀 LeetCode #9

### Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

### Examples

#### Example 1

**Input:**

```text
x = 121
```

**Output:**

```text
true
```

**Explanation:**

```text
121 → 121
```

The number reads the same from both directions.

#### Example 2

**Input:**

```text
x = -121
```

**Output:**

```text
false
```

**Explanation:**

```text
-121 → 121-
```

It does not read the same forward and backward.

#### Example 3

**Input:**

```text
x = 10
```

**Output:**

```text
false
```

### 💡 Approach

The number is reversed mathematically without converting it into a string.

For every digit:

1. Extract the last digit using `x % 10`.
2. Add the digit to the reversed number.
3. Remove the last digit using `x / 10`.
4. Continue until the number becomes `0`.
5. Compare the reversed number with the original number.

Negative numbers are immediately considered non-palindromes.

### 🔍 Example Walkthrough

For:

```text
x = 121
```

Initially:

```text
reverse = 0
```

First digit:

```text
121 % 10 = 1
reverse = 0 × 10 + 1 = 1
x = 121 / 10 = 12
```

Second digit:

```text
12 % 10 = 2
reverse = 1 × 10 + 2 = 12
x = 12 / 10 = 1
```

Third digit:

```text
1 % 10 = 1
reverse = 12 × 10 + 1 = 121
x = 1 / 10 = 0
```

Now:

```text
Original = 121
Reverse  = 121
```

Therefore:

```text
121 == 121 → true
```

### 💻 Java Solution

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int original = x;
        int reverse = 0;

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return original == reverse;
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(log n)`
* **Space Complexity:** `O(1)`

### 📌 Key Takeaway

The key idea is:

```text
Original Number
       ↓
Extract digits using % 10
       ↓
Build reversed number
       ↓
Compare with original
       ↓
Same → Palindrome
Different → Not a Palindrome
```

### 🔗 LeetCode

**Problem:** Palindrome Number
**LeetCode:** #9
**Difficulty:** Easy
