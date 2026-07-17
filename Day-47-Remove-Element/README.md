Day 47 - Remove Element
Problem

Given an integer array nums and an integer val, remove all occurrences of val in-place.

The order of the remaining elements may be changed.

Return the number of elements in nums that are not equal to val.

Example
Input
nums = [3,2,2,3]
val = 3
Output
2

The first two elements of nums should be:

[2,2]
Approach

Use a pointer k to track the position where the next valid element should be placed.

Traverse every element in the array.
If the current element is not equal to val:
Place it at index k.
Increment k.
Return k.
Dry Run

Input:

[3,2,2,3]

Value to remove:

3

Process:

3 → Skip

2 → nums[0] = 2

2 → nums[1] = 2

3 → Skip

Final valid portion:

[2,2]

Returned length:

2
Complexity Analysis

Time Complexity: O(n)

Each element is visited once.

Space Complexity: O(1)

The array is modified in-place.

Key Learning
In-place array modification
Two-pointer technique
Efficient element filtering
Avoiding extra memory
Takeaway

Instead of actually deleting elements from an array, we can overwrite unwanted values and keep track of the valid portion using a pointer.
