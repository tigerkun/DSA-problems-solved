Day 67 - Search in Rotated Sorted Array
Problem
Given a rotated sorted array nums and an integer target, return the index of target. If it does not exist, return -1.

You must solve the problem in O(log n) time.

Example
Input
nums = [4,5,6,7,0,1,2]
target = 0
Output
4
Approach
Apply Binary Search.

At each step, determine which half of the array is sorted.

Check whether the target lies inside the sorted half.

Continue searching only that half.

Repeat until the target is found or the search space becomes empty.

Dry Run
nums = [4,5,6,7,0,1,2]

left = 0
right = 6
mid = 3 (7)

Left half is sorted.

Target (0) is not in left half.

Search right half.

mid = 5 (1)

Right half is sorted.

Target is on the left.

mid = 4

Found target.
Complexity Analysis
Time Complexity: O(log n)

Binary Search halves the search space in every iteration.

Space Complexity: O(1)

No extra space is used.

Key Learning
Binary Search

Rotated Arrays

Divide and Conquer

Identifying Sorted Halves

Takeaway
Even after rotation, one side of the array always remains sorted. Identifying that sorted half is the key to maintaining Binary Search efficiency.
