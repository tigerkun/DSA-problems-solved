# Day 86 - Shortest and Lexicographically Smallest Beautiful String

## 🚀 LeetCode #2904

### Problem

Given a binary string `s` and an integer `k`, return the **shortest substring** of `s` that contains exactly `k` occurrences of `'1'`.

If there are multiple substrings with the same minimum length, return the **lexicographically smallest** one.

If no such substring exists, return an empty string.

### Example

**Input:**

```text
s = "100011001"
k = 3
```

**Output:**

```text
"11001"
```

The substring contains exactly three `1`s and is the shortest valid substring.

### 💡 Approach

Use the **Sliding Window / Two Pointer** technique.

Maintain:

* `left` → start of the current window
* `right` → end of the current window
* `ones` → number of `1`s inside the window

### Steps

1. Expand the window by moving `right`.
2. Whenever we encounter `'1'`, increase `ones`.
3. If `ones > k`, move `left` forward until the window has at most `k` ones.
4. When `ones == k`, remove unnecessary leading zeros.
5. The resulting window is a valid beautiful substring.
6. Compare it with the best answer found so far.
7. Keep the shorter substring.
8. If both have the same length, keep the lexicographically smaller one.

### 🔍 Example Walkthrough

Consider:

```text
s = "100011001"
k = 3
```

We need exactly:

```text
3 ones
```

When the window contains three `1`s, we try removing unnecessary zeros from the beginning.

The valid window is reduced to the shortest possible substring containing those three `1`s.

If another substring of the same length is found, compare them lexicographically:

```text
"11001" < "11100"
```

so `"11001"` is preferred.

### 📌 Why Sliding Window?

We don't need to check every possible substring.

The number of `1`s tells us whether the current window is valid.

```text
ones < k
    ↓
Expand window

ones > k
    ↓
Shrink window

ones == k
    ↓
Valid substring
```

This allows the string to be processed efficiently.

### 💻 Java Solution

```java
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;
        String answer = "";

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1')
                ones++;

            while (ones > k) {
                if (s.charAt(left) == '1')
                    ones--;
                left++;
            }

            if (ones == k) {
                while (s.charAt(left) == '0')
                    left++;

                String current = s.substring(left, right + 1);

                if (answer.equals("")
                        || current.length() < answer.length()
                        || (current.length() == answer.length()
                            && current.compareTo(answer) < 0)) {
                    answer = current;
                }
            }
        }

        return answer;
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(n²)` in Java because creating and comparing substrings can take additional time.
* **Space Complexity:** `O(n)` for the returned answer.

The sliding-window traversal itself is `O(n)`.

### 📌 Key Takeaway

Remember the solution as:

```text
Sliding Window
      ↓
Count 1s
      ↓
Exactly k ones?
      ↓
Remove leading zeros
      ↓
Check length
      ↓
If same length → Lexicographically smaller
```

The two conditions for selecting the answer are:

```text
1. Smaller length
2. Same length → Smaller lexicographical order
```

### 🔗 LeetCode

**Problem:** Shortest and Lexicographically Smallest Beautiful String
**LeetCode:** #2904
**Difficulty:** Medium
