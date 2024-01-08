public class Alternating {
//    given start and end index. you need to return true if the subarray[s...e] is alternating, else return false.
    public static void main(String[] args) {
        int[] array = {0,0,0,1,1,0,1};
        int s = 1;
        int e = 5;
        boolean ans = isAlternating(s,e,array);
        System.out.println("Ans : "+ans);
    }
    static boolean isAlternating(int s,int e ,int[] array){
        for(int i=s;i<e;i++){
            if(array[i]==array[i+1]){
                return false;
            }
        }
        return true;
    }
}
