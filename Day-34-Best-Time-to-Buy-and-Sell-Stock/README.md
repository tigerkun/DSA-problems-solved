Day 34 - Best Time to Buy and Sell Stock
Problem
You are given an array prices where prices[i] is the price of a stock on the iᵗʰ day.

Choose one day to buy the stock and a later day to sell it to maximize your profit.

Return the maximum possible profit. If no profit can be made, return 0.

Example
Input
prices = [7,1,5,3,6,4]
Output
5
Explanation
Buy at price 1 and sell at price 6.

Profit = 6 − 1 = 5

Approach
Traverse the array once.

Keep track of the minimum stock price seen so far.

For every price:

Calculate the profit if sold today.

Update the maximum profit if it's better.

This avoids checking every pair of days.

Dry Run
Input

[7,1,5,3,6,4]
Price	Min Price	Max Profit
7	7	0
1	1	0
5	1	4
3	1	4
6	1	5
4	1	5
Answer:

5
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)

Key Learning
Learned how to optimize a brute-force O(n²) solution into O(n).

Practiced maintaining running minimum and maximum values.

Reinforced greedy thinking.

Takeaway
Keeping track of the best value seen so far is a common optimization technique in array problems.
