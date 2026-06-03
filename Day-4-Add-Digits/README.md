# Day 4 - Add Digits

## Problem
Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it

---

## Approach

Instead of repeatedly summing digits using loops, this solution uses the **Digital Root** property.

For any positive integer:

digitalRoot = 1 + (num - 1) % 9

Special Case:
- If `num = 0`, the answer is `0`.

This allows us to compute the result directly in constant time without any loops or recursion.

---
    
