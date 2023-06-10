
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {

        ArrayList<String> powers = new ArrayList<>();
        powers.add(0, "paper");
        powers.add(1, "rock");
        powers.add(2, "scissors");

        int computerWinCounter = 0;
        int playerWinCounter = 0;

        System.out.println("Welcome to the RockPaperScissors game!");
        System.out.println("Rules are easy: paper beats rock, rock beats scissors and scissors beats paper...That's it!");
        System.out.println("Choose one from powers: paper, rock or scissors and win with your opponent");
        System.out.println("First who get 3 wins is the winner of the game.");

        while (true) {

            System.out.println("Choose your power:");

            Scanner scanner = new Scanner(System.in);
            String playerPower = scanner.nextLine();

            Random random = new Random();
            int index = random.nextInt(powers.size());
            String computerPower = powers.get(index);
            System.out.println("Opponent power: " + computerPower);

            if (playerPower.equals(computerPower)) {
                System.out.println("Draw! Next Round!");
                continue;
            }
            if (playerPower.contains("paper") && computerPower.contains("rock")) {
                System.out.println("You win!");
                playerWinCounter++;
            } else {
                if (playerPower.contains("paper") && computerPower.contains("scissors")) {
                    System.out.println("You lose!");
                    computerWinCounter++;
                }
            }
            if (playerPower.contains("rock") && computerPower.contains("scissors")) {
                System.out.println("You win!");
                playerWinCounter++;
            } else {
                if (playerPower.contains("rock") && computerPower.contains("paper")) {
                    System.out.println("You lose!");
                    computerWinCounter++;
                }
            }
            if (playerPower.contains("scissors") && computerPower.contains("paper")) {
                System.out.println("You win!");
                playerWinCounter++;
            } else {
                if (playerPower.contains("scissors") && computerPower.contains("rock")) {
                    System.out.println("You lose!");
                    computerWinCounter++;
                }
            }
            System.out.println("Player wins: " + playerWinCounter);
            System.out.println("Computer wins: " + computerWinCounter);

            if(playerWinCounter == 3){
                System.out.println("You won the game! Congratulations!");
                break;
            } else {
                if(computerWinCounter == 3){
                    System.out.println("You lose the game! Opponent was better!");
                    break;
                }
            }
        }
    }
}