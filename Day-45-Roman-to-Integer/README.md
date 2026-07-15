Day 45 - Roman to Integer
Problem
Roman numerals are represented by seven symbols:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Convert a Roman numeral into its integer value

Example 1
Input
s = "III"
Output
3
Example 2
Input
s = "LVIII"
Output
58
Explanation
L = 50
V = 5
III = 3

50 + 5 + 3 = 58
Example 3
Input
s = "MCMXCIV"
Output
1994
Explanation
M = 1000
CM = 900
XC = 90
IV = 4

1000 + 900 + 90 + 4 = 1994
Approach
Store the value of each Roman symbol in a HashMap.

Traverse the string from left to right.

If the current symbol is smaller than the next symbol, subtract its value.

Otherwise, add its value.

Return the accumulated result.

Dry Run
Input

MCMXCIV
Steps

M = +1000 = 1000

C before M
-100 = 900

M = +1000 = 1900

X before C
-10 = 1890

C = +100 = 1990

I before V
-1 = 1989

V = +5 = 1994
Final Answer

1994
Complexity Analysis
Time Complexity: O(n)

Traverse the string once.

Space Complexity: O(1)

Only seven Roman symbols are stored in the map.

Key Learning
Character-to-value mapping using HashMap.

Handling subtraction cases (IV, IX, XL, XC, CD, CM).

Efficient single-pass string traversal.

Takeaway
Looking one character ahead is often enough to solve parsing problems efficiently without needing complex logic.
