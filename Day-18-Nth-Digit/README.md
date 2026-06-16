# Day 18 - Nth Digit

## Problem

Given an integer `n`, return the nth digit in the infinite integer sequence:

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...

---

## Approach

Instead of generating the entire sequence, process numbers in groups:

* 1-digit numbers: 1 to 9 → 9 digits
* 2-digit numbers: 10 to 99 → 180 digits
* 3-digit numbers: 100 to 999 → 2700 digits

### Steps

1. Determine which digit-length group contains the nth digit.
2. Find the exact number containing the digit.
3. Find the digit's position inside that number.
4. Return the digit.

---

## Complexity Analysis

* Time Complexity: O(log n)
* Space Complexity: O(1)

---

## Key Learning

* Practiced mathematical pattern recognition.
* Learned how to process large numerical sequences efficiently.
* Avoided brute force generation of the sequence.

---

## Takeaway

Many seemingly huge problems become manageable when broken into logical groups and processed mathematically rather than simulated directly.
