Day 43 - Valid Anagram
Problem

Given two strings s and t, return true if t is an anagram of s, otherwise return false.

An anagram is a word formed by rearranging the letters of another word using all the original letters exactly once.

Example 1
Input
s = "anagram"
t = "nagaram"
Output
true
Example 2
Input
s = "rat"
t = "car"
Output
false
Approach

Since the problem only contains lowercase English letters:

Create an integer array of size 26.
Increase the count for characters in s.
Decrease the count for characters in t.
If every count becomes zero, the strings are anagrams.

This avoids sorting and achieves linear time.

Dry Run

Input

s = "eat"
t = "tea"

Frequency changes

e +1
a +1
t +1

t -1
e -1
a -1

Final Frequency Array

All values = 0

Answer

true
Complexity Analysis

Time Complexity: O(n)

Traverse both strings once.

Space Complexity: O(1)

The frequency array always has 26 elements.

Key Learning
Frequency counting.
Character indexing.
Constant-space optimization.
Avoiding unnecessary sorting.
Takeaway

Counting frequencies is often more efficient than sorting when the character set is fixed.
