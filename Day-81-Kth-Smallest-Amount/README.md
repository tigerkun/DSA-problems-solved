# Day 81 - Kth Smallest Amount With Single Denomination Combination

## 🚀 LeetCode #3116

### Problem

You are given an integer array `coins` representing different coin denominations and an integer `k`.

You have an infinite number of coins of each denomination, but you **cannot combine coins of different denominations**.

Return the `k`th smallest amount that can be made.

For example, if:

```text
coins = [2,5]
```

The possible amounts are:

```text
2, 4, 5, 6, 8, 10, 12, 14, 15, ...
```

So if `k = 7`, the answer is:

```text
12
```

### Example

**Input:**

```text
coins = [5,2]
k = 7
```

**Output:**

```text
12
```

### 💡 Approach

This problem is efficiently solved using:

1. **Binary Search**
2. **Inclusion-Exclusion Principle**
3. **LCM (Least Common Multiple)**

---

## 1. Binary Search

Suppose we choose a number `x`.

We can calculate how many valid amounts are `<= x`.

If that count is:

```text
count >= k
```

then the kth amount is somewhere at or before `x`.

So:

```text
right = mid
```

Otherwise:

```text
left = mid + 1
```

This gives us a monotonic condition suitable for binary search.

---

## 2. Counting Valid Amounts

For a single coin `c`, the number of multiples of `c` less than or equal to `x` is:

```text
x / c
```

For example:

```text
x = 20
coin = 5

20 / 5 = 4
```

The multiples are:

```text
5, 10, 15, 20
```

With multiple coins, some amounts are counted more than once.

For example:

```text
coins = [2,5]
x = 20
```

Multiples of `2`:

```text
2,4,6,8,10,12,14,16,18,20
```

Multiples of `5`:

```text
5,10,15,20
```

`10` and `20` are counted twice.

So we subtract their common multiples.

---

## 3. Inclusion-Exclusion

For two coins:

```text
count =
x/coin1
+ x/coin2
- x/lcm(coin1, coin2)
```

For three coins:

```text
count =
x/a + x/b + x/c
- x/lcm(a,b)
- x/lcm(a,c)
- x/lcm(b,c)
+ x/lcm(a,b,c)
```

The pattern is:

```text
Odd number of selected coins → ADD
Even number of selected coins → SUBTRACT
```

Since there are at most 15 coins, we can enumerate all subsets using bitmasks.

The official constraints allow up to 15 denominations, making this subset approach practical.

---

## 🔍 Example

Consider:

```text
coins = [2,5]
x = 20
```

### Multiples of 2

```text
20 / 2 = 10
```

### Multiples of 5

```text
20 / 5 = 4
```

### Common multiples

```text
LCM(2,5) = 10

20 / 10 = 2
```

Therefore:

```text
count = 10 + 4 - 2
      = 12
```

There are `12` distinct valid amounts ≤ `20`.

---

## 🔄 Binary Search

The answer cannot be greater than:

```text
k × minimum coin
```

So we use:

```text
left = 1
right = k × min(coins)
```

Then repeatedly calculate:

```text
mid = (left + right) / 2
```

If:

```text
count(mid) >= k
```

we search the left half.

Otherwise, we search the right half.

Eventually:

```text
left == right
```

and that value is the kth smallest amount.

---

## 💻 Java Solution

```java
class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long left = 1;
        long right = (long) k * getMin(coins);

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (count(mid, coins) >= k)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private long count(long x, int[] coins) {
        long result = 0;
        int n = coins.length;

        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int bits = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;

                    long g = gcd(lcm, coins[i]);
                    lcm = lcm / g * coins[i];

                    if (lcm > x) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid)
                continue;

            long multiples = x / lcm;

            if (bits % 2 == 1)
                result += multiples;
            else
                result -= multiples;
        }

        return result;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int getMin(int[] coins) {
        int min = coins[0];

        for (int coin : coins)
            min = Math.min(min, coin);

        return min;
    }
}
```

## ⏱️ Complexity

Let `n` be the number of coins.

There are `2^n - 1` non-empty subsets.

For each subset, we may process up to `n` coins, and binary search performs approximately `O(log(k × min(coins)))` iterations.

Therefore:

* **Time Complexity:** `O(2^n × n × log(k × min(coins)))`
* **Space Complexity:** `O(1)` auxiliary space

The standard solution uses binary search combined with inclusion-exclusion over subsets.

### 📌 Key Takeaways

The three main concepts are:

```text
Binary Search
      +
Inclusion-Exclusion
      +
LCM
```

The most important counting rule is:

```text
1 selected coin  → ADD
2 selected coins → SUBTRACT
3 selected coins → ADD
4 selected coins → SUBTRACT
```

And the binary-search condition is:

```text
count(mid) >= k
        ↓
   search left

count(mid) < k
        ↓
  search right
```

This turns a very large `k` problem into an efficient mathematical counting problem.

### 🔗 LeetCode

**Problem:** Kth Smallest Amount With Single Denomination Combination
**LeetCode:** #3116
**Difficulty:** Hard
