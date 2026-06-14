# Day 15 - Odd Even Linked List

## Problem

Given the head of a singly linked list, group all nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

Note:

* The node position determines whether it is odd or even.
* The relative order within the odd and even groups should remain the same.

### Example

Input:

1 -> 2 -> 3 -> 4 -> 5

Output:

1 -> 3 -> 5 -> 2 -> 4

---

## Approach

Maintain two separate chains:

* Odd-indexed nodes
* Even-indexed nodes

Steps:

1. Store the head of the even list.
2. Connect odd nodes together.
3. Connect even nodes together.
4. Attach the even list after the odd list.

This rearranges the list in-place without creating extra nodes.

---

## Complexity Analysis

* Time Complexity: O(n)
* Space Complexity: O(1)

---

## Key Learning

* Practiced advanced pointer manipulation.
* Learned how to maintain multiple linked list chains simultaneously.
* Reinforced in-place linked list reordering techniques.

---

## Takeaway

Many linked list problems can be solved efficiently by splitting the list into logical groups and reconnecting them after processing.
