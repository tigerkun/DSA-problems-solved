Day 87 - Lexicographically Smallest Permutation Greater Than Target
🚀 LeetCode #3720
Problem

You are given two strings:

s
target

Rearrange the characters of s to create the lexicographically smallest permutation that is strictly greater than target.

If no such permutation exists, return an empty string.

💡 Approach

Use Greedy + Backtracking.

We process target from left to right.

At every position:

1. Try using the same digit as target.
2. If that fails, try the smallest larger digit.
3. Once we choose a larger digit,
   put all remaining digits in sorted order.
🔍 Example

Suppose:

s = "123"
target = "132"

Try matching:

1 = 1
3 = 3
2 = 2

This produces:

132

But we need a string strictly greater than 132.

So we backtrack.

At the last position there is no larger digit available.

Move back:

13

We cannot increase 3 using the remaining digits.

Move back again:

1

Now choose the smallest available digit greater than 1:

2

Then append the remaining digits in sorted order:

2 + 3

Result:

123

Since 123 < 132, this particular case has no valid answer.

The algorithm therefore returns:

""
🧠 Key Idea

The most important observation is:

Stay equal to the target for as long as possible. When equality can no longer lead to a valid answer, backtrack and make the smallest possible increase.

Once we make the answer larger:

answer prefix > target prefix

the rest should be arranged in ascending order to make the complete answer as small as possible.
