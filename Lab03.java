import java.util.Scanner;

public class Lab03 {

    // Constants
    static final double SOFTWARE_PRICE = 99.00;

    public static void main(String[] args) {
        // Creates a scanner to get the user's input
        Scanner scanner = new Scanner(System.in);

        // asks the user how amny packages are being bought
        System.out.println("Enter the total number of software packages ordered:");

        // Check if input is valid (if it is an integer and not negative)
        if (scanner.hasNextInt()) {
            int quantity = scanner.nextInt();

            if (quantity < 1) {
                System.out.println("Invalid value for package count! Exiting the program!");
                return;
            }

            // Calculate the discount percentage based on the quantity
            double discountPercentage = 0.0;

            if (quantity >= 10 && quantity <= 19) {
                discountPercentage = 20.0;
            } else if (quantity >= 20 && quantity <= 49) {
                discountPercentage = 30.0;
            } else if (quantity >= 50 && quantity <= 99) {
                discountPercentage = 40.0;
            } else if (quantity >= 100) {
                discountPercentage = 50.0;
            }

            // Calculate the total bill before discount
            double totalBeforeDiscount = quantity * SOFTWARE_PRICE;

            // Calculate the discount amount
            double discountAmount = totalBeforeDiscount * (discountPercentage / 100);

            // Calculate total after the discount is applied
            double totalAfterDiscount = totalBeforeDiscount - discountAmount;

            // Displays the results
            System.out.printf("Total Bill Amount (before discount) = $%.2f%n", totalBeforeDiscount);
            System.out.printf("Amount of discount = $%.2f%n", discountAmount);
            System.out.printf("Total Bill Amount (after discount) = $%.2f%n", totalAfterDiscount);

        } else {
            System.out.println("Invalid value for package count! Exiting the program!");
        }
    }
}
