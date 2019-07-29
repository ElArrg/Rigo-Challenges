# Happy Numbers :smile:

## Description
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

## Test Cases
**Example 1**
Input: `94`
Output: `*true*`

**Explanation**
> 9<sup>2</sup> + 4<sup>2</sup> = 97
>
> 9<sup>2</sup> + 7<sup>2</sup> = 130
>
> 1<sup>2</sup> + 3<sup>2</sup> + 0<sup>2</sup> = 10
>
> 1<sup>2</sup> + 0<sup>2</sup>= 1 **It's a happy number**.

## Solution
**Key Statements**
*  **Positive numbers**: negative or zero are unhappy
*  **Either you get 1 or it loops endlessly**: if you get a previous number again you are inside an infinite loop.

**Algorithm**
Focusing in the second key statement, you can use a data structure that helps you to track every number to avoid getting into an infinite loop. The solution that I propose is:

* Use a **Set** data structure to keep track of unique elements
> Set data structure guarantees that every element in it is unique.

* While the current number is not 1, you will sum the squares of the digits for the current number being this sum, your new number.
> 94 -> 9<sup>2</sup> + 4<sup>2</sup> = 97
>
> 97 is now your current number.

* You will add every number before calculating a new one.
> If it already exist the number, this will keep you out from a infinite loop.