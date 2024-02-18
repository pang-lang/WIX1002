package Q3;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Game 1 -----");
        GameOne a1 = new GameOne("Player1");
        GameOne b1 = new GameOne("Player2");
        boolean status;
        int g = (int)(Math.random()*6+1);
        if (g%2 == 0){
            status = true;
        } else {
            status = false;
        }
        while (a1.getScore()<100 && b1.getScore()<100){
            if (status){
                a1.rollDice();
                if (a1.getScore() >= 100)
                    break;
                    b1.rollDice();
                } else {
                    b1.rollDice();
                    if (b1.getScore() >= 100)
                        break;
                    a1.rollDice();
                }           
            }
            
            System.out.println("\nGame 2 -----");
            GameTwo a2 = new GameTwo("Player1");
            GameTwo b2 = new GameTwo("Player2");
            Random r = new Random();
            if (r.nextInt()%2==0)
                status = true;
            else
                status = false;
            while(a2.getScore()<100 && b2.getScore() <100) {
                if (status) {
                    a2.rollDice();
                    if (a2.getScore()==100)
                        break;
                    b2.rollDice();
                }
                else {
                    b2.rollDice();
                    if (b2.getScore()==100)
                        break;
                    a2.rollDice();
            }
        }
    }  
}
            