import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintsNewLine {
    static int[] newLine(int[][] mat) {
        int rows =mat.length;
        int columns= mat.length;
        int []result = new int[rows];
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<columns;j++){
                sum += mat[i][j];

            }
            result[i]=sum;

        }
       return result;


    }

    public static void main(String[] args) {
     int[][]  mat=  {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

     int[]sums =newLine(mat);
        System.out.println(Arrays.toString(sums));
    }
}

