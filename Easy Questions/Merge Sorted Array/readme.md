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
public class MergeSortArray {
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1; // Index of last element in A
        int j = n - 1; // Index of last element in B
        int x = m + n - 1; // Index of last position in merged A
        
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[x--] = A[i--];
            } else {
                A[x--] = B[j--];
            }
        }
        while(j>=0){
            A[x--] = B[j--];
        }
    }
    public static void main(String[] args){
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] B = {2, 5, 6};
        int m = 3; // Number of elements in A
        int n = 3;

        merge(A, m, B, n);

        for(int i = 0; i<6; i++){
            System.out.print(A[i] + " ");
        }

    }
}
```

## Running the Program

To run the program:

1. Copy the Java code into a file named `MergeSortArray.java`.
2. Compile the Java program:
   ```bash
   javac MergeSortArray.java
