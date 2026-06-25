Day 25 - Remove Duplicates from Sorted List II
Problem
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1
Input:

1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
Output:

1 -> 2 -> 5
Example 2
Input:

1 -> 1 -> 1 -> 2 -> 3
Output:

2 -> 3
Approach
Unlike the simpler duplicate-removal problem, here we must remove all occurrences of duplicated values.

Steps
Create a dummy node before the head.

Use prev to track the last confirmed unique node.

Detect duplicate sequences.

Skip the entire duplicate block.

Continue traversal.

The dummy node helps handle cases where duplicates occur at the beginning.

Dry Run
Input:

1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
Duplicate block:

3 -> 3
Remove both.

List becomes:

1 -> 2 -> 4 -> 4 -> 5
Duplicate block:

4 -> 4
Remove both.

Final:

1 -> 2 -> 5
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Practiced advanced linked list traversal.

Learned how to remove entire duplicate groups.

Reinforced the Dummy Node pattern.

Improved pointer manipulation skills.

Takeaway
Dummy nodes often simplify linked list problems by eliminating special handling for head-node modifications.
