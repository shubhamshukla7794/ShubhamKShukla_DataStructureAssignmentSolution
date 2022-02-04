# Great Learning - Data Structure Assignment Solution

This repository contains the Graded Assignment 3 - Data Structure Assignment for Great Learning for [**Great Learning - FSD Course**](https://www.greatlearning.in/advanced-certification-full-stack-software-development-iit-roorkee)


## Details

### Problem Statement 1

- ### Skyscraper
  > Build a program that will help analyze the construction process of skyscraper with the following conditions :
  > - The skyscraper needs to be constructed in N days
  > - Every day a floor is constructed in a separate factory of distinct size.
  > - The floor with the larger size must be placed at the bottom of the building.
  > - The floor with the smaller size must be placed at the top of the building.
  > - A floor cannot be assembled in the building until all floors larger in size are placed.

- ### Binary Search Tree into Right Skewed Tree
  > Given a Binary Search Tree, modify the existing BST such that it should not contain any left node.




### Solution Details

- ### Skyscraper
  > #### USING LINKED LIST
  > 
  > - Linked List node contains two data - *`day`* and *`floor`* 
  > - Sorting the list based on *`floor`* using Merge Sort in descending order so that we can get the largest floor size on the top.
  > + Iterate over number of floors of the building
  >     + check that the current day is equal to the day of the availability of the largest floor size   
  >        + if yes, then print the next floors till the day of availability of lower value floors is less than the higher value floors.
  >        + post loop update the largest floor size 
  > #### USING STACK
  > - Add the floor size in the ArrayList and simultaneously calculate the highest value
  > - Iterate over ArrayList.
  > - If highest value is equal to current value of ArrayList, print the value.
  >     + then if stack is not empty and the next value of the stack is one less than current printed then pop values from stack and print it till the condition becomes false.
  >     + update the highest value
  > - Else push the value in the stack. 

- ### Binary Search Tree into Right Skewed Tree
  > - In Binary Search Tree, the Inorder traversal will give the values in ascending order  
  > - Using Inorder Traversal reach the leftmost value of the Binary Search Tree (It will be the lowest value)
  > - With the help of recursion traverse the tree and modify to Right Skewed Tree

Both the solution contains a Driver class which contains the `main()` method to run the program. 


##  Author
Project created by :  **SHUBHAM KUMAR SHUKLA**