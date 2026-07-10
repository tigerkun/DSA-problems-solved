Day 39 - Intersection of Two Arrays II
Problem
Given two integer arrays nums1 and nums2, return their intersection.

Each element in the result should appear as many times as it appears in both arrays.

Example
Input

nums1 = [1,2,2,1]
nums2 = [2,2]
Output

[2,2]
Approach
Store frequencies of nums1 in a HashMap.

Traverse nums2.

If an element exists with positive frequency:

Add it to the answer.

Decrease its frequency.

Complexity
Time: O(n + m)

Space: O(min(n, m))

Key Learning
Frequency counting

HashMap operations

Array intersection

Takeaway
HashMaps simplify frequency-based problems and eliminate unnecessary nested loops.
