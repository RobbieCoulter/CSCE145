//Robert Coulter

import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		// asks for the dimensions of the first matrix
		System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();
        
        // asks for dimensions of matrix
        int rows2, cols2;
        do {
            System.out.print("Enter the number of rows for the second matrix: ");
            rows2 = scanner.nextInt();
            System.out.print("Enter the number of columns for the second matrix: ");
            cols2 = scanner.nextInt();

            if (rows1 != rows2 || cols1 != cols2) {
                System.out.println("Error: Dimensions do not match. Please try again.");
            }
        } while (rows1 != rows2 || cols1 != cols2);
        
        //initialize matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        
        //get the values of the first matrix
        System.out.println("Enter values for the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        //get the values of the second matrix
        System.out.println("Enter values for the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        //add the matrices
        int[][] result = addMatrices(matrix1, matrix2);
        
        //display the results
        System.out.println("Result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
	//add the two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //return the results
        return result;
    }
}