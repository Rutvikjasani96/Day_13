public class Question_1 {
//    Given an integer array of size n, you can pick B elements from either left or right end of the array
//    A to get maximum sum find & return this maximum possible sum.
    public static void main(String[] args) {
        int[] array = {5,-2,3,1,2};
        int b = 3;
        int ans = solution(array,b);
        System.out.println("Ans : "+ans);
    }
    static int solution(int[] array,int b){
        int max_sum=0;
        for(int i=0;i< b;i++){
            max_sum = max_sum + array[i];
        }
        int i=b-1;
        int j= array.length-1;
        int sum = max_sum;
        while(i>0){
            sum = sum - array[i] + array[j];
            i--;
            j--;
            if(max_sum<sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}
