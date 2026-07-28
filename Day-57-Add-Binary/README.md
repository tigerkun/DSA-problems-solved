Day 57 - Add Binary
Problem

Given two binary strings a and b, return their sum as a binary string.

Example 1
Input
a = "11"
b = "1"
Output
"100"
Example 2
Input
a = "1010"
b = "1011"
Output
"10101"
Approach

We simulate binary addition exactly as we do by hand.

Start from the last character of both strings.
Add the current bits and the carry.
Append sum % 2 to the answer.
Update the carry using sum / 2.
Continue until both strings and the carry are exhausted.
Reverse the result since it was built from right to left.
Dry Run

Input

a = "1010"
b = "1011"
Bit from a	Bit from b	Carry	Sum	Output Bit
0	1	0	1	1
1	1	0	2	0
0	0	1	1	1
1	1	0	2	0
-	-	1	1	1

Result before reversing:

10101

Final Answer:

10101
Complexity Analysis

Time Complexity: O(max(m, n))

Each character is processed exactly once.

Space Complexity: O(max(m, n))

The StringBuilder stores the resulting binary string.
Key Learning
Binary arithmetic
String traversal from right to left
Carry handling
Efficient string construction using StringBuilder
Takeaway

Many addition problems—whether decimal or binary—follow the same pattern: process digits from right to left while maintaining a carry.
