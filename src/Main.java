import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            String playerA;
            String playerB;

            // Player A validation
            do {
                System.out.print("Player A - Enter R, P, or S: ");
                playerA = input.next();

                if (!(playerA.equalsIgnoreCase("R")
                        || playerA.equalsIgnoreCase("P")
                        || playerA.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid move. Try again.");
                }

            } while (!(playerA.equalsIgnoreCase("R")
                    || playerA.equalsIgnoreCase("P")
                    || playerA.equalsIgnoreCase("S")));

            // Player B validation
            do {
                System.out.print("Player B - Enter R, P, or S: ");
                playerB = input.next();

                if (!(playerB.equalsIgnoreCase("R")
                        || playerB.equalsIgnoreCase("P")
                        || playerB.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid move. Try again.");
                }

            } while (!(playerB.equalsIgnoreCase("R")
                    || playerB.equalsIgnoreCase("P")
                    || playerB.equalsIgnoreCase("S")));

            // Determine winner
            if (playerA.equalsIgnoreCase(playerB)) {

                if (playerA.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock - It's a Tie!");
                } else if (playerA.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper - It's a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors - It's a Tie!");
                }

            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors - Player A wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors - Player B wins!");

            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock - Player A wins!");

            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock - Player B wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper - Player A wins!");

            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts Paper - Player B wins!");
            }

            System.out.print("\nPlay Again? [Y/N]: ");
            playAgain = input.next();
            System.out.println();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}