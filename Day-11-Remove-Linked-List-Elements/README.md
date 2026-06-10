# Day 11 - Remove Linked List Elements

## Problem

Given the head of a linked list and an integer `val`, remove all nodes that have `Node.val == val` and return the new head.

### Example

Input:

1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6

val = 6

Output:

1 -> 2 -> 3 -> 4 -> 5

---

## Approach

Used a dummy node before the head of the list.

Why a dummy node?

* It simplifies handling cases where the head itself must be removed.
* Avoids writing separate logic for deleting the first node.

Algorithm:

1. Create a dummy node pointing to the head.
2. Traverse the list using a pointer.
3. If the next node contains the target value, skip it.
4. Otherwise, move forward.
5. Return `dummy.next`.

   
---

## Complexity Analysis

* Time Complexity: O(n)
* Space Complexity: O(1)

where n is the number of nodes in the linked list.

---

## Key Learning

* Learned the Dummy Node technique.
* Practiced deleting nodes in a singly linked list.
* Handled edge cases where the head node must be removed.

---

## Takeaway

The dummy node pattern is one of the most useful linked list techniques because it eliminates special-case handling for the head node.
