//Robert Coulter

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//array to store circles
		Circle[] circles = null;
		boolean running = true;
		
		 while (running) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Enter Circles' Data");
	            System.out.println("2. Sort and display circles' areas (smallest to largest)");
	            System.out.println("3. Sort and display circles' areas (largest to smallest)");
	            System.out.println("4. Display unique circles' areas");
	            System.out.println("5. Quit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
                case 1:
                    circles = enterCircleData(scanner);
                    break;
                case 2:
                    if (circles == null || circles.length == 0) {
                        System.out.println("No circles to sort! Please enter circle data first.");
                    } else {
                        sortCircles(circles, true);
                        displayCircleAreas(circles);
                    }
                    break;
                case 3:
                    if (circles == null || circles.length == 0) {
                        System.out.println("No circles to sort! Please enter circle data first.");
                    } else {
                        sortCircles(circles, false);
                        displayCircleAreas(circles);
                    }
                    break;
                case 4:
                    if (circles == null || circles.length == 0) {
                        System.out.println("No circles to analyze! Please enter circle data first.");
                    } else {
                        displayUniqueAreas(circles);
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }

    // enter circle data
    private static Circle[] enterCircleData(Scanner scanner) {
        int size;
        do {
            System.out.print("Enter the number of circles: ");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid size! Please enter a positive number.");
            }
        } while (size <= 0);

        Circle[] circles = new Circle[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            circles[i] = new Circle(radius);
        }
        return circles;
    }

    // sorts circles by the area
    private static void sortCircles(Circle[] circles, boolean ascending) {
        for (int i = 0; i < circles.length - 1; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                if ((ascending && circles[i].getArea() > circles[j].getArea()) ||
                    (!ascending && circles[i].getArea() < circles[j].getArea())) {
                    // change the circles order
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }

    // displays circle areas
    private static void displayCircleAreas(Circle[] circles) {
        System.out.println("Circle areas:");
        for (Circle circle : circles) {
            System.out.printf("%.2f ", circle.getArea());
        }
        System.out.println();
    }

    // display areas of circles
    private static void displayUniqueAreas(Circle[] circles) {
        boolean uniqueFound = false;
        System.out.println("Unique circle areas:");

        for (int i = 0; i < circles.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < circles.length; j++) {
                if (i != j && circles[i].getArea() == circles[j].getArea()) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.printf("%.2f ", circles[i].getArea());
                uniqueFound = true;
            }
        }

        if (!uniqueFound) {
            System.out.println("No unique circle areas found.");
        } else {
            System.out.println();
        }
    }
}

// circles radius
class Circle {
    private double radius;

    // initialize the circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // calculate and return the area of the circle
    public double getArea() {
        return 3.14 * radius * radius; 
    }

    // return the radius of the circle
    public double getRadius() {
        return radius;
    }
}