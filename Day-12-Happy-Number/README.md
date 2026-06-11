# Day 12 - Happy Number

## Problem

Write an algorithm to determine if a number `n` is happy.

A happy number is defined by the following process:

1. Replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1.
3. If the process enters a cycle that does not include 1, the number is not happy.

Return `true` if `n` is a happy number, otherwise return `false`.

### Example

Input:

19

Output:

true

Explanation:

19 → 82 → 68 → 100 → 1

---

## Approach

Used Floyd's Cycle Detection Algorithm.

* Slow pointer moves one transformation at a time.
* Fast pointer moves two transformations at a time.
* If the number is happy, both pointers eventually reach 1.
* If a cycle exists, the pointers will meet at a value other than 1.

This avoids using extra memory such as a HashSet.

---

## Complexity Analysis

* Time Complexity: O(log n)
* Space Complexity: O(1)

---

## Key Learning

* Applied Floyd's Cycle Detection outside linked lists.
* Practiced digit extraction and mathematical transformations.
* Learned how cycle detection can be used in different problem domains.

---

## Takeaway

Fast & Slow Pointer techniques aren't limited to linked lists. Any process that can enter a cycle can often be analyzed using Floyd's Cycle Detection Algorithm.
