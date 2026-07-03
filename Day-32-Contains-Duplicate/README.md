Day 32 - Contains Duplicate
Problem

Given an integer array nums, return true if any value appears at least twice, otherwise return false.

Example

Input

nums = [1,2,3,1]

Output

true
Approach

Traverse the array while storing visited numbers in a HashSet.

If a number already exists in the set → duplicate found.
Otherwise, add it.
Complexity

Time: O(n)

Space: O(n)

Key Learning
HashSet provides O(1) average lookup.
Eliminates nested loops.
Takeaway

Hash-based data structures are often the quickest way to solve lookup problems efficiently.
