public class Question_2 {
//    you are given a 2D integer matrix A, make all the elements in a
//    row or column zero if a[i][j]=0 specifically make entire ith row and jth column zero.
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 0;
        array[2][0] = 9;
        array[2][1] = 2;
        array[2][2] = 0;
        array[2][3] = 4;
        solution(array);
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[1].length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    static void solution(int[][] array){
        boolean[] rows = new boolean[3];
        boolean[] columns = new boolean[4];
        for(int i=0;i< rows.length;i++){
            rows[i] = false;
        }
        for(int i=0;i< columns.length;i++){
            columns[i] = false;
        }
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array[1].length;j++){
                if(array[i][j]==0){
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[1].length;j++){
                if(rows[i] == true || columns[j] == true){
                    array[i][j] = 0;
                }
            }
        }
    }
}
