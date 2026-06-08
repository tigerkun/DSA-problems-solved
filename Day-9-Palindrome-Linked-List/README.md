# Day 9 - Palindrome Linked List

## Problem

Given the head of a singly linked list, return `true` if it is a palindrome, otherwise return `false`.

A palindrome reads the same forward and backward.

### Example

Input:

1 -> 2 -> 2 -> 1

Output:

true

---

## Approach

1. Use Fast and Slow pointers to find the middle of the linked list.
2. Reverse the second half of the list.
3. Compare the first half with the reversed second half.
4. If all corresponding values match, the list is a palindrome.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Key Learning

- Combined multiple linked list techniques in a single problem.
- Used Fast & Slow Pointers to locate the middle.
- Reversed a linked list in-place.
- Compared two halves efficiently without extra memory.

---

## Takeaway

Many linked list problems can be solved efficiently by combining fundamental patterns such as Fast & Slow Pointers and in-place reversal.
