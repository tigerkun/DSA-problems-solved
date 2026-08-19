# Day 79 - Cinema Seat Allocation

## 🚀 LeetCode #1386

### Problem

A cinema has `n` rows and 10 seats in each row.

A four-person family wants to sit together in the same row.

A family can occupy one of these seat groups:

```text
[2,3,4,5]
[4,5,6,7]
[6,7,8,9]
```

Some seats are already reserved.

Return the maximum number of four-person families that can be seated.

### Example

**Input:**

```text id="8o5h2w"
n = 3
reservedSeats = [[1,2],[1,3],[1,8],[2,6]]
```

**Output:**

```text id="r4k2sn"
4
```

### 💡 Approach

The important seats are only `2` through `9`.

For each row, represent reserved seats using a **bitmask**.

The three possible groups are:

```text id="m7n9w4"
Left:    2 3 4 5
Middle:    4 5 6 7
Right:      6 7 8 9
```

A group can be used if none of its seats are reserved.

### 🔍 Key Observation

A row with **no reserved seats** can always fit:

```text id="k4l7z8"
2 families
```

Therefore:

```text id="v2a6xq"
(n - rowsWithReservations) × 2
```

is added immediately.

We only need to process rows that contain reserved seats.

### 🔄 Bitmasking

For each reserved seat, set its corresponding bit:

```java id="4n7c0k"
mask |= (1 << seat);
```

Then check whether a group is available using:

```java id="0u7xrv"
(mask & group) == 0
```

If the result is `0`, none of the seats in that group are reserved.

### 💻 Java Solution

```java id="n9j3q2"
import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> rows = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int s = seat[1];

            if (s >= 2 && s <= 9)
                rows.put(row, rows.getOrDefault(row, 0) | (1 << s));
        }

        int result = (n - rows.size()) * 2;

        int left = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);
        int middle = (1 << 4) | (1 << 5) | (1 << 6) | (1 << 7);
        int right = (1 << 6) | (1 << 7) | (1 << 8) | (1 << 9);

        for (int mask : rows.values()) {
            boolean canLeft = (mask & left) == 0;
            boolean canMiddle = (mask & middle) == 0;
            boolean canRight = (mask & right) == 0;

            if (canLeft && canRight)
                result += 2;
            else if (canLeft || canMiddle || canRight)
                result += 1;
        }

        return result;
    }
}
```

### ⏱️ Complexity

Let `r` be the number of reserved seats.

* **Time Complexity:** `O(r)`
* **Space Complexity:** `O(r)`

Only rows containing reserved seats are stored.

### 📌 Key Takeaways

The main ideas are:

```text id="q6b2e7"
1. Only seats 2–9 matter.
2. Empty rows → 2 families.
3. Use a bitmask for reserved seats.
4. Check the 3 possible family blocks.
5. Use bitwise AND to test availability.
```

The key operation is:

```java id="k9p4e1"
(mask & group) == 0
```

which means **none of the seats required by the family are reserved**.

### 🔗 LeetCode

**Problem:** Cinema Seat Allocation
**LeetCode:** #1386
**Difficulty:** Medium
