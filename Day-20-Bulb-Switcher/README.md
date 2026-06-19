Problem
There are n bulbs that are initially off.

You perform n rounds:

Round 1: Toggle every bulb.

Round 2: Toggle every 2nd bulb.

Round 3: Toggle every 3rd bulb.

...

Round n: Toggle only the nth bulb.

Return the number of bulbs that remain ON after all rounds.

Example
Input:

n = 3
Output:

1
Explanation:

Bulb 1 → ON
Bulb 2 → OFF
Bulb 3 → OFF
Only one bulb remains ON.

Key Observation
A bulb is toggled once for every divisor it has.

Example:

Bulb 12
Divisors: 1, 2, 3, 4, 6, 12
It gets toggled 6 times (even), so it ends OFF.

Most numbers have divisors in pairs:

1 × 12
2 × 6
3 × 4
Therefore they have an even number of divisors.

However, perfect squares have one divisor pair that repeats:

16

1 × 16
2 × 8
4 × 4
Since 4 is counted only once, perfect squares have an odd number of divisors.

Bulbs with odd toggles remain ON.

Therefore:

Only perfect square numbered bulbs remain ON.
Approach
Count how many perfect squares are less than or equal to n.

That count is:

⌊√n⌋
Java Solution
class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
Complexity Analysis
Time Complexity: O(1)

Space Complexity: O(1)

Key Learning
Mathematical observation can eliminate simulation completely.

Perfect squares have an odd number of divisors.

Not every problem needs iteration; sometimes the pattern is the solution.
