Day 71 - Minimum Size Subarray Sum
Problem
Given an array of positive integers and a target value, find the minimum length of a contiguous subarray whose sum is greater than or equal to the target.

If no such subarray exists, return 0.

Example
target = 7
nums = [2,3,1,2,4,3]
Output:

2
Because:

[4,3] = 7
Approach
Use a Sliding Window.

Move right to expand the window.

Add the new element to sum.

Once sum >= target, update the minimum length.

Move left forward to make the window smaller.

Continue until the entire array is processed.

Because all numbers are positive, shrinking the window always decreases the sum, making Sliding Window applicable.

Complexity
Time: O(n)

Space: O(1)

Each element is added and removed from the window at most once.
