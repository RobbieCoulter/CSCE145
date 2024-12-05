//Robbie Coulter
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // asks user how many books are bought
        System.out.println("How many books did you purchase at BN booksellers this month?");
        int booksPurchased = input.nextInt();
        
        // make sure input is valid
        if (booksPurchased < 0) {
            System.out.println("Invalid value entered! Exiting the program!");
        } else {
            // Determine the points earned
            int pointsEarned;
            switch (booksPurchased) {
                case 0:
                    pointsEarned = 0;
                    break;
                case 1:
                    pointsEarned = 5;
                    break;
                case 2:
                    pointsEarned = 15;
                    break;
                case 3:
                    pointsEarned = 30;
                    break;
                default:
                    pointsEarned = 60; // 4 or more books
                    break;
            }

            // Display the messages based on number of books bought
            if (pointsEarned == 0) {
                System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
            } else {
                System.out.println("Congratulations!!! You have earned " + pointsEarned + " points!");
                System.out.println("You may redeem these points on your next book purchase!");
            }
        }
        
        // Close the scanner object
        input.close();
    }
}