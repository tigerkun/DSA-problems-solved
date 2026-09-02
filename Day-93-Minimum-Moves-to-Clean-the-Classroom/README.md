# Day 93 - Minimum Moves to Clean the Classroom

## 🚀 LeetCode #3568

**Problem:** Minimum Moves to Clean the Classroom

## 🧠 Key Idea

This problem can be solved using **Breadth-First Search (BFS)** combined with **Bitmasking**.

We need to keep track of four things:

* Current row
* Current column
* Remaining energy
* Which litter pieces have been collected

Since there can be at most **10 litter cells**, a bitmask can efficiently represent the collected/uncollected litter.

## 🔑 Approach

1. Find the starting position `S`.
2. Give every litter cell `L` a unique bit.
3. Initially, all litter is uncollected, so the mask contains all `1`s.
4. Start BFS from the student's position.
5. For every move:

   * Moving to a normal cell costs 1 energy.
   * Moving to `L` collects that litter.
   * Moving to `R` restores energy to its maximum.
   * `X` cannot be entered.
6. If the mask becomes `0`, all litter has been collected.
7. Because BFS explores states level by level, the first successful state gives the minimum number of moves.

## 💡 Example

```text
classroom = ["LS", "RL"]
energy = 4
```

A possible path is:

```text
S → L → R → L
```

Moves:

```text
1 → Collect first litter
2 → Reach reset area
3 → Collect second litter
```

Answer:

```text
3
```

## 💻 Java Solution

```java
import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int[][] litter = new int[m][n];
        int sr = 0, sc = 0, count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = classroom[i].charAt(j);

                if (c == 'S') {
                    sr = i;
                    sc = j;
                } else if (c == 'L') {
                    litter[i][j] = count++;
                }
            }
        }

        if (count == 0) return 0;

        int totalMasks = 1 << count;

        boolean[][][][] visited =
            new boolean[m][n][energy + 1][totalMasks];

        Queue<int[]> queue = new LinkedList<>();

        int startMask = totalMasks - 1;

        queue.offer(new int[]{sr, sc, energy, startMask});
        visited[sr][sc][energy][startMask] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] current = queue.poll();

                int r = current[0];
                int c = current[1];
                int e = current[2];
                int mask = current[3];

                if (mask == 0) return moves;
                if (e == 0) continue;

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                        continue;

                    if (classroom[nr].charAt(nc) == 'X')
                        continue;

                    char cell = classroom[nr].charAt(nc);

                    int newEnergy = e - 1;

                    if (cell == 'R')
                        newEnergy = energy;

                    int newMask = mask;

                    if (cell == 'L')
                        newMask &= ~(1 << litter[nr][nc]);

                    if (!visited[nr][nc][newEnergy][newMask]) {
                        visited[nr][nc][newEnergy][newMask] = true;

                        queue.offer(new int[]{
                            nr, nc, newEnergy, newMask
                        });
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}
```

## ⏱️ Complexity

Let:

* `m` = number of rows
* `n` = number of columns
* `E` = maximum energy
* `L` = number of litter cells

There are at most `m × n × E × 2^L` states.

**Time Complexity:**

```text
O(m × n × E × 2^L)
```

**Space Complexity:**

```text
O(m × n × E × 2^L)
```

Since `L ≤ 10`, the bitmask has at most `2^10 = 1024` possibilities.

## 🎯 Key Takeaway

The important concept from this problem is:

> **BFS + State Tracking + Bitmasking**

Instead of only tracking the student's position, we track the complete state:

```text
(row, column, energy, litterMask)
```

This allows BFS to find the minimum number of moves while correctly handling energy resets and already-collected litter.
