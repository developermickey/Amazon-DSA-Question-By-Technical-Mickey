# Remove Duplicates from Sorted Array

This Java program demonstrates a solution to remove duplicates from a sorted array and return the number of unique elements.

## Problem Description

Given a sorted array of integers, the task is to remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in the array.

## Solution

The solution uses the **two-pointer technique**:

1. `i` tracks the position of the last unique element.
2. `j` iterates through the array.
3. When a new unique element is found (`A[i] < A[j]`), it is moved to the position `i + 1`.
4. The program returns `i + 1`, which is the count of unique elements.

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

## Usage

To use this program, follow these steps:

1. Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system.
2. Save the code in a file named `RemoveDuplicateArray.java`.
3. Open your terminal and navigate to the directory where the file is saved.
4. Compile the program using the following command:
   ```bash
   javac RemoveDuplicateArray.java

