# Day 91 - Find the Minimum and Maximum Number of Nodes Between Critical Points

## 🚀 LeetCode #2058

### Problem

Given the head of a linked list, find the minimum and maximum number of nodes between any two **critical points**.

A node is a critical point if it is either:

* A **local maximum**
* A **local minimum**

The first and last nodes cannot be critical points because they do not have both a previous and next node.

Return:

```text
[minDistance, maxDistance]
```

If there are fewer than two critical points, return:

```text
[-1, -1]
```

---

## 💡 What Is a Critical Point?

A node is a **local maximum** when:

```text id="9l9t8x"
current > previous
AND
current > next
```

A node is a **local minimum** when:

```text id="u2d8jk"
current < previous
AND
current < next
```

For example:

```text id="9u4p0c"
1 → 5 → 3
```

`5` is a local maximum because:

```text id="y6v3tp"
5 > 1
5 > 3
```

---

## 💡 Approach

Traverse the linked list once.

For every node, compare:

```text id="7j1w9d"
previous
current
next
```

If the current node is a critical point, store its position.

We only need three pieces of information:

```text id="1fr1o6"
first critical point
previous critical point
minimum distance
```

There is no need to store every critical point.

---

## 🔍 Finding Minimum Distance

Suppose critical points occur at:

```text id="0k2lq5"
2 → 5 → 9
```

Distances between consecutive critical points:

```text id="r7g6l4"
5 - 2 = 3
9 - 5 = 4
```

Therefore:

```text id="j6m8v0"
minimum = 3
```

The minimum distance only needs to be checked between **consecutive critical points**.

---

## 🔍 Finding Maximum Distance

The maximum distance is always between the:

```text id="x9a1k2"
first critical point
        and
last critical point
```

So:

```text id="d5a8v4"
maxDistance = last - first
```

---

## 🧠 Example

Consider:

```text id="m0p4q8"
3 → 1 → 5 → 3 → 7 → 1
```

Critical points:

```text id="f5v3u8"
1 → local minimum
5 → local maximum
3 → local minimum
7 → local maximum
```

Their positions are:

```text id="e5u8z2"
1, 2, 3, 4
```

Minimum distance:

```text id="4a6q1v"
1
```

Maximum distance:

```text id="j3x9f2"
4 - 1 = 3
```

Answer:

```text id="0q7p6x"
[1, 3]
```

---

## 💻 Java Solution

```java id="u7r3m5"
class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int first = -1;
        int previous = -1;

        int minDistance = Integer.MAX_VALUE;

        int position = 1;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {

            ListNode next = curr.next;

            // Local maximum or local minimum
            boolean critical =
                (curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val);

            if (critical) {

                // First critical point
                if (first == -1) {
                    first = position;
                }

                // Distance from previous critical point
                if (previous != -1) {
                    minDistance = Math.min(
                        minDistance,
                        position - previous
                    );
                }

                previous = position;
            }

            prev = curr;
            curr = next;
            position++;
        }

        // Less than two critical points
        if (first == -1 || first == previous) {
            return new int[] {-1, -1};
        }

        int maxDistance = previous - first;

        return new int[] {
            minDistance,
            maxDistance
        };
    }
}
```

---

## ⏱️ Complexity

**Time Complexity:** `O(n)`

We traverse the linked list only once.

**Space Complexity:** `O(1)`

Only a few variables are used.

---

## 📌 Key Takeaway

Remember it like this:

```text id="9z4x6m"
Previous ← Current → Next
              ↓
       Critical Point?
          ↙       ↘
       Maximum   Minimum
              ↓
       Track position
              ↓
    Consecutive → MIN
    First/Last → MAX
```

The main formulas are:

```text id="b7q2m1"
Minimum = minimum distance between consecutive critical points

Maximum = lastCritical - firstCritical
```

And if there are fewer than two:

```text id="6k2p8x"
[-1, -1]
```

### LeetCode

**Problem:** Find the Minimum and Maximum Number of Nodes Between Critical Points
**LeetCode:** #2058
**Difficulty:** Medium
