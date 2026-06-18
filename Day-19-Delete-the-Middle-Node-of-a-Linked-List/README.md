# Day 19 - Delete the Middle Node of a Linked List

## Problem

Given the head of a linked list, delete the middle node and return the head of the modified linked list.

The middle node is the ⌊n / 2⌋th node (0-indexed).

### Example

Input:

1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6

Output:

1 -> 3 -> 4 -> 1 -> 2 -> 6

Explanation:

The middle node is 7, so it is removed.

---

## Approach

Use the Fast & Slow Pointer technique.

### Steps

1. Move `slow` by one step.
2. Move `fast` by two steps.
3. Keep track of the node before `slow`.
4. When `fast` reaches the end:
   - `slow` will be at the middle node.
5. Remove the middle node by changing:

```java
prev.next = slow.next;
```

---

## Java Solution

```java
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }
}
```

---

## Dry Run

Input:

1 -> 2 -> 3 -> 4 -> 5

Iteration 1:

slow = 2

fast = 3

Iteration 2:

slow = 3

fast = 5

Middle Node = 3

Delete:

1 -> 2 -> 4 -> 5

Output:

1 -> 2 -> 4 -> 5

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Key Learning

- Practiced Fast & Slow Pointer technique.
- Learned how to delete a node when only its reference is known.
- Reinforced linked list traversal and pointer manipulation.

---

## Takeaway

Fast & Slow Pointers remain one of the most powerful patterns for linked list problems, enabling efficient middle-node operations in a single pass.
