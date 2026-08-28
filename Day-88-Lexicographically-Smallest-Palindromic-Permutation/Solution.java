import java.util.Arrays;

class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int m = n / 2;
        
        // 1. Count frequencies and validate palindrome feasibility
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        int oddCnt = 0;
        char midChar = '\0';
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCnt++;
                midChar = (char) (i + 'a');
            }
        }
        
        // Impossible to form a palindrome
        if (oddCnt > 1 || (oddCnt == 1 && n % 2 == 0)) {
            return "";
        }
        
        int[] halfPool = new int[26];
        for (int i = 0; i < 26; i++) {
            halfPool[i] = count[i] / 2;
        }
        
        // 2. Case 1: First half matches target[0...m-1] exactly
        int[] curPool = Arrays.copyOf(halfPool, 26);
        boolean canMatchExact = true;
        for (int i = 0; i < m; i++) {
            if (--curPool[target.charAt(i) - 'a'] < 0) {
                canMatchExact = false;
                break;
            }
        }
        
        if (canMatchExact) {
            String firstHalf = target.substring(0, m);
            String cand = makePalindrome(firstHalf, midChar, n);
            // Must be strictly greater than target
            if (cand.compareTo(target) > 0) {
                return cand;
            }
        }
        
        // 3. Case 2: Diverge at index k to find lexicographically smallest greater match
        for (int k = m - 1; k >= 0; k--) {
            curPool = Arrays.copyOf(halfPool, 26);
            boolean validPrefix = true;
            for (int i = 0; i < k; i++) {
                if (--curPool[target.charAt(i) - 'a'] < 0) {
                    validPrefix = false;
                    break;
                }
            }
            if (!validPrefix) continue;
            
            // Try to place the smallest available character strictly greater than target[k]
            int pick = -1;
            for (int c = target.charAt(k) - 'a' + 1; c < 26; c++) {
                if (curPool[c] > 0) {
                    pick = c;
                    break;
                }
            }
            
            if (pick != -1) {
                curPool[pick]--;
                StringBuilder firstHalf = new StringBuilder(target.substring(0, k));
                firstHalf.append((char) ('a' + pick));
                
                // Fill the remaining spots with the smallest possible available characters
                for (int c = 0; c < 26; c++) {
                    while (curPool[c] > 0) {
                        firstHalf.append((char) ('a' + c));
                        curPool[c]--;
                    }
                }
                
                return makePalindrome(firstHalf.toString(), midChar, n);
            }
        }
        
        return "";
    }
    
    // Helper to construct the full palindrome string
    private String makePalindrome(String firstHalf, char midChar, int n) {
        StringBuilder sb = new StringBuilder(firstHalf);
        String rev = new StringBuilder(firstHalf).reverse().toString();
        
        if (n % 2 == 1) {
            sb.append(midChar);
        }
        sb.append(rev);
        return sb.toString();
    }
}
