Problem

Given the head of a linked list, insert a new node containing the Greatest Common Divisor (GCD) of every pair of adjacent nodes.

Return the modified linked list.

Example

Input:

18 -> 6 -> 10 -> 3

Output:

18 -> 6 -> 6 -> 2 -> 10 -> 1 -> 3
Explanation
GCD(18, 6) = 6
GCD(6, 10) = 2
GCD(10, 3) = 1

These values are inserted between their respective nodes.

Approach
Step 1

Traverse the linked list node by node.

Step 2

For every adjacent pair:

current
current.next

calculate their GCD using Euclid's Algorithm.

Step 3

Create a new node containing the GCD value.

Step 4

Insert the node between the current node and the next node.

Complexity Analysis
Time Complexity
O(n × log(min(a,b)))
n = number of nodes
Each GCD computation takes O(log(min(a,b)))
Space Complexity
O(1)

Only a few pointers are used.

Step 5

Move to the next original node and continue.
