Day 65 - 3Sum
Problem

Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] == 0

The solution must not contain duplicate triplets.

Example
Input
nums = [-1,0,1,2,-1,-4]
Output
[
 [-1,-1,2],
 [-1,0,1]
]
Approach
Sort the array.
Fix one element.
Use two pointers (left and right) to search for the remaining two numbers.
Skip duplicate values for the fixed element and both pointers to avoid duplicate triplets.
Dry Run

Sorted array

[-4,-1,-1,0,1,2]

Fix -1

left = -1
right = 2

Sum = 0

Triplet = [-1,-1,2]

Move pointers while skipping duplicates.

Next triplet:

[-1,0,1]
Complexity Analysis

Time Complexity: O(n²)

Sorting: O(n log n)
Two-pointer search for each element: O(n²)

Space Complexity: O(1) (excluding output)

Key Learning
Sorting before processing
Two Pointer technique
Eliminating duplicate results
Optimizing from O(n³) to O(n²)
Takeaway

Sorting often transforms a brute-force solution into a much more efficient one. Combined with the Two Pointer technique, it is a powerful strategy for solving array problems.
