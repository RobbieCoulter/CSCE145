// Robbie Coulter
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Greeting to the user
        System.out.println("Welcome to the great adventure Game!");

        // First decision of the adventure
        System.out.println("You see two paths to your campsite. Do you go left or right? (left/right)");
        String path = input.nextLine();

        if (path.equals("left")) {
            // Second decision
            System.out.println("You find the river. How many stones do you throw to test the depth? (Enter a number)");
            int stones = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            if (stones > 5) {
                // End 1
                System.out.println("The river is too deep to cross. You turn back and find another route. [End 1]");
            } else {
                // Third decision
                System.out.println("You cross the river safely. Do you sit down for a rest or continue? (rest/continue)");
                String choice = input.nextLine();

                if (choice.equals("rest")) {
                    // Fourth decision
                    System.out.println("You wake up to a noise. Do you get up and investigate it or stay put? (investigate/stay)");
                    String noiseDecision = input.nextLine();
                    if (noiseDecision.equals("investigate")) {
                        // End 2
                        System.out.println("You find a treasure chest hidden in the bushes! [End 2]");
                    } else {
                        // End 3
                        System.out.println("A wild animal approaches and you run away to escape! [End 3]");
                    }
                } else {
                    // End 4
                    System.out.println("You continue and reach a mysterious old house! [End 4]");
                }
            }

        } else if (path.equals("right")) {
            // Second path (first decision on right path)
            System.out.println("You encounter an elf. Do you talk or run? (talk/run)");
            String wizardChoice = input.nextLine();

            if (wizardChoice.equals("talk")) {
                // Second decision
                System.out.println("The elf asks your age. Enter your age:");
                int age = input.nextInt();
                input.nextLine(); // Consume newline

                if (age >= 18) {
                    System.out.println("The elf offers you two magical items: a sword or a shield. Which do you choose? (sword/shield)");
                    String itemChoice = input.nextLine();

                    if (itemChoice.equals("sword")) {
                        // End 5
                        System.out.println("You defeat a dragon with your sword and become a hero! [End 5]");
                    } else {
                        // End 6
                        System.out.println("You block an incoming attack with the shield and survive! [End 6]");
                    }
                } else {
                    // End 7
                    System.out.println("The elf says you're too young and vanishes. You continue your journey. [End 7]");
                }

            } else {
                // Second branch
                System.out.println("You run and escape into the forest. Do you climb a tree or hide in a cave? (tree/cave)");
                String escapeChoice = input.nextLine();

                if (escapeChoice.equals("tree")) {
                    // End 8
                    System.out.println("You reach the village and find safety! [End 8]");
                } else {
                    // End 9
                    System.out.println("You stay hidden, but must find another way out. [End 9]");
                }
            }
        } else {
            // Default end (if there is an error)
            System.out.println("You were negligent with your answer and your journey has come to an end!  [End Default]");
        }

        input.close();
    }
}