//Robbie Coulter
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//personal information
		System.out.print("print your First Name: ");
		String firstName = input.nextLine();
		
		 System.out.print("Enter your Last Name: ");
	        String lastName = input.nextLine();

	        System.out.print("Enter your Age (in years): ");
	        int age = input.nextInt();
	        input.nextLine();  // Consume newline

	        System.out.print("Enter your Phone number (without dashes or parentheses): ");
	        String phone = input.nextLine();

	        System.out.print("Enter your Major: ");
	        String major = input.nextLine();

	        System.out.print("Enter your Year (Freshman, Sophomore, Junior, Senior): ");
	        String year = input.nextLine();

	        System.out.print("Enter Today's Date (mm/dd/yyyy): ");
	        String todaysDate = input.nextLine();

	        // hobby question
	        System.out.print("What is your favorite hobby?: ");
	        String hobby = input.nextLine();
	        //dream destination
	        System.out.print("What is your dream destination?: ");
	        String dreamDestination = input.nextLine();
	        //lucky number
	        System.out.print("Enter your lucky number: ");
	        int luckyNumber = input.nextInt();

	        // birth year question
	        int currentYear = Integer.parseInt(todaysDate.substring(todaysDate.lastIndexOf("/") + 1));
	        int birthYear = currentYear - age;

	        // Change the date entered into European format dd.mm.yyyy
	        String[] dateParts = todaysDate.split("/");
	        String europeanDate = dateParts[1] + "." + dateParts[0] + "." + dateParts[2];

	        // change phone number to (xxx)xxx-xxxx format
	        String formattedPhone = "(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6);

	        // display the info about the user
	        System.out.println("\n--- User Profile ---");
	        System.out.println("Meet " + firstName + " " + lastName + ", a " + year + " majoring in " + major + ".");
	        System.out.println("They are " + age + " years old, born in the year " + birthYear + ".");
	        System.out.println("Their phone number is " + formattedPhone + " and today's date is " + europeanDate + " (European format).");
	        System.out.println("They love to spend time on their favorite hobby: " + hobby + ".");
	        System.out.println("Someday, they wish to visit " + dreamDestination + ".");
	        System.out.println("Oh, and their lucky number is " + luckyNumber + "!");
	        
	        //close scanner
	        input.close();
	    }	
	}


