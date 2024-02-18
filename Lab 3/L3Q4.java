
public class L3Q4 {
    public static void main(String[] args) {
        //4. Write a simple two players dice game. Each player will roll the dice twice and the player with the highest score wins the game.
        int p1d1 = (int)(Math.random()*6) +1;
        int p1d2 = (int)(Math.random()*6) +1;
        int sum1 = p1d1 + p1d2;
        System.out.println("The dice number generated: " + p1d1 + "," + p1d2);
        System.out.println("Sum of player 1 dice : " + sum1);
           
        int p2d1 = (int)(Math.random()*6) +1;
        int p2d2 = (int)(Math.random()*6) +1;
        int sum2 = p2d1 + p2d2;
        System.out.println("The dice number generated: " + p2d1 + "," + p2d2);
        System.out.println("Sum of player 1 dice : " + sum2);
        
        if (sum1 > sum2)
            System.out.println("Player 1 wins!");
        else if (sum1 == sum2)
            System.out.println("Its a tie!");
        else
            System.out.println("Player 2 wins!");
    }
}
/*
        2 variable
        import java.util.Random;
        Random random = new Random();
        int player1Score, player2Score;
        System.out.println("Rolling the dice for Player 1...");
        player1Score = random.nextInt(6) + random.nextInt(6) + 2;
        System.out.println("Rolling the dice for Player 2...");
        player2Score = random.nextInt(6) + random.nextInt(6) + 2;
        System.out.println("\nPlayer 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("\nPlayer 1 wins the game!");
        } else if (player1Score < player2Score) {
            System.out.println("\nPlayer 2 wins the game!");
        } else {
            System.out.println("\nIt's a draw!");
*/
