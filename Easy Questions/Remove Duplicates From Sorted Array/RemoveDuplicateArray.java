public class RemoveDuplicateArray {
    public static int removeDuplicate(int[] A){
        int i = 0;
        int N = A.length;
        for(int j = 1; j<N; j++){
            if(A[j] != A[i]){
                i++;
                A[i] = A[j];
            }
        }

        return i+1;
        
    }
    public static void main(String[] args){
        int[] A = {0,1,1,1,2,2,3};
        System.out.println(removeDuplicate(A));

    }
}