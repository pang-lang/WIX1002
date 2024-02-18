package Q3;


public class Dice {
    private String name;
    private int score;
    
    public Dice(String n){
        name = n;
        score = 0;
    }
    
    public void addScore(int n){
        score += n;
    }
    
    public int getScore(){
        return score;
    }
    
    public void display(){
        System.out.println(name + " score " + score + " points");
    }
    
    public void displayWin(){
        System.out.println(name + " wins the game");
    }
}

/*
        Game1 a = new Game1();
        Game2 b = new Game2();
        b.play();
    }
}

import java.util.Random;
class Dice {
    protected int p1Score;
    protected int p2Score;

    public Dice() {
        this.p1Score = 0;
        this.p2Score = 0;
    }

    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

    public class Game1 extends Dice{
    private int dice1;
    private int dice2;
    
    public Game1(){
        super();
    }

    public void game1Roll(){
        dice1 = rollDice();
        dice2 = rollDice();
    }

    public void player1Play(){
        game1Roll();
        System.out.println("Player 1 rolled dice 1: " + dice1 + " dice 2: " + dice2);
        p1Score += dice1 + dice2;
        System.out.println("Player 1 score now is " + p1Score);

        while(dice1 == dice2){
            System.out.println();
            game1Roll();
            p1Score += dice1 + dice2;
            System.out.println("Player 1 rolled dice 1: " + dice1 + " dice 2: " + dice2);
            System.out.println("Player 1 score now is " + p1Score);
        }
        System.out.println();
    }
 
    public void player2Play(){

        game1Roll();
        System.out.println("Player 2 rolled dice 1: " + dice1 + " dice 2: " + dice2);
        p2Score += dice1 + dice2;
        System.out.println("Player 2 score now is " + p2Score);

        while(dice1 == dice2){
            System.out.println();
            game1Roll();
            p2Score += dice1 + dice2;
            System.out.println("Player 2 rolled dice 1: " + dice1 + " dice 2: " + dice2);
            System.out.println("Player 2 score now is " + p2Score);
        }
        System.out.println();
    }

    public void play(){
        while(p1Score <= 100 && p2Score <=100){
            player1Play();
            player2Play();
        }
        if(p1Score >= 100 && p2Score < 100){
            System.out.println("Player 1 win.");
        }
        else if(p2Score >= 100 && p1Score < 100){
            System.out.println("Player 2 win.");
        } else {
            System.out.println("Its a tie");
        }
    }
}

public class Game2 extends Dice {
    private int dice1;

    public Game2() {
        super();
    }

    public void game1Roll() {
        dice1 = rollDice();
    }

    public void player1Play() {
        game1Roll();
        System.out.println("Player 1 rolled dice 1: " + dice1);
        p1Score += dice1;
        System.out.println("Player 1 score now is " + p1Score);

        if (p1Score > 100) {
            p1Score -= dice1;
            System.out.println("Exceed 100 so the score wont be count. ");
            System.out.println("Current score is " + p1Score);
        } else if (dice1 == 6) {
            System.out.println("Player 1 can roll one more time. ");
            game1Roll();

            if (dice1 == 6) {
                p1Score -= dice1;
                System.out.println("You rolled 6 two times, so no score for you.");
                System.out.println("Player 1 current score is " + p1Score);
            } else if (p1Score + dice1 < 100) {
                p1Score += dice1;
                System.out.println("Player 1 rolled dice 1: " + dice1);
                System.out.println("Player 1 score now is " + p1Score);
            } else if (p1Score + dice1 > 100){
                System.out.println("Player 1 rolled dice 1: " + dice1);
                System.out.println("Exceed 100 so the score wont be count. ");
                System.out.println("Current score is " + p1Score);
            }
        }
        System.out.println();
    }

    public void player2Play() {
        game1Roll();
        System.out.println("Player 2 rolled dice 1: " + dice1);
        p2Score += dice1;
        System.out.println("Player 2 score now is " + p2Score);
        if (p2Score > 100) {
            p2Score -= dice1;
            System.out.println("Exceed 100 so the score wont be count. ");
            System.out.println("Current score is " + p2Score);
        } else if (dice1 == 6) {
            System.out.println("Player 2 can roll one more time. ");
            game1Roll();
            if (dice1 == 6) {
                p2Score -= dice1;
                System.out.println("You rolled 6 two times, so no score for you.");
                System.out.println("Player 2 current score is " + p2Score);
            } else if (p2Score + dice1 < 100) {
                p2Score += dice1;
                System.out.println("Player 2 rolled dice 1: " + dice1);
                System.out.println("Player 2 score now is " + p2Score);
            } else if(p2Score + dice1 > 100){
                 System.out.println("Player 2 rolled dice 1: " + dice1);
                 System.out.println("Exceed 100 so the score wont be count. ");
                 System.out.println("Current score is " + p2Score);
            }
        }
        System.out.println();
    }

    public void play() {
        while (p1Score != 100 && p2Score != 100) {
            player1Play();
            player2Play();
        }
        if (p1Score == 100 && p2Score < 100) {
            System.out.println("Player 1 wins.");
        }
        else if (p2Score == 100 && p1Score < 100) {
            System.out.println("Player 2 wins.");
        } else{
            System.out.println("Its a tie");
        }
    }
}
*/
   


//    class Game1 extends Dice{
//            int score1 = 0;
//            int score2 = 0;
//            int sum = 0;
//            
//    public Game1(){
//        do {
//            //player 1
//            int dice1 = (int)(Math.random()*6+1);
//            int dice2 = (int)(Math.random()*6+1);
//            score1 += dice1 + dice2;
//            if (dice1 == dice2){
//                continue;
//            }
//            //player 2
//            dice1 = (int)(Math.random()*6+1);
//            dice2 = (int)(Math.random()*6+1);
//            score2 += dice1 + dice2;
//            //player 2 gets another turn
//            if (dice1 == dice2){
//                continue;
//            } 
//        } while (score1 <= 100 && score2 <= 100);
//        
//        if (score1 > score2){
//            System.out.println("Player 1 wins the game.");
//        } else
//            System.out.println("Player 2 wins the game.");
//        }
//    }
//    
//    class Dice2 extends Dice{
//    }
//    
//    class Dice2(){
//    }
//    
//    public Dice2(){
//        do{
//            //player 1
//            int dice1 = (int)(Math.random()*6+1);
//            score1 += dice1;
//            if (dice1 == 6){
//                continue;
//            }
//            //player 2
//            dice1 = (int)(Math.random()*6+1);
//            score2 += dice1;
//            //player 2 gets another turn
//            if (dice1 == 6){
//                continue;
//            } 
//        } while (score1 <= 100 && score2 <= 100);
//        
//
//        
//        if (score1 > score2){
//            System.out.println("Player 1 wins the game.");
//        } else
//            System.out.println("Player 2 wins the game.");
//        }
//    }
//        
//    }


        
    
        
    
  

        
        
        
         
