Day 41 - Merge Strings Alternately
Problem

You are given two strings word1 and word2.

Merge the strings by adding letters in alternating order, starting with word1.

If one string is longer than the other, append the remaining letters to the end.

Example 1
Input
word1 = "abc"
word2 = "pqr"
Output
"apbqcr"
Example 2
Input
word1 = "ab"
word2 = "pqrs"
Output
"apbqrs"
Approach

Use two pointers:

i traverses word1
j traverses word2
Steps
Append one character from word1.
Append one character from word2.
Continue until one string ends.
Append the remaining characters from the longer string.
Dry Run

Input

word1 = "abc"
word2 = "pqrs"

Steps

Result = ""

a → "a"
p → "ap"
b → "apb"
q → "apbq"
c → "apbqc"

word1 ends

Append remaining:
r → "apbqcr"
s → "apbqcrs"

Final Output

apbqcrs
Complexity Analysis

Time Complexity: O(n + m)

Each character from both strings is visited exactly once.

Space Complexity: O(n + m)

The StringBuilder stores the merged string.
Key Learning
Practiced the Two Pointer technique.
Improved string traversal skills.
Learned efficient string construction using StringBuilder.
Handled unequal string lengths cleanly.
Takeaway

Two pointers aren't limited to arrays—they're equally effective for solving string manipulation problems efficiently.
