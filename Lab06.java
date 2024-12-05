//Robert Coulter

import java.util.Scanner;

public class Lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 //ask the user the height of the triangle 
		 System.out.print("Enter the height of the triangle: ");
		 int height = scanner.nextInt();
		 
		 // draw the top half of the triangle
		 for (int i = 1; i <= height; i++) {
			 for (int j = 1; j <= i; j++) {
				 System.out.print("*"); 
			 }
			 // moves to the next line
			 System.out.println();
		 }
		 
		 // draws the bottom half of the line
		 for (int i = height - 1; i > 0; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            //move to the next line
	            System.out.println();      
		 }

	        // end the program
	        System.out.println("End of program!");

	        // Close the scanner to free resources
	        scanner.close();
	    }
	}