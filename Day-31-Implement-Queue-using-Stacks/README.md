Day 31 - Implement Queue using Stacks
Problem
Implement a First-In-First-Out (FIFO) queue using only two stacks.

Implement the following methods:

push(x)

pop()

peek()

empty()

Example
Input

push(1)
push(2)
peek()
pop()
empty()
Output

1
1
false
Approach
Maintain two stacks:

Input Stack → Stores newly inserted elements.

Output Stack → Used for dequeue operations.

Push
Simply push into the input stack.

Pop / Peek
If the output stack is empty:

Move every element from the input stack to the output stack.

This reverses the order.

The oldest inserted element now appears on top.

Then perform pop or peek.

Dry Run
Initially

Input  = []
Output = []
Push 1

Input  = [1]
Output = []
Push 2

Input  = [1,2]
Output = []
Peek

Transfer

Input  = []
Output = [2,1]
Peek returns

1
Pop

Remove 1

Output = [2]
Complexity Analysis
Operation	Complexity
Push	O(1)
Pop	Amortized O(1)
Peek	Amortized O(1)
Empty	O(1)
Space Complexity: O(n)

Key Learning
Learned how two stacks can simulate a queue.

Understood amortized time complexity.

Reinforced stack operations.

Practiced designing custom data structures.

Takeaway
Sometimes combining simple data structures can efficiently implement more complex behavior. Two stacks together naturally produce queue semantics.
