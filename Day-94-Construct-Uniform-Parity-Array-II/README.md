# Day 94 - Construct Uniform Parity Array II

## 🚀 LeetCode #3876

**Problem:** Construct Uniform Parity Array II

## 🧠 Key Idea

The goal is to determine whether we can make all elements of the resulting array have the same parity.

The important observation is that if the array contains both odd and even numbers, we can use the **smallest odd number** to change larger even numbers into odd numbers.

If any even number is smaller than the smallest odd number, that even number cannot be converted into a positive odd number. Therefore, the answer is `false`.

## 🔑 Approach

1. Find the smallest odd number in the array.
2. If there are no odd numbers, all elements are already even, so return `true`.
3. Check every even number.
4. If any even number is smaller than the smallest odd number, return `false`.
5. Otherwise, return `true`.

## 💡 Example

### Input

```text
nums1 = [1, 4, 7]
```

Smallest odd number:

```text
1
```

We can convert:

```text
4 - 1 = 3
```

So the resulting array can be:

```text
[1, 3, 7]
```

All elements are odd.

### Output

```text
true
```

## 💻 Java Solution

```java
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 == 1) {
                minOdd = Math.min(minOdd, x);
            }
        }

        for (int x : nums1) {
            if (x % 2 == 0 && minOdd != Integer.MAX_VALUE && x < minOdd) {
                return false;
            }
        }

        return true;
    }
}
```

## ⏱️ Complexity

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

## 🎯 Key Takeaway

The main trick is to focus on the **smallest odd number**.

```text
Even number < smallest odd → impossible
Even number >= smallest odd → possible
```

This turns what looks like a construction problem into a simple `O(n)` check.
