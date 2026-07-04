Day 35 - Evaluate Reverse Polish Notation
Problem
You are given an array of strings representing an arithmetic expression in Reverse Polish Notation (Postfix Notation).

Evaluate the expression and return its value.

The valid operators are:

+

-

*

/

Division truncates toward zero.

Example 1
Input
tokens = ["2","1","+","3","*"]
Output
9
Explanation
(2 + 1) × 3 = 9
Example 2
Input
tokens = ["4","13","5","/","+"]
Output
6
Explanation
13 / 5 = 2

4 + 2 = 6
Approach
Use a Stack.

If the token is a number → push it onto the stack.

If the token is an operator:

Pop the top two numbers.

Perform the operation.

Push the result back.

At the end, the stack contains exactly one element—the final answer.

Dry Run
Input

["2","1","+","3","*"]
Operations

Push 2

Stack:
[2]

Push 1

Stack:
[2,1]

Encounter +

Pop 1 and 2

2 + 1 = 3

Stack:
[3]

Push 3

Stack:
[3,3]

Encounter *

3 × 3 = 9

Stack:
[9]
Final Answer

9
Complexity Analysis
Time Complexity: O(n)

Each token is processed exactly once.

Space Complexity: O(n)

The stack stores operands during evaluation.

Key Learning
Practiced Stack-based expression evaluation.

Learned Reverse Polish (Postfix) notation.

Reinforced operator handling using switch.

Understood why operand order matters for subtraction and division.

Takeaway
Reverse Polish Notation removes the need for parentheses by changing the order of operations, making a stack the ideal data structure for evaluation.
