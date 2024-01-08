public class Question_3 {
//    given an integer A, generate a square matrix filled with elements from 1 to A2(A square) in spiral order.
    public static void main(String[] args) {
        int a = 5;
        solution(a);
    }
    static void solution(int a){
        int[][] array = new int[a][a];
        int i=0;
        int j=0;
        int val=1;
        while(a>1){
            for(int k=1;k<a;k++){     //left to right
                array[i][j] = val;
                j++;
                val++;
            }
            for(int k=1;k<a;k++){    //top to bottom
                array[i][j]=val;
                i++;
                val++;
            }
            for(int k=1;k<a;k++){     //right to left
                array[i][j]=val;
                j--;
                val++;
            }
            for(int k=1;k<a;k++){     //bottom to top
                array[i][j]=val;
                i--;
                val++;
            }
            a=a-2;
            i++;
            j++;
        }
        if(a==1)
        {
            array[i][j]=val;
        }
        for(int k=0;k< array.length;k++){     //Print the array
            for(int l =0;l<array[1].length;l++){
                System.out.print(" "+array[k][l]);
            }
            System.out.println();
        }
    }
}
