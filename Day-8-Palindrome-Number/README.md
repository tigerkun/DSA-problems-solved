# Day 8 - Palindrome Number

## Problem

Given an integer `x`, return `true` if `x` is a palindrome and `false` otherwise.

A palindrome number reads the same forward and backward.

### Example

Input:
121

Output:
true

Explanation:
121 reversed is 121.

---

## Approach

1. Store the original number.
2. Reverse the digits of the number.
3. Compare the reversed number with the original number.
4. If both are equal, the number is a palindrome.


---

## Complexity Analysis

- Time Complexity: O(log n)
- Space Complexity: O(1)

---

## Key Learning

- Practiced digit extraction using modulo (`%`) and division (`/`).
- Learned how to reverse an integer mathematically.
- Reinforced number manipulation techniques.

---

## Takeaway

Many number-based problems become simpler when broken down digit by digit using modulo and division operations.
