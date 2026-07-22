Day 52 - Contains Duplicate II
Problem

Given an integer array nums and an integer k, return true if there are two distinct indices i and j such that:

nums[i] == nums[j]

and:

abs(i - j) <= k

Otherwise, return false.

Example 1
Input
nums = [1,2,3,1]
k = 3
Output
true

The value 1 appears at indices 0 and 3.

|0 - 3| = 3

Since 3 <= k, the answer is true.

Example 2
Input
nums = [1,0,1,1]
k = 1
Output
true

The value 1 appears at indices 2 and 3.

|2 - 3| = 1
Approach

Use a HashMap to store the most recent index of each number.

For every element:

Check if the number already exists in the map.
If it does, calculate the distance between the current index and its previous index.
If the distance is less than or equal to k, return true.
Update the number's index in the map.

We store the latest index because it gives the closest possible duplicate occurrence.

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(n)
