Day 46 - Length of Last Word
Problem

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example

Input:

"Hello World"

Output:

5
Approach

Traverse the string from right to left.

Skip any trailing spaces.
Start counting characters once the last word is found.
Stop when a space or the beginning of the string is reached.
Dry Run

Input:

"Hello World   "

Steps:

Skip trailing spaces
        ↓
"Hello World"
          ↑
Count: d → l → r → o → W

Length of last word:

5
Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Reverse string traversal
Handling trailing whitespace
Efficient string processing
Using two simple loops for clean logic
Takeaway

Sometimes starting from the end of a string makes the problem much simpler, especially when the target is the last word or element.
