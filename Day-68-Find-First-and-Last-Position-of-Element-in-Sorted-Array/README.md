Day 68 - Find First and Last Position of Element in Sorted Array
Problem

Given a sorted array, find the starting and ending position of a given target.

If the target doesn't exist, return:

[-1, -1]
Approach

Use Binary Search twice:

Find the first occurrence.
Find the last occurrence.

When the target is found:

For the first position → continue searching left.
For the last position → continue searching right.
Complexity
Time: O(log n)
Space: O(1)
Key Learning

Binary Search can be modified to find boundaries, not just an exact value.
