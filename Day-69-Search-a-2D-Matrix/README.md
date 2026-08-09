Day 69 - Search a 2D Matrix
Problem

Given an m × n matrix where:

Each row is sorted in ascending order.
The first element of each row is greater than the last element of the previous row.

Return true if the target exists, otherwise false.

Example
Input:

matrix = [
  [1,3,5,7],
  [10,11,16,20],
  [23,30,34,60]
]

target = 3

Output:

true
Approach

Treat the matrix as a virtual 1D sorted array.

For every Binary Search index:

row = mid / cols
col = mid % cols

Then compare that matrix value with the target.

Complexity
Time: O(log(m × n))
Space: O(1)
Key Learning

A 2D problem doesn't always require a 2D approach. Sometimes changing how we represent the data lets us apply a simpler and more efficient algorithm.
