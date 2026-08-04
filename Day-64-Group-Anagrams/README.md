Day 64 - Group Anagrams
Problem

Given an array of strings strs, group the anagrams together.

Two strings are anagrams if they contain the same characters with the same frequencies.

Example
Input
strs = ["eat","tea","tan","ate","nat","bat"]
Output
[
 ["eat","tea","ate"],
 ["tan","nat"],
 ["bat"]
]
Approach

For every string:

Convert it into a character array.
Sort the characters.
Use the sorted string as the key in a HashMap.
Store all strings with the same key in the same list.

Finally, return all grouped lists.

Dry Run
eat → aet
tea → aet
ate → aet

tan → ant
nat → ant

bat → abt

HashMap

aet → [eat, tea, ate]
ant → [tan, nat]
abt → [bat]
Complexity Analysis

Time Complexity: O(n × k log k)

Sorting each string takes O(k log k).

Space Complexity: O(n × k)

Required for storing the grouped strings.
Key Learning
HashMap
String sorting
Grouping by keys
Efficient data organization


A well-designed key can transform a complex grouping problem into a straightforward HashMap solution.

Git Commit Message
