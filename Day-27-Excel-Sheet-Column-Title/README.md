Day 27 - Excel Sheet Column Title
Problem
Given an integer representing an Excel column number, return its corresponding column title.

Example:

1  -> A
28 -> AB
701 -> ZY
Approach
Treat the number like Base-26.

Since Excel columns begin at 1 instead of 0, subtract 1 before taking the remainder.

Repeat until the number becomes 0.

Complexity
Time: O(log₂₆ n)

Space: O(1)

Key Learning
Reverse Base-26 conversion.

Character arithmetic.

StringBuilder usage.
