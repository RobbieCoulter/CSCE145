//Robert Coulter
import java.util.Random;
import java.util.Scanner;

public class Homework03 {
    
    // determines winner of the round
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "draw";
        } else if ((player.equals("rock") && computer.equals("scissors")) ||
                   (player.equals("scissors") && computer.equals("paper")) ||
                   (player.equals("paper") && computer.equals("rock"))) {
            return "player";
        } else {
            return "computer";
        }
    }
    
    // makes computer pick randomly between rock, paper, and scissors
    public static String getComputerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3); 
        switch(choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
    }
    
    // play a round
    public static String playRound(Scanner input) {
        System.out.print("Enter rock, paper, or scissors: ");
        String playerChoice = input.nextLine().toLowerCase();
        
        // make sure input is valid
        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Invalid choice! Computer gets a point.");
            return "computer";
        }
        
        String computerChoice = getComputerChoice();
        System.out.println("Computer chose: " + computerChoice);
        
        return determineWinner(playerChoice, computerChoice);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        
        while (playAgain) {
            int playerScore = 0;
            int computerScore = 0;
            int round = 0;
            
            // need 2 out of 3 overall to win
            while (round < 3) {
                System.out.println("\nRound " + (round + 1) + "!");
                String winner = playRound(input);
                
                if (winner.equals("player")) {
                    System.out.println("You won this round!");
                    playerScore++;
                } else if (winner.equals("computer")) {
                    System.out.println("Computer won this round!");
                    computerScore++;
                } else {
                    System.out.println("This round is a draw!");
                }
                
                round++;
            }
            
            // determine the final winner
            if (playerScore > computerScore) {
                System.out.println("\nYou win the game with a score of " + playerScore + " to " + computerScore + "!");
            } else if (computerScore > playerScore) {
                System.out.println("\nComputer wins the game with a score of " + computerScore + " to " + playerScore + "!");
            } else {
                System.out.println("\nIt's a tie!");
            }
            
            // ask user for rematch 
            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        
        input.close();
    }
}
