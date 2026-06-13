# Day 14 - Plus One

## Problem

You are given a large integer represented as an integer array `digits`, where each digit represents a single digit of the integer.

Increment the integer by one and return the resulting array of digits.

### Example

Input:

[1,2,3]

Output:

[1,2,4]

Explanation:

123 + 1 = 124

---

## Approach

Traverse the array from right to left.

1. If the current digit is less than 9:
   - Increment it by 1.
   - Return the array.

2. If the digit is 9:
   - Set it to 0.
   - Continue carrying to the left.

3. If all digits are 9:
   - Create a new array of size n + 1.
   - Set the first element to 1.

Example:

[9,9,9]

↓

[1,0,0,0]

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

Note:
In the worst case (e.g., [9,9,9]), a new array of size n+1 is created. Excluding the returned output array, the auxiliary space is O(1).

---

## Key Learning

- Practiced carry propagation.
- Learned how to handle overflow in array-based number representations.
- Reinforced right-to-left traversal techniques.

---

## Takeaway

Many arithmetic problems on arrays mimic how we perform calculations manually, digit by digit from right to left.
