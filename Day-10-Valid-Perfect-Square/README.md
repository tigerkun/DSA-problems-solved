# Day 10 - Valid Perfect Square

## Problem

Given a positive integer `num`, return `true` if `num` is a perfect square and `false` otherwise.

Do not use any built-in library function such as `sqrt()`.

### Example

Input:
16

Output:
true

Explanation:
4 × 4 = 16

---

## Approach

Used Binary Search.

1. Search for a number whose square equals `num`.
2. If `mid × mid == num`, return true.
3. If the square is smaller, search the right half.
4. If the square is larger, search the left half.
5. If no such number exists, return false.

Using `long` prevents integer overflow when calculating `mid * mid`.

---

## Complexity Analysis

- Time Complexity: O(log n)
- Space Complexity: O(1)

---

## Key Learning

- Practiced Binary Search on answer space.
- Learned how to avoid integer overflow using `long`.
- Reinforced divide-and-conquer problem-solving.

---

## Takeaway

Binary Search isn't limited to sorted arrays—it can also be applied to search for a valid answer within a numerical range.
