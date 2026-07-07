Day 38 - Majority Element
Problem
Given an integer array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.

You may assume that the majority element always exists.

Example
Input
nums = [2,2,1,1,1,2,2]
Output
2
Approach
Use the Boyer-Moore Voting Algorithm.

Steps
Start with count = 0.

If count becomes 0, choose the current element as the new candidate.

If the current element matches the candidate, increment the count.

Otherwise, decrement the count.

The remaining candidate is the majority element.

Dry Run
Input

[2,2,1,1,1,2,2]
Element	Candidate	Count
2	2	1
2	2	2
1	2	1
1	2	0
1	1	1
2	1	0
2	2	1
Answer:

2
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Learned the Boyer-Moore Voting Algorithm.

Solved the problem without using a HashMap.

Understood how candidate elimination works.

Reinforced optimal array traversal techniques.

Takeaway
Not every counting problem needs extra memory. Sometimes, identifying the right pattern leads to an elegant constant-space solution.
