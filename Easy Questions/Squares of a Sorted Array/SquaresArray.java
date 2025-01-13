public class SquaresArray {

    public static int[] SquaresAr(int[] A){
        int N = A.length;
        int[] ans = new int[N];

        int i = 0;
        int j = N-1;
        int x = N-1;

        while(i<=j){
            int left = A[i] * A[i];
            int right = A[j] * A[j];
            if(left > right){
                ans[x--] = left;
                i++;
            }else{
                ans[x--] = right;
                j--;
            }
        }



        return  ans;
    }
    public static void main(String[] args) {
        int[] A = {-7,-3,2,3,11};
        System.out.println(SquaresAr(A));

    }
}