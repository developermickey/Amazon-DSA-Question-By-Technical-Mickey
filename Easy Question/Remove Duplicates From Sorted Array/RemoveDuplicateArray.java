public class RemoveDuplicateArray {
    public static int findK(int[] A){
        int i = 0;
        for(int j = 1; j < A.length; j++){
            if(A[i] < A[j]){
                int temp = A[i+1];
                A[i+1] = A[j];
                A[j] = temp;
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] A = {0,1,1,1,2,2,3};
        System.out.println(findK(A));

    }
}