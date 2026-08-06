Day 66 - Container With Most Water
Problem
Given an integer array height, where each element represents the height of a vertical line, find two lines that together with the x-axis form a container capable of holding the maximum amount of water.

Return the maximum area.

Example
Input
height = [1,8,6,2,5,4,8,3,7]
Output
49
Approach
Place one pointer at the beginning and one at the end.

Compute the current area.

Update the maximum area.

Move the pointer pointing to the shorter line, since moving the taller one cannot improve the result.

Continue until both pointers meet.

Dry Run
left = 1
right = 7

Area = min(8,7) × 7 = 49

Maximum = 49
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Two Pointer technique

Greedy optimization

Maximizing area

Eliminating unnecessary comparisons

Takeaway
Instead of checking every pair of lines, use the insight that the shorter line limits the area. This allows the search space to shrink efficiently while still guaranteeing the optimal answer.
