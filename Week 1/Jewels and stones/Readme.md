# Jewels and Stones :gem:

## Description
You're given strings `J` representing the types of stones that are jewels, and `S` representing the stones you have. Each character in `S` is a type of stone you have. You want to know how many of the stones you have are also jewels.

**The letters in `J` are guaranteed distinct**, and **all characters in `J` and  `S` are letters** having a length at most 50. **Letters are case sensitive**, so *a* is considered a different type of stone from *A*.

## Test Cases
**Example 1**
Input: `J = "aA", S = "aAAbbbb"`
Output: `3`

**Example 2**
Input: `J = "z", S = "ZZ"`
Output: `0`

## Solution
**Key Statements**
*  Elements in `J` are guaranteed distinct
*  Elements in `J` are case sensitive
*  Elements in `S` are the stones you have.

**Algorithm**
Visualizing the *stones* string as a sequence of characters. The solution that I propose is:

* Traverse the string char by char
> Using the Java method String.charAt(index), to get every char in string.

* If current stone is in Jewels container, the counter would be incremented.
> Cast current char, to char sequence and check if is contained in jewels string.
