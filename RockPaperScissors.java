import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.println("\nPlease enter your move: ");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("0. Exit");

            int playerMove = scanner.nextInt();

            if (playerMove == 0) {
                System.out.println("Thank you for playing. Goodbye!");
                break;
            }

            if (playerMove < 1 || playerMove > 3) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            int computerMove = random.nextInt(3) + 1;

            System.out.println("Player chooses: " + moveToString(playerMove));
            System.out.println("Computer chooses: " + moveToString(computerMove));

            int result = determineWinner(playerMove, computerMove);

            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }

    private static String moveToString(int move) {
        switch (move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid";
        }
    }

    private static int determineWinner(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            return 0; // Tie
        }

        if ((playerMove == 1 && computerMove == 3) ||
                (playerMove == 2 && computerMove == 1) ||
                (playerMove == 3 && computerMove == 2)) {
            return 1; // Player wins
        }

        return 2; // Computer wins
    }
}
