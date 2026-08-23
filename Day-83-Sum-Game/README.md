# Day 83 - Sum Game

## 🚀 LeetCode #1927

### Problem

Alice and Bob take turns replacing `?` characters in a string with digits from `0` to `9`.

Alice starts first.

After all `?` characters are replaced:

* **Bob wins** if the sum of the digits in the first half equals the sum in the second half.
* **Alice wins** if the sums are different.

Return `true` if Alice can guarantee a win, otherwise return `false`.

### Example

**Input:**

```text
num = "25??"
```

**Output:**

```text
true
```

Alice can choose a digit that makes it impossible for Bob to balance the two halves.

---

### 💡 Approach

Instead of simulating the game, we only need four values:

```text
sum1 → known digit sum of first half
sum2 → known digit sum of second half

q1 → number of '?' in first half
q2 → number of '?' in second half
```

### 1. Count the Known Digits

For example:

```text
num = "?3295???"
```

Split into:

```text
First half  → ?329
Second half → 5???
```

We calculate:

```text
sum1 = 3 + 2 + 9
sum2 = 5

q1 = 1
q2 = 3
```

---

### 2. Odd Number of `?`

If:

```text
(q1 + q2) % 2 == 1
```

Alice makes the last move.

She can choose a digit that prevents the two sums from being equal.

Therefore:

```text
odd number of ? → Alice wins
```

---

### 3. Even Number of `?`

If the number of `?` is even, Alice and Bob effectively respond to each other's moves.

The important observation is that the balancing effect of two moves is at most **9**.

Therefore, Bob can force equality only when:

```text
sum1 - sum2 = 9 × (q2 - q1) / 2
```

If this equality does not hold, Alice can force the sums to be different.

So the final condition is:

```text
return sum1 - sum2 != 9 * (q2 - q1) / 2;
```

---

### 🔍 Example

Consider:

```text
num = "?3295???"
```

Split:

```text
?329 | 5???
```

Known sums:

```text
sum1 = 3 + 2 + 9 = 14
sum2 = 5
```

Question marks:

```text
q1 = 1
q2 = 3
```

Total:

```text
q1 + q2 = 4
```

It is even, so check:

```text
9 × (q2 - q1) / 2

= 9 × (3 - 1) / 2
= 9
```

Current difference:

```text
sum1 - sum2
= 14 - 5
= 9
```

Both are equal:

```text
9 = 9
```

Therefore Bob can force the sums to be equal.

```text
Answer = false
```

---

### 💻 Java Solution

```java
class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int sum1 = 0, sum2 = 0;
        int q1 = 0, q2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?')
                q1++;
            else
                sum1 += num.charAt(i) - '0';
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?')
                q2++;
            else
                sum2 += num.charAt(i) - '0';
        }

        if ((q1 + q2) % 2 == 1)
            return true;

        return sum1 - sum2 != 9 * (q2 - q1) / 2;
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

We traverse the string once and only use a constant number of variables.

### 📌 Key Takeaways

The entire problem can be reduced to:

```text
Count '?' in both halves
        +
Calculate known digit sums
        ↓
Odd '?' → Alice wins
        ↓
Even '?' → Compare:
sum1 - sum2
with
9 × (q2 - q1) / 2
```

The key formula is:

```text
Bob wins only when:

sum1 - sum2 = 9 × (q2 - q1) / 2
```

Otherwise:

```text
Alice wins
```

### 🔗 LeetCode

**Problem:** Sum Game
**LeetCode:** #1927
**Difficulty:** Medium
