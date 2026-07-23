Day 53 - Isomorphic Strings
Problem
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

Each character must map to exactly one character, and no two different characters can map to the same character.

Example 1
Input
s = "egg"
t = "add"
Output
true
Mapping:

e → a
g → d
Example 2
Input
s = "foo"
t = "bar"
Output
false
Because the character o would need to map to two different characters.

Approach
Use two mappings:

Mapping 1
s → t
Mapping 2
t → s
Both are required to ensure the mapping works in both directions.

For example:

s = "ab"
t = "cc"
Both a and b would map to c, which is not allowed.

Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)

Since the character set is limited, the extra space is bounded.

Key Learning
HashMap mapping

One-to-one relationships

Pattern matching

Bidirectional validation

Takeaway
When checking whether two sequences follow the same pattern, it is important to validate the mapping in both directions.
