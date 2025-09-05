public class JaggedArray {
        public static void main(String[] args){

            // declaring a 2D array with 2 rows
            int arr[][] = new int[2][];

            // Jagged array with custom
            // columns for each row
            arr[0] = new int[2];
            arr[1] = new int[4];

            // Initializing the array
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = count++;
                }
            }

            // Printing the values of 2D Jagged array
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.printf(arr[i][j] + " ");
                System.out.println();
            }
        }
    }
