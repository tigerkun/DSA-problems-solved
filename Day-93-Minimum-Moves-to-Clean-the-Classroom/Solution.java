import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int[][] litter = new int[m][n];
        int sr = 0, sc = 0, count = 0;

        // Find start and assign a number to every litter cell
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

        // visited[row][col][energy][mask]
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][totalMasks];

        Queue<int[]> queue = new LinkedList<>();

        // All litter is initially uncollected
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

                // All litter collected
                if (mask == 0) return moves;

                // Cannot move without energy
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

                    // Reset energy at R
                    if (cell == 'R') {
                        newEnergy = energy;
                    }

                    int newMask = mask;

                    // Collect litter
                    if (cell == 'L') {
                        newMask &= ~(1 << litter[nr][nc]);
                    }

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
