Day 51 - Maximum Product Subarray
Problem

Given an integer array nums, find a contiguous subarray that has the largest product and return the product.

Example
Input
[2,3,-2,4]
Output
6
Explanation

The subarray:

[2,3]

has the maximum product:

2 × 3 = 6
Approach

Unlike the Maximum Subarray problem, we must track both:

maxProduct
minProduct

Why?

Because when multiplying by a negative number:

negative × negative = positive

So the current minimum product can suddenly become the maximum product.

For every element:

If it is negative, swap the maximum and minimum products.
Calculate the new maximum product.
Calculate the new minimum product.
Update the overall answer.
Example of the Key Idea
[-2, 3, -4]

The negative values can turn a negative product into a positive one:

(-2) × 3 × (-4) = 24

Therefore, ignoring the minimum product would produce an incorrect result.

Complexity Analysis

Time Complexity: O(n)

Each element is processed once.

Space Complexity: O(1)

Only a few variables are used.

Key Learning
Dynamic Programming
Tracking maximum and minimum values
Handling negative numbers
Understanding how the current result depends on the previous result
Takeaway

When a problem involves multiplication and negative values, tracking only the maximum is not enough. Sometimes the minimum value can become the maximum in the next step.
