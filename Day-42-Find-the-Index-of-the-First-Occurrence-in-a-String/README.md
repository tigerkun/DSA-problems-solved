Day 42 - Find the Index of the First Occurrence in a String
Problem

Given two strings:

haystack
needle

Return the index of the first occurrence of needle in haystack.

If needle is not part of haystack, return -1.

Example 1
Input
haystack = "sadbutsad"
needle = "sad"
Output
0
Example 2
Input
haystack = "leetcode"
needle = "leeto"
Output
-1
Approach

Use a sliding comparison:

Traverse every possible starting index in haystack.
Compare characters one by one with needle.
If every character matches, return the current index.
If no match is found, return -1.
Dry Run

Input

haystack = "hello"
needle = "ll"

Comparison

Index 0 → "he" ❌

Index 1 → "el" ❌

Index 2 → "ll" ✅

Answer

2
Complexity Analysis

Time Complexity: O((n − m + 1) × m)

where:

n = length of haystack
m = length of needle

Space Complexity: O(1)

Key Learning
Practiced nested string traversal.
Understood substring matching.
Reinforced boundary conditions while iterating.
Built the foundation for advanced string-search algorithms like KMP and Rabin-Karp.
Takeaway

Simple brute-force approaches are often sufficient for small inputs and help build intuition before learning more advanced algorithms.
