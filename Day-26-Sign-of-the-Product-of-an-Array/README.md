Day 26 - Sign of the Product of an Array
Problem
Given an integer array nums, return:

1 if the product of all elements is positive.

-1 if the product is negative.

0 if the product is zero.

Note: Do not actually compute the product, as it may overflow.

Example 1
Input

nums = [-1,-2,-3,-4,3,2,1]
Output

1
Example 2
Input

nums = [1,5,0,2,-3]
Output

0
Example 3
Input

nums = [-1,1,-1,1,-1]
Output

-1
Approach
The sign of a product depends only on:

Whether any element is 0.

Whether the number of negative values is even or odd.

Steps
Initialize sign = 1.

Traverse the array.

If any element is 0, return 0.

For every negative number, flip the sign.

Return the final sign.

Dry Run
Input:

[-1, -2, 3, 4]
Initial:

sign = 1
After -1

sign = -1
After -2

sign = 1
After 3 and 4

sign = 1
Output:

1
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Solved the problem without calculating the actual product.

Avoided integer overflow using mathematical observation.

Reinforced conditional logic and array traversal.

Takeaway
Many array problems become simpler when you identify the property you're asked to return instead of computing the entire result.
