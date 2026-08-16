# Day 76 - Merge Two Sorted Lists

## 🚀 LeetCode #21

### Problem

You are given the heads of two sorted linked lists, `list1` and `list2`.

Merge the two lists into one sorted list and return the head of the merged linked list.

The merged list should be made by splicing together the nodes of the two given lists.

### Example

**Input:**

```text
list1 = [1,2,4]
list2 = [1,3,4]
```

**Output:**

```text
[1,1,2,3,4,4]
```

### 💡 Approach

Use a **two-pointer technique** to compare the current nodes of both lists.

1. Create a dummy node to simplify the result list.
2. Compare the values of `list1` and `list2`.
3. Connect the smaller node to the merged list.
4. Move the pointer of the selected list forward.
5. Continue until one list becomes empty.
6. Attach the remaining nodes of the other list.

### 🔍 Example Walkthrough

```text
list1 → 1 → 2 → 4
list2 → 1 → 3 → 4
```

Compare the nodes:

```text
1 ≤ 1 → take 1
2 > 1 → take 1
2 ≤ 3 → take 2
4 > 3 → take 3
4 ≤ 4 → take 4
```

Finally, attach the remaining `4`.

Result:

```text
1 → 1 → 2 → 3 → 4 → 4
```

### 💻 Java Solution

```java
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(n + m)`
* **Space Complexity:** `O(1)`

where `n` and `m` are the lengths of the two linked lists.

### 📌 Key Takeaway

The main idea is:

```text
Compare both nodes
      ↓
Take the smaller node
      ↓
Move that pointer
      ↓
Repeat
      ↓
Attach remaining nodes
```

The original nodes are reused, so no extra linked-list nodes are required.

### 🔗 LeetCode

**Problem:** Merge Two Sorted Lists
**LeetCode:** #21
**Difficulty:** Easy
