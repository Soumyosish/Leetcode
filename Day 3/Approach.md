Intuition
To Solve the problem we need to understand the edge cases and the constraints given properly so that using dp with two variables can be the easiest approach.

(a)At first the combination ending with ABA pattern (two side cells same color, middle different).
For row 1: 3 choices × 2 middle colors = 6.

(b)Next edge case: Ways ending with ABC pattern (all three cells different colors).
For row 1: 3! = 6 permutations.

Approach
Checking the condition if the user input is 1 then return 12 because it will follow both the patterns ABA and ABC with sum of 12

Next conditions come when the user gives the number greater than 1,
we will take the largest posssible number given in the constraint and continue with the for loop here we will calculate using the two patterns mentioned above and also it will continue in the loop until it reaches to the number.

At last we will calculate the sum of the two numbers and return the number after getting the remainder by division of the largest number that has been initialized before.

Complexity
Time complexity:
O(n)

Space complexity:
O(1)