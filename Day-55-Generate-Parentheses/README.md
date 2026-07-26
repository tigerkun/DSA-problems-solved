Day 55 - Generate Parentheses
Problem
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example
Input
n = 3
Output
["((()))","(()())","(())()","()(())","()()()"]
Approach — Backtracking
We build the parentheses string one character at a time.

There are two rules:

1. Add an Opening Parenthesis
We can add ( as long as:

open < n
2. Add a Closing Parenthesis
We can add ) only when:

close < open
This prevents invalid combinations such as:

")("
or:

"())("
Example: n = 2
The process generates:

((
Then:

(())
()()
Final result:

["(())", "()()"]
Complexity Analysis
Time Complexity: O(4ⁿ / √n)

This is related to the number of valid combinations, which is the nth Catalan number.

Space Complexity: O(n)

The recursion depth is at most 2n.

Key Learning
Backtracking

Recursion

Building solutions step by step

Validating choices before making them

Pruning invalid possibilities

Takeaway
Backtracking explores possible choices, but the conditions open < n and close < open prevent invalid paths from being explored.
