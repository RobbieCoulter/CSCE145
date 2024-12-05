// Robert Coulter
import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ask user how much money they are spending
        System.out.print("How many dollars would you like to spend on chocolate from the vending machine? ");
        int dollars = scanner.nextInt();
        
        // make sure input is valid
        if (dollars < 0) {
            System.out.println("Invalid value for amount! Exiting the program!");
            return;
        }

        // number of chocolate bars
        int totalChocolates = 0;  
        // number of coupons
        int coupons = 0;  

        // each dollar buys 1 chocolate bar
        totalChocolates = dollars; 
        // each chocolate bar gives 1 coupon
        coupons = totalChocolates;  
        
        // use the coupons
        while (coupons >= 6) {
        	// 6 coupons to get a bar
            int extraChocolates = coupons / 6;  
            // add the extras to the total count
            totalChocolates += extraChocolates;  
            // coupon count
            coupons = coupons % 6 + extraChocolates;  
        }
        
        // display total output and leftover coupons
        System.out.println("You can buy " + totalChocolates + " chocolate bars and will have " + coupons + " coupons left!");
        
        scanner.close();
    }
}

