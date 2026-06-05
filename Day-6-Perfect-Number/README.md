# Day 6 - Perfect Number

## Problem

A perfect number is a positive integer that is equal to the sum of its positive divisors excluding itself.

Return `true` if the given number is perfect, otherwise return `false`.

### Example

Input:
28

Output:
true

Explanation:

Divisors of 28 (excluding itself):
1, 2, 4, 7, 14

Sum:
1 + 2 + 4 + 7 + 14 = 28

---

## Approach

Instead of checking all numbers from 1 to n-1, we only check divisors up to √n.

For every divisor `i`:
- Add `i` to the sum.
- Add its paired divisor `num / i`.
- Avoid double-counting when both divisors are the same.

This significantly reduces the number of iterations.



## Complexity Analysis

- Time Complexity: O(√n)
- Space Complexity: O(1)

---

## Key Learning

- Learned how divisor pairs work.
- Optimized brute force using square root traversal.
- Practiced mathematical problem-solving techniques.

---

## Takeaway

Many number theory problems can be optimized by observing that divisors always occur in pairs around the square root of a number.
