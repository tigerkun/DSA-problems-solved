Day 70 - Koko Eating Bananas
Problem

Koko has several piles of bananas and h hours to eat them.

At speed k, she eats at most k bananas per hour from one pile.

Find the minimum integer eating speed that allows her to finish all bananas within h hours.

Example
piles = [3,6,7,11]
h = 8

Output:

4

At speed 4:

3  → 1 hour
6  → 2 hours
7  → 2 hours
11 → 3 hours

Total:

1 + 2 + 2 + 3 = 8 hours

So the minimum speed is 4.

Approach

The answer must lie between:

1 → max(piles)

Use Binary Search to find the smallest valid speed.

For each speed:

hours += (p + speed - 1) / speed;

This calculates the ceiling of:

p / speed
Complexity
Time: O(n log m)
Space: O(1)

Where m = max(piles).

Key Learning

Binary Search doesn't always search an array.

If a problem has a monotonic answer space—where all values after a certain point become valid—Binary Search can often find the optimal answer efficiently.
