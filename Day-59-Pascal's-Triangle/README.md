Day 59 - Pascal's Triangle
Problem

Given an integer numRows, return the first numRows of Pascal's Triangle.

In Pascal's Triangle:

The first and last element of every row is 1.
Every other element is the sum of the two numbers directly above it.
Example
Input
numRows = 5
Output
[
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
]
Approach
Create an empty list to store all rows.
Iterate from row 0 to numRows - 1.
For every row:
First and last elements are always 1.
Middle elements are obtained by adding the two elements above them.
Add the completed row to the triangle.
Dry Run

For numRows = 5:

Row 0 → [1]

Row 1 → [1,1]

Row 2 → [1,2,1]

Row 3 → [1,3,3,1]

Row 4 → [1,4,6,4,1]
Complexity Analysis

Time Complexity: O(n²)

Every element of the triangle is computed exactly once.

Space Complexity: O(n²)

The output triangle stores all generated rows.

Key Learning
Dynamic Programming basics
Building a solution from previous results
Nested loops
Working with 2D lists
Takeaway

Many Dynamic Programming problems are solved by recognizing that the current state depends on previously computed states. Pascal's Triangle is a classic example of this idea.
