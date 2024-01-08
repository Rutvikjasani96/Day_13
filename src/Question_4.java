import java.util.ArrayList;
import java.util.List;

public class Question_4 {
//    you are given an integer array A of length n. comprising of 0's & 1's and an integer B.
//    you have too till the indices of the array A. that can act as center of 2B+1 length 0-1 alternative subarrays.
    public static void main(String[] args) {
        int[] array = {1,0,1,0,1};
        List ans = new ArrayList();
        int b = 1;
        int k = (2*b)+1;
        int i = 0;
        int j = k-1;
        int mid = 0;
        while(j< array.length){
            if(Alternating.isAlternating(i,j,array)){
                mid = (i+j)/2;
            }
            ans.add(mid);
            i++;
            j++;
        }
        System.out.println(ans);
    }
}
