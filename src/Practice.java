import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        // Fill the matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col<columns; col++) {
                matrix[row][col] = sc.nextInt();
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
