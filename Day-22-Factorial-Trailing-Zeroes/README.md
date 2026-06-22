Day 22 - Factorial Trailing Zeroes
Problem
Given an integer n, return the number of trailing zeroes in n!.

Example
Input:

n = 5
Output:

1
Explanation:

5! = 120
There is one trailing zero.

Approach
A trailing zero is produced by:

10 = 2 × 5
In a factorial, factors of 2 are abundant, so the number of trailing zeroes depends on the number of factors of 5.

Count:

Multiples of 5 contribute one factor of 5.

Multiples of 25 contribute an extra factor of 5.

Multiples of 125 contribute yet another factor of 5.

Formula:

n/5 + n/25 + n/125 + ...

Complexity Analysis
Time Complexity: O(log₅ n)
Space Complexity: O(1)
