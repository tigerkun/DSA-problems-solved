Day 49 - Search Insert Position
Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found.

If the target is not found, return the index where it would be inserted to maintain the sorted order.

Example 1
Input
nums = [1,3,5,6]
target = 5
Output
2
Example 2
Input
nums = [1,3,5,6]
target = 2
Output
1
Approach

Use Binary Search.

Set left to the beginning of the array.
Set right to the end.
Calculate the middle index.
If the middle element is the target, return its index.
If the middle element is smaller, search the right half.
Otherwise, search the left half.
When the loop ends, left represents the correct insertion position.
Why Return left?

When the target is not found, the search ends when:

left > right

At that point, left is exactly the position where the target can be inserted while maintaining sorted order.

Complexity Analysis

Time Complexity: O(log n)

Space Complexity: O(1)

Key Learning
Binary Search
Dividing the search space efficiently
Understanding insertion positions
Using left + (right - left) / 2 to calculate the middle safely
Takeaway

When an array is sorted, always consider Binary Search before using a linear search.
