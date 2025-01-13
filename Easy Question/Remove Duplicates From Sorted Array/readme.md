# Remove Duplicates from Sorted Array

This Java program demonstrates a solution to remove duplicates from a sorted array and return the number of unique elements.

## Problem Description

Given a sorted array of integers, the task is to remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in the array.

## Solution

The `RemoveDuplicateArray` class contains a method `findK` that solves this problem:

1. It uses two pointers, `i` and `j`.
2. `i` keeps track of the position where the next unique element should be placed.
3. `j` iterates through the array.
4. When a new unique element is found (i.e., `A[i] < A[j]`), it is swapped with the element at position `i+1`.
5. The method returns `i+1`, which represents the number of unique elements.

## Usage

To use this program:

1. Ensure you have Java installed on your system.
2. Save the `RemoveDuplicateArray.java` file.
3. Compile the Java file: