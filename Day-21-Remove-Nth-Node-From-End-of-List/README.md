Day 21 - Remove Nth Node From End of List
Problem
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example
Input:

head = [1,2,3,4,5]
n = 2
Output:

[1,2,3,5]
Explanation:

1 -> 2 -> 3 -> 4 -> 5
                 ↑
          Remove this node

Dry Run
Input:

1 -> 2 -> 3 -> 4 -> 5
n = 2
Move fast 3 steps:

slow = dummy
fast = 3
Move both until fast reaches null:

slow = 3
fast = null
Remove:

slow.next = slow.next.next;
Result:

1 -> 2 -> 3 -> 5
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)
