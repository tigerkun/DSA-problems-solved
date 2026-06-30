Day 30 - Two Sum
Problem
Given an integer array nums and an integer target, return the indices of the two numbers whose sum equals the target.

Assume that exactly one solution exists.

Example
Input

nums = [2,7,11,15]
target = 9
Output

[0,1]
Explanation

nums[0] + nums[1] = 2 + 7 = 9
Approach
Instead of checking every pair (O(n²)),

Store each visited number inside a HashMap.

For every element:

Compute its complement.

If the complement already exists in the map, return the indices.

Otherwise, store the current number.

This allows solving the problem in a single traversal.

Dry Run
Input

nums = [2,7,11,15]
target = 9
Iteration 1

Current = 2
Complement = 7

Map:
2 → 0
Iteration 2

Current = 7
Complement = 2

2 already exists.

Answer = [0,1]
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(n)

Key Learning
Learned the HashMap lookup pattern.

Reduced quadratic time to linear time.

Practiced complement searching.

Strengthened understanding of time-space tradeoffs.

Takeaway
Hashing is one of the most powerful techniques in DSA. When you need fast lookups, a HashMap often transforms an inefficient solution into an optimal one.
