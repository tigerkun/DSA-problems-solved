Day 28 - Delete Node in a Linked List
Problem
Delete a node from a linked list.

You are not given the head of the list.

Instead, you're given the node to delete.

Example
Input

4 -> 5 -> 1 -> 9

Delete: 5
Output

4 -> 1 -> 9
Approach
Instead of deleting the node,

Copy the next node's value.

Skip the next node.

The current node effectively becomes the next node.

Complexity
Time: O(1)

Space: O(1)

Key Learning
Linked lists can sometimes be modified without head access.

Value replacement is a useful trick.
