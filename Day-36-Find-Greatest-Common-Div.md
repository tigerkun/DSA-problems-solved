Day 36 - Find Greatest Common Divisor of Array
Problem

Given an integer array nums, return the greatest common divisor (GCD) of the smallest and largest numbers in the array.

Example

Input

nums = [2,5,6,9,10]

Output

2
Approach
Find the minimum and maximum elements.
Apply Euclid's Algorithm to compute their GCD.
Complexity Analysis
Time Complexity: O(n + log(max))
Space Complexity: O(1)
Key Learning
Euclid's Algorithm
Efficient array traversal
Mathematical optimization
Takeaway

Sometimes the entire array can be summarized by just two values—the minimum and maximum.
