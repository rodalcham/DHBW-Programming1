import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game options
        String[] options = {"Rock", "Paper", "Scissors"};

        // Start the game
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors). Type 'exit' to quit:");

        while (true) {
            // Players choice
            System.out.print("Your choice: ");
            String playerChoice = scanner.nextLine();

            // Exit condition
            if (playerChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate players choice
            int playerIndex = -1;
            for (int i = 0; i < options.length; i++) {
                if (playerChoice.equalsIgnoreCase(options[i])) {
                    playerIndex = i;
                    break;
                }
            }
            if (playerIndex == -1) {
                System.out.println("Invalid choice. Please select Rock, Paper, or Scissors.");
                continue;
            }

            // Computers choice
            int computerIndex = random.nextInt(3);
            String computerChoice = options[computerIndex];
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (playerIndex==computerIndex){
                System.out.println("Tie");
            } else if (playerIndex == computerIndex + 1){
                if (computerIndex == 3){
                    computerIndex = 0;
                } 
                System.out.println("You win.");
            } else {
                System.out.println("You've lost.");
            }

        }

        scanner.close();
    }
}