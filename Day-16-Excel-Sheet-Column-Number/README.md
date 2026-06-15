# Day 16 - Excel Sheet Column Number

## Problem

Given a string `columnTitle` that represents the column title as it appears in an Excel sheet, return its corresponding column number.

Explanation:

A = 1
B = 2

AB = (1 × 26) + 2 = 28

---

## Approach

Treat the column title as a Base-26 number.

Rules:

- A = 1
- B = 2
- ...
- Z = 26

For each character:

result = result × 26 + currentCharacterValue

This is similar to converting a number from another base to decimal.

---

## Dry Run

Input:

AB

Step 1:

result = 0 × 26 + 1 = 1

Step 2:

result = 1 × 26 + 2 = 28

Output:

28

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

where n is the length of the column title.

---

## Key Learning

- Practiced Base-26 number conversion.
- Learned how Excel column labels map to numeric values.
- Reinforced positional notation concepts.

---

## Takeaway

Many string problems become easier when viewed as number system conversion problems.
