Day 49 - Climbing Stairs
Problem

You are climbing a staircase with n steps.

Each time, you can climb either:

1 step
2 steps

Return the number of distinct ways to reach the top.

Example
Input
n = 3
Output
3
Explanation

The possible ways are:

1 + 1 + 1
1 + 2
2 + 1
Approach

To reach step n, the last move can either be:

A jump from step n - 1
A jump from step n - 2

Therefore:

ways(n) = ways(n - 1) + ways(n - 2)

This creates a Fibonacci-like pattern.

Instead of storing an entire array, we only keep the previous two values.

Dry Run

For n = 5:

ways(1) = 1
ways(2) = 2
ways(3) = 3
ways(4) = 5
ways(5) = 8

Answer:

8
Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Dynamic Programming fundamentals
Recognizing overlapping subproblems
Fibonacci-like patterns
Space optimization
Takeaway

Many Dynamic Programming problems can be optimized by keeping only the previous few results instead of storing the entire solution table.
