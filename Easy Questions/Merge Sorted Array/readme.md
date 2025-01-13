# Merge Sort Array in Java

This is a Java program that merges two sorted arrays into one sorted array. The program uses the **merge** technique of the Merge Sort algorithm to combine the elements from two arrays into a single array in a sorted order.

## Problem Description

You are given two arrays `A` and `B`. The array `A` has extra space at the end to accommodate the elements of array `B`. The goal is to merge the elements of `B` into `A` such that `A` remains sorted.

### Example:
- Input:
    - `A = {1, 2, 3, 0, 0, 0}`
    - `B = {2, 5, 6}`
    - `m = 3` (Number of elements in A)
    - `n = 3` (Number of elements in B)
- Output:
    - `A = {1, 2, 2, 3, 5, 6}`

## Code Explanation

- The program defines a `merge` function that takes two arrays (`A` and `B`), along with their respective lengths `m` and `n`.
- It merges the two arrays starting from the last index of both arrays to minimize shifting elements in array `A`.
- After all elements from array `B` are merged into `A`, any remaining elements in array `A` are left untouched.
- The result is a merged sorted array in `A`.

## How It Works

1. **Initialization**: 
   - Start with the last elements of both arrays (`A` and `B`).
   - Use a variable `x` to track the position in the merged array (`A`).
   
2. **Merging**:
   - Compare the elements from the end of both arrays.
   - Place the larger of the two elements in the last position of `A`.
   - Move the indices of the arrays `A` and `B` accordingly.

3. **Remaining Elements**:
   - If there are remaining elements in array `B`, place them in array `A`.

4. **Final Output**:
   - Array `A` now contains the merged sorted elements.

---

### Code

```java
public class RemoveDuplicateArray {
    public static int findK(int[] A) {
        int i = 0;
        for (int j = 1; j < A.length; j++) {
            if (A[i] < A[j]) {
                int temp = A[i + 1];
                A[i + 1] = A[j];
                A[j] = temp;
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 1, 1, 2, 2, 3};
        System.out.println("Number of unique elements: " + findK(A));
    }
}
```

## Running the Program

To run the program:

1. Copy the Java code into a file named `MergeSortArray.java`.
2. Compile the Java program:
   ```bash
   javac MergeSortArray.java
