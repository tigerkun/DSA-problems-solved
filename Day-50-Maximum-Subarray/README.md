Day 50 - Maximum Subarray
Problem

Given an integer array nums, find the subarray with the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example
Input
[-2,1,-3,4,-1,2,1,-5,4]
Output
6
Explanation

The subarray:

[4,-1,2,1]

has the largest sum:

4 + (-1) + 2 + 1 = 6
Approach — Kadane's Algorithm

At every element, decide:

Should we start a new subarray from the current element?
Or should we add the current element to the existing subarray?

The formula is:

currentSum = max(current element, currentSum + current element)

Then we keep track of the maximum sum found so far.

Dry Run

Input:

[-2,1,-3,4,-1,2,1,-5,4]

The best subarray found is:

[4,-1,2,1]

Its sum is:

6
Complexity Analysis

Time Complexity: O(n)

Each element is visited once.

Space Complexity: O(1)

Only two variables are used.

Key Learning
Kadane's Algorithm
Dynamic Programming
Maximum subarray problems
Making optimal decisions at every step
Takeaway

A problem that looks like it requires checking every possible subarray can be solved in a single pass by keeping track of the best result so far.
