# Day 7 - Linked List Cycle

## Problem

Given the head of a linked list, determine if the linked list has a cycle in it.

A cycle exists if a node can be reached again by continuously following the next pointer.

---

## Example

Input:

3 -> 2 -> 0 -> -4
     ^         |
     |_________|

Output:

true

---

## Approach

Used Floyd's Cycle Detection Algorithm (Tortoise and Hare).

- Slow pointer moves one step at a time.
- Fast pointer moves two steps at a time.
- If a cycle exists, both pointers will eventually meet.
- If the fast pointer reaches null, no cycle 
---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Key Learning

- Learned Floyd's Cycle Detection Algorithm.
- Practiced the Fast & Slow Pointer technique.
- Understood how pointer speed differences can detect loops efficiently.

---

## Takeaway

When two pointers move at different speeds inside a cycle, the faster pointer will eventually catch up to the slower one, making cycle detection possible without extra memory.
