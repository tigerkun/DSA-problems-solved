# Day 72 - Add Two Numbers

## 🚀 LeetCode #2

### Problem

You are given two non-empty linked lists representing two non-negative integers.

The digits are stored in reverse order, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

### Example

Input:
l1 = [2,4,3]
l2 = [5,6,4]

Output:
[7,0,8]

Explanation:

342 + 465 = 807

Since the digits are stored in reverse order:

[2,4,3] + [5,6,4] = [7,0,8]

---

## 💡 Approach

Traverse both linked lists simultaneously and add their corresponding digits.

At every step:

1. Add the current digits.
2. Add the carry from the previous step.
3. Store `sum % 10` in the result.
4. Update carry using `sum / 10`.
5. Move to the next nodes.
6. Continue until both lists and the carry are processed.

A dummy node is used to simplify the construction of the result list.

---

