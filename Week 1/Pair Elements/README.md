# Pair Elements :bacon:

## Description
  Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears once.

## Test Cases
**Example 1**
Input: `{ 1,1,2,3,3,4,4,8,8 }`
Output: `2`

**Example 2**
Input: `{ 3,3,7,7,10,11,11 }`
Output: `10`

**Example 3**
Input: `{ 1, 1, 2, 2, 3, 3, 4, 4, 8 }`
Output: `8`

**Example 4**
Input: `{ 1, 2, 2, 3, 3, 4, 4, 8, 8 }`
Output: `1`

## Solution
**Key Statements**
* **Every element appears twice**: you should expect an element at most twice in the array.
* **Array is sorted**: it means all elements will be next to it's pair.
* **Only 1 single element**: Array lenght will be odd.

**Algorithm**
Being the array's length an odd number and elements appearing as a pair. 
The solution that I propose is:
* Traverse the array 2 elements at a time
  >You will be able to treat them as a pair of elements
  
* If there is not a pair to work with, you've find the single element.
  > It might be either a single element array or the last element in array.
  
* If there is a pair to work with, you must check that both elements are not different.
  > If the elements for current pair are different, then the first element (left) is the single one.
  > Why? Because the next element for the second element (right) in the pair must be a pair for the second one.
  > Example [**1,2**,2], [1,1,**2,3**,3] (Being the elements in bold, the current pair).