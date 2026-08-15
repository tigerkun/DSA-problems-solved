# Day 74 - Integer to Roman

## 🚀 LeetCode #12

### Problem

Given an integer, convert it to a Roman numeral.

Roman numerals use the following symbols:

| Symbol | Value |
| ------ | ----: |
| I      |     1 |
| V      |     5 |
| X      |    10 |
| L      |    50 |
| C      |   100 |
| D      |   500 |
| M      |  1000 |

### Example

**Input:**

```text
num = 3749
```

**Output:**

```text
"MMMDCCXLIX"
```

### 💡 Approach

Use a **greedy approach**.

Store the Roman numeral values from largest to smallest, including special cases such as:

```text
900 → CM
400 → CD
90  → XC
40  → XL
9   → IX
4   → IV
```

For each value:

1. Check if the number is greater than or equal to that value.
2. Add the corresponding Roman symbol.
3. Subtract the value from the number.
4. Continue until the number becomes zero.

### Example

For:

```text
3749
```

We process:

```text
3000 → MMM
700  → DCC
40   → XL
9    → IX
```

Therefore:

```text
3749 = MMMDCCXLIX
```

### ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)` auxiliary space

Since Roman numerals have a fixed set of 13 possible values, the lookup arrays use constant space.

### 📌 Key Takeaway

The main idea is:

```text
Take the largest possible value
        ↓
Add its Roman symbol
        ↓
Subtract the value
        ↓
Repeat
```

This is a classic example of a **Greedy Algorithm**.

### 🔗 LeetCode

**Problem:** Integer to Roman
**LeetCode:** #12
**Difficulty:** Medium
