# LeetCode 3622 — Check Divisibility by Digit Sum and Product

**Difficulty:** Easy
**Language:** Java
**Topic:** Math, Digit Manipulation

## Problem

Given a positive integer `n`, determine whether `n` is divisible by the sum of:

* The **sum of all digits** of `n`
* The **product of all digits** of `n`

Return `true` if divisible, otherwise return `false`.

### Example

```text
Input: 99

Digit Sum = 9 + 9 = 18
Digit Product = 9 × 9 = 81

18 + 81 = 99

99 % 99 = 0

Output: true
```

## Approach

1. Store the original number.
2. Extract each digit using `% 10`.
3. Add each digit to `sum`.
4. Multiply each digit into `product`.
5. Check whether the original number is divisible by `sum + product`.

## Java Solution

```java
class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum = 0, product = 1;

        while (x != 0) {
            int digit = x % 10;
            sum += digit;
            product *= digit;
            x /= 10;
        }

        return n % (sum + product) == 0;
    }
}
```

## Complexity

* **Time:** `O(log n)`
* **Space:** `O(1)`

## Key Concept

This problem is a good practice for **digit manipulation** using:

```text
n % 10 → extract last digit
n / 10 → remove last digit
```

The main condition is:

```text
n % (digitSum + digitProduct) == 0
```

## LeetCode

[Problem 3622 — Check Divisibility by Digit Sum and Product](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)
