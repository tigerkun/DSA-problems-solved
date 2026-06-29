Day 29 - Sum of Square Numbers
Problem

Given a non-negative integer c, determine whether there exist two integers

a² + b² = c

Return true if possible.

Example

Input

5

Output

true

Explanation

1² + 2² = 5
Approach

Use two pointers.

Left starts at 0
Right starts at √c

If the sum is

smaller → increase left
larger → decrease right
equal → answer found
Complexity

Time: O(√n)

Space: O(1)

Key Learning
Two Pointer Technique.
Perfect squares.
Avoid brute force.
Takeaway

Two pointers aren't limited to arrays—they're powerful whenever a search space is ordered.
