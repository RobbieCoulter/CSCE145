//Robert Coulter
import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		// Create scanner object for the user input
		Scanner scanner = new Scanner(System.in);
		// Acceleration based on gravity
		final double GRAVITY = 9.8; 
		// input for the initial velocity (u)
		System.out.print("Enter the initial velocity of the ball (in meter per second) at point A: ");
		double initialVelocity = scanner.nextDouble();
		// input for time taken(t)
		System.out.print("how much time (in seconds) does the ball take to reach point B? ");
		double time = scanner.nextDouble();
		// calculating the problems final velocity
		double finalVelocity = initialVelocity + (GRAVITY * time);
		// calculating distance traveled
		double distance = (initialVelocity * time) + (0.5 * GRAVITY * time * time);
		// output of the results
        System.out.printf("Final Velocity of the ball = %.1f m/s%n", finalVelocity);
        System.out.printf("Distance traveled by the ball (S) = %.1f meters%n", distance);		
		 
		
		
		

	}

}
