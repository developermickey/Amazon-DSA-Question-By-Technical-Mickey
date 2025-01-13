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
