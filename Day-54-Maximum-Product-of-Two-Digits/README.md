Day 54 - Maximum Product of Two Digits
Problem

You are given a positive integer n.

Return the maximum product of any two digits in n.

Example
Input
n = 234
Output
12
Explanation

The two largest digits are 4 and 3.

4 × 3 = 12
Approach

Traverse each digit of the number using:

digit = n % 10

Then remove the last digit using:

n = n / 10

While traversing, keep track of:

largest
secondLargest

Finally:

answer = largest × secondLargest
Complexity Analysis

Time Complexity: O(d)

Where d is the number of digits in n.

Space Complexity: O(1)

Only two variables are used.

Key Learning
Extracting digits using % 10
Removing digits using / 10
Finding the two largest values in one pass
Constant-space optimization
