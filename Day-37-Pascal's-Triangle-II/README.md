Day 37 - Pascal's Triangle II
Problem

Given an integer rowIndex, return the rowIndexth row of Pascal's Triangle.

Example

Input

rowIndex = 3

Output

[1,3,3,1]
Approach

Instead of generating all previous rows, use the mathematical relationship:

Next = Current × (rowIndex − i) / (i + 1)

This computes each element directly.

Dry Run

Input

rowIndex = 4

Generated row

[1,4,6,4,1]
Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(n)
Key Learning
Pascal's Triangle properties
Combinatorics
Efficient row generation
Takeaway

Many seemingly iterative problems can be solved directly using mathematical relationships.
