Day 61 - Merge Sorted Array
Problem
You are given two sorted integer arrays:

nums1 of size m + n, where the first m elements are valid.

nums2 of size n.

Merge nums2 into nums1 so that nums1 becomes one sorted array.

Example
Input
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3
Output
[1,2,2,3,5,6]
Approach
Instead of merging from the beginning (which would overwrite values), merge from the end.

Maintain three pointers:

i → last valid element in nums1

j → last element in nums2

k → last position in nums1

Compare nums1[i] and nums2[j]:

Place the larger one at nums1[k].

Move the corresponding pointer backward.

Decrement k.

If any elements remain in nums2, copy them into nums1.

Dry Run
Input

nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
Process:

6 → last position
5 → next position
3 → next
2 → next
2 → next
1 → first
Final array:

[1,2,2,3,5,6]
Complexity Analysis
Time Complexity: O(m + n)

Each element is processed once.

Space Complexity: O(1)

No extra array is used.

Key Learning
Two Pointer technique

In-place array manipulation

Merging sorted arrays efficiently

Working backwards to avoid overwriting data

Takeaway
When modifying an array in-place, consider processing it from the end if writing from the front could overwrite values that are still needed.
