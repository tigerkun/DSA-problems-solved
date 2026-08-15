# Day 73 - Roman to Integer

## 🚀 LeetCode #13

### Problem

Given a Roman numeral, convert it into an integer.

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

When a smaller value appears before a larger value, it is subtracted.

For example:

* `IV = 4`
* `IX = 9`
* `XL = 40`
* `CM = 900`

### Example

**Input:**

```text
s = "MCMXCIV"
```

**Output:**

```text
1994
```

### 💡 Approach

Traverse the string from left to right.

For each Roman numeral:

* If its value is smaller than the next character's value, subtract it.
* Otherwise, add it to the result.

For example:

```text
M C M X C I V
```

```text
1000 - 100 + 1000 - 10 + 100 - 1 + 5
= 1994
```

This allows the entire string to be processed in a single traversal.

### ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

where `n` is the length of the Roman numeral.

### 📌 Key Takeaway

The main logic is:

```text
Current value < Next value → Subtract
Current value >= Next value → Add
```

This avoids checking every possible Roman numeral combination separately.

### 🔗 LeetCode

**Problem:** Roman to Integer
**LeetCode:** #13
**Difficulty:** Easy
