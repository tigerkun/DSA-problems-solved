# Day 88 - Lexicographically Smallest Palindromic Permutation Greater Than Target

🚀 **LeetCode #3734 (Hard)**

## 📝 Problem
Given a string `s` and a string `target`, rearrange the characters of `s` to create the lexicographically smallest palindromic permutation that is strictly greater than `target`.
If no such palindrome exists, return an empty string.

## 💡 Key Observation
A palindrome is completely determined by its first half and, if the length is odd, its middle character.
For example, in `abcba`:
* **First half:** `ab`
* **Middle:** `c`
* **Second half:** `ba` (just the reverse of the first half)

Therefore, instead of constructing the entire palindrome and testing permutations, we only need to construct the correct first half!

### 1. Count Character Frequencies
First, count how many times every character appears.
If `s = "aabbc"`, the frequencies are `a → 2, b → 2, c → 1`.
For a palindrome, every character except possibly the middle character must have an even frequency. Since `c` is the only odd character, it becomes the middle character.

### 2. Build the First Half
Take half of every character's frequency to form the pool for the first half:
* `a → 1`
* `b → 1`

### 3. Make It Greater Than Target (Greedy + Backtracking)
We need our answer to be strictly greater than `target`. To get the smallest possible answer, we try to keep the first half exactly equal to the corresponding part of `target` for as long as possible.

For each position:
1. **Try the exact target character:** If available, continue to the next position.
2. **Validate exact matches:** If we match the first half exactly, we must mirror it and verify that the *full* palindrome is strictly `> target`. If it isn't, we fail this path and backtrack!
3. **Backtrack & Diverge:** If exact matching fails, try the smallest available character that is strictly greater than the target character at this position.

### 4. Once We Are Greater
Once we place a character that is strictly greater than the target's character at that index, the entire prefix is guaranteed to be greater. There is no reason to make the remaining part larger than necessary. 
Therefore, we just greedily append all remaining available characters in **sorted order**. This guarantees the lexicographically smallest possible result.

---

## 💻 Java Solution

```java
class Solution {

    public String lexPalindromicPermutation(String s, String target) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // A palindrome can have at most one character with an odd frequency.
        int odd = 0;
        int midChar = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                odd++;
                midChar = i;
            }
        }

        int n = s.length();
        if (odd > 1 || (odd == 1 && n % 2 == 0)) {
            return "";
        }

        int halfLen = n / 2;
        int[] halfFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            halfFreq[i] = freq[i] / 2;
        }

        StringBuilder half = new StringBuilder();

        // Try to build the smallest first half that makes the complete palindrome > target.
        if (!build(target, 0, halfLen, halfFreq, half, midChar, n)) {
            return "";
        }

        // Assemble the final palindrome
        StringBuilder result = new StringBuilder(half);
        if (n % 2 == 1) {
            result.append((char) ('a' + midChar));
        }
        result.append(new StringBuilder(half).reverse());

        return result.toString();
    }

    private boolean build(String target, int pos, int halfLen, 
                          int[] freq, StringBuilder half, int midChar, int n) {

        // Base Case: We matched the first half of the target exactly.
        if (pos == halfLen) {
            // We must verify the fully mirrored palindrome is strictly > target.
            StringBuilder full = new StringBuilder(half);
            if (n % 2 == 1) {
                full.append((char) ('a' + midChar));
            }
            full.append(new StringBuilder(half).reverse());
            
            return full.toString().compareTo(target) > 0;
        }

        int t = target.charAt(pos) - 'a';

        // 1. Try the exact same character first (Greedy prefix matching)
        if (freq[t] > 0) {
            freq[t]--;
            half.append((char) ('a' + t));

            if (build(target, pos + 1, halfLen, freq, half, midChar, n)) {
                return true;
            }

            // Backtrack if exact match didn't yield a valid strictly greater palindrome
            half.deleteCharAt(half.length() - 1);
            freq[t]++;
        }

        // 2. Try the smallest available character strictly greater than target[pos]
        for (int c = t + 1; c < 26; c++) {
            if (freq[c] > 0) {
                half.append((char) ('a' + c));
                freq[c]--;

                // Once the first half is definitively greater, use all 
                // remaining characters in sorted (ascending) order.
                for (int x = 0; x < 26; x++) {
                    while (freq[x] > 0) {
                        half.append((char) ('a' + x));
                        freq[x]--;
                    }
                }
                return true;
            }
        }

        return false;
    }
}
