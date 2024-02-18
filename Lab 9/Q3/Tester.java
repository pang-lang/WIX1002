
package Q3a;

import java.util.Random;
import java.util.Scanner;

public class Tester {    
    public static void main(String[] args) {
        // Creating instances of the two games
        TwoDiceGame game1 = new TwoDiceGame();
        SingleDiceGame game2 = new SingleDiceGame();

        // Tester class to test the program
        System.out.println("Game 1 -----");
        game1.play();
        System.out.println("Game 1 Winner: " + game1.getWinner());

        System.out.println("\nGame 2 -----");
        game2.play();
        System.out.println("Game 2 Winner: " + game2.getWinner());
    }
}

class TwoDiceGame {
    private int playerScore;

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (playerScore < 100) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println("You rolled: " + dice1 + " and " + dice2);

            if (dice1 == dice2) {
                System.out.println("Roll again! You got a double.");
                playerScore += dice1 + dice2;
            } else {
                playerScore += dice1 + dice2;
            }

            System.out.println("Your current score: " + playerScore);
        }
    }

    public String getWinner() {
        return (playerScore >= 100) ? "Player wins!" : "Computer wins!";
    }
}

class SingleDiceGame {
    private int playerScore;

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (playerScore < 100) {
            int dice = random.nextInt(6) + 1;
            System.out.println("You rolled: " + dice);

            if (dice == 6) {
                System.out.println("You get another roll!");
                int secondRoll = random.nextInt(6) + 1;

                if (secondRoll == 6) {
                    System.out.println("Oops! You rolled 6 again. No score this turn.");
                    break;
                }

                System.out.println("You rolled: " + secondRoll);
                playerScore += secondRoll;
            } else {
                playerScore += dice;
            }

            System.out.println("Your current score: " + playerScore);
        }
    }

    public String getWinner() {
        return (playerScore >= 100) ? "Player wins!" : "Computer wins!";
    }
}


    