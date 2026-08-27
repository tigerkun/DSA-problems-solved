class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        if (dfs(target, 0, count, ans)) {
            return ans.toString();
        }

        return "";
    }

    private boolean dfs(String target, int pos, int[] count,
                        StringBuilder ans) {

        if (pos == target.length()) {
            return false;
        }

        int t = target.charAt(pos) - 'a';

        // Try to use the same character
        if (count[t] > 0) {
            count[t]--;
            ans.append((char) ('a' + t));

            if (dfs(target, pos + 1, count, ans)) {
                return true;
            }

            ans.deleteCharAt(ans.length() - 1);
            count[t]++;
        }

        // Try the smallest character greater than target[pos]
        for (int c = t + 1; c < 26; c++) {
            if (count[c] > 0) {
                ans.append((char) ('a' + c));
                count[c]--;

                // Once greater, append remaining characters
                // in sorted order
                for (int x = 0; x < 26; x++) {
                    while (count[x] > 0) {
                        ans.append((char) ('a' + x));
                        count[x]--;
                    }
                }

                return true;
            }
        }

        return false;
    }
}
