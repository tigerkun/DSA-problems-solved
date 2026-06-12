# Day 13 - Rotate List

## Problem

Given the head of a linked list, rotate the list to the right by `k` places.

### Example

Input:

1 -> 2 -> 3 -> 4 -> 5

k = 2

Output:

4 -> 5 -> 1 -> 2 -> 3

---

## Approach

1. Find the length of the linked list.
2. Connect the tail to the head to form a circular linked list.
3. Compute the effective rotation:

k = k % length

4. Find the new tail node.
5. Break the circular link.
6. Return the new head.

This avoids performing unnecessary rotations.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Key Learning

- Practiced advanced pointer manipulation.
- Learned how circular linked lists can simplify rotation problems.
- Used modulo arithmetic to eliminate redundant rotations.

---

## Takeaway

Many linked list problems become easier when you temporarily transform the structure (such as making it circular) and then restore it after finding the solution.
