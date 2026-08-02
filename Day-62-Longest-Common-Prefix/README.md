Day 62 - Longest Common Prefix
Problem
Given an array of strings, find the longest common prefix shared among all the strings.

If there is no common prefix, return an empty string.

Example
Input
strs = ["flower","flow","flight"]
Output
"fl"
Approach
Take the first string as the initial prefix.

For every other string:

Check whether it starts with the current prefix.

If not, remove the last character from the prefix.

Repeat until a common prefix is found.

The remaining prefix after processing all strings is the answer.

Dry Run
Prefix = "flower"

Compare with "flow"
→ "flow"

Compare with "flight"
→ "flo"
→ "fl"

Answer = "fl"
Complexity Analysis
Time Complexity: O(n × m)

n = number of strings

m = length of the shortest string

Space Complexity: O(1)

Key Learning
String comparison

Prefix reduction

Greedy approach

Clean iterative logic
