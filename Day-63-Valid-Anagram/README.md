Day 63 - Valid Anagram
Problem

Given two strings s and t, return true if t is an anagram of s, otherwise return false.

An anagram is formed by rearranging the letters of one string to create another, using all the original letters exactly once.

Example
Input
s = "anagram"
t = "nagaram"
Output
true
Approach

Instead of sorting both strings, maintain a frequency array of size 26.

Increment the count for each character in s.
Decrement the count for each character in t.
If every frequency becomes 0, both strings contain exactly the same characters.
Dry Run
s = "rat"
t = "tar"

Count after processing:

r → 0
a → 0
t → 0

All frequencies are zero.

Answer = true
Complexity Analysis

Time Complexity: O(n)

Single traversal of both strings.

Space Complexity: O(1)

Only a fixed-size array of 26 elements is used.

Key Learning
Frequency counting
Character arrays
Optimizing over sorting
Constant-space solutions
