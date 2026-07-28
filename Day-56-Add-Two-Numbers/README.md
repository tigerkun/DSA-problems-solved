Day 56 - Add Two Numbers
Problem

You are given two non-empty linked lists representing two non-negative integers.

The digits are stored in reverse order, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

Example
Input
l1 = [2,4,3]
l2 = [5,6,4]
Output
[7,0,8]
Explanation
342
+
465
----
807

Stored in reverse order:

[7,0,8]
Approach

We simulate the addition exactly as we do by hand.

Traverse both linked lists together.
Add the current digits along with any carry.
Create a new node with sum % 10.
Update the carry as sum / 10.
Continue until both lists and the carry are exhausted.

A dummy node simplifies building the result list.

Dry Run

Input

l1 = [2,4,3]
l2 = [5,6,4]
l1	l2	Carry	Sum	Node
2	5	0	7	7
4	6	0	10	0
3	4	1	8	8

Result

[7,0,8]
Complexity Analysis

Time Complexity: O(max(m, n))

Traverse each linked list once.

Space Complexity: O(max(m, n))

A new linked list is created to store the answer.
Key Learning
Linked List traversal
Dummy node technique
Carry handling
Simulating arithmetic operations
Building a new linked list
Takeaway

Using a dummy node makes linked list construction much cleaner by avoiding special handling for the first node.
