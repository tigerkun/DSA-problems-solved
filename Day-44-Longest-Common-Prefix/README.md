Day 44 - Longest Common Prefix
Problem

Write a function to find the longest common prefix among an array of strings.

If there is no common prefix, return an empty string.

Example 1
Input
strs = ["flower","flow","flight"]
Output
"fl"
Example 2
Input
strs = ["dog","racecar","car"]
Output
""
Approach

Use the first string as the initial prefix.

For every other string:

Check if it starts with the current prefix.
If not, remove the last character from the prefix.
Repeat until a common prefix is found or the prefix becomes empty.
Dry Run

Input

["flower","flow","flight"]

Initial Prefix

flower

Compare with "flow"

flower ❌

flowe ❌

flow ✅

Current Prefix

flow

Compare with "flight"

flow ❌

flo ❌

fl ✅

Final Answer

fl
Complexity Analysis

Time Complexity: O(n × m)

n = number of strings
m = average length of the strings

Space Complexity: O(1)

Key Learning
Prefix comparison.
String traversal.
Iterative string reduction.
Efficient string matching without extra data structures.
Takeaway

Using one string as a reference can simplify many string comparison problems and avoid unnecessary computations.
