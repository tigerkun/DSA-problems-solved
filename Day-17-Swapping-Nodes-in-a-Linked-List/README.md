# Day 17 - Swapping Nodes in a Linked List

## Problem

You are given the head of a linked list and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end.

### Example

Input:

1 -> 2 -> 3 -> 4 -> 5

k = 2

Output:

1 -> 4 -> 3 -> 2 -> 5

---

## Approach

Instead of swapping entire nodes, swap only their values.

### Steps

1. Find the kth node from the beginning.
2. Use another pointer to find the kth node from the end.
3. Swap their values.
4. Return the modified list.

This avoids complex pointer manipulation.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Key Learning

- Practiced locating nodes from both ends of a linked list.
- Reinforced Fast & Slow Pointer concepts.
- Learned that swapping values is often simpler than swapping nodes.

---

## Takeaway

In linked list problems, always check whether swapping values can achieve the same result before attempting complicated pointer rearrangements.
