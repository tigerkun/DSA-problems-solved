Day 33 - Valid Parentheses
Problem
Given a string containing only:

( ) { } [ ]
Determine whether the input string is valid.

Example
Input

()[]{}
Output

true
Approach
Use a Stack.

Push every opening bracket.

For every closing bracket:

Stack must not be empty.

Top element must match.

At the end, the stack should be empty.

Dry Run
Input

([{}])
Operations

Push (
Push [
Push {

Encounter }

Pop {

Encounter ]

Pop [

Encounter )

Pop (
Stack becomes empty.

Answer = true

Complexity
Time: O(n)

Space: O(n)

Key Learning
Stack is ideal for nested structures.

LIFO naturally matches bracket pairing.

Takeaway
Whenever a problem involves matching nested elements, think Stack first.
