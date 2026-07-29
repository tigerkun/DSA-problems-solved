Day 58 - Sqrt(x)
Problem

Given a non-negative integer x, return the integer square root of x.

The returned integer should be rounded down to the nearest integer.

You must not use any built-in exponent or square root functions.

Example 1
Input
x = 4
Output
2
Example 2
Input
x = 8
Output
2
Explanation
√8 ≈ 2.828

The integer part is:

2
Approach

Since the answer lies between 1 and x / 2, use Binary Search.

Find the middle value.
Compute mid × mid.
If it equals x, return mid.
If it is smaller, search the right half.
Otherwise, search the left half.
Keep track of the last valid answer.

Using (long) prevents integer overflow when calculating mid * mid.

Dry Run

Input

x = 8
Left	Right	Mid	Mid²	Action
1	4	2	4	Search Right
3	4	3	9	Search Left

Answer:

2
Complexity Analysis

Time Complexity: O(log n)

Binary Search halves the search space each iteration.

Space Complexity: O(1)

Only a few variables are used.

Key Learning
Binary Search on answer
Preventing integer overflow
Efficient searching
Finding floor values
Takeaway

When the search space is sorted or monotonic, Binary Search often provides a much more efficient solution than checking every possibility.
