Day 60 - Combination Sum
Problem
Given an array of distinct integers candidates and a target integer target, return all unique combinations where the chosen numbers sum to the target.

You may use the same number unlimited times.

Example
Input
candidates = [2,3,6,7]
target = 7
Output
[
 [2,2,3],
 [7]
]
Approach
This problem is solved using Backtracking.

Steps
Start with an empty combination.

Pick a candidate number.

Reduce the target by that number.

Continue exploring using the same candidate (since reuse is allowed).

If the target becomes 0, store the current combination.

If the target becomes negative, stop exploring that path.

Remove the last chosen element and try the next candidate.

Dry Run
Input

candidates = [2,3,6,7]
target = 7
Possible paths:

7
├── 2
│   ├── 2
│   │   ├── 2 ❌
│   │   └── 3 ✅ [2,2,3]
│   └── 3
├── 3
├── 6
└── 7 ✅ [7]
Final Answer

[
 [2,2,3],
 [7]
]
Complexity Analysis
Time Complexity: Exponential (depends on the number of valid combinations)

Space Complexity: O(target)

Recursion depth depends on the target value.

Key Learning
Backtracking

Recursion

Depth-First Search (DFS)

Building combinations

Pruning invalid paths

State restoration (Backtracking)

Takeaway
Backtracking is all about making a choice, exploring it, and undoing the choice to explore other possibilities. The current.remove(current.size() - 1) step is what enables the algorithm to backtrack and find every valid combination.
