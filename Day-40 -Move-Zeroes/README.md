Day 40 - Move Zeroes
Problem

Given an integer array nums, move all 0s to the end while maintaining the relative order of the non-zero elements.

The operation must be performed in-place.

Example

Input

[0,1,0,3,12]

Output

[1,3,12,0,0]
Approach

Use one pointer (index) to track where the next non-zero element should go.

Traverse the array.
Copy every non-zero element to index.
Fill the remaining positions with zeroes.
Dry Run

Input

[0,1,0,3,12]

After copying non-zero values:

[1,3,12,3,12]

Fill remaining positions:

[1,3,12,0,0]
Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Key Learning
Two Pointer Technique
In-place array modification
Stable ordering
Takeaway

Many in-place array problems can be solved by maintaining a pointer to the next valid position instead of performing multiple swaps.
