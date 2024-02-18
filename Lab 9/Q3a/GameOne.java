package Q3;

import Q3.Dice;


public class GameOne extends Dice{
    private int dice1;
    private int dice2;

    public GameOne(String n) {
        super(n);
    }
    
    public void rollDice(){
        do {
            dice1 = (int)(Math.random()*6+1);
            dice2 = (int)(Math.random()*6+1);
            this.display();
            addScore(dice1+dice2);
            super.display();
            if (getScore() >= 100){
                displayWin();
                break;
            }
        } while(dice1 == dice2);
    }
            
    public void display(){
        System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2 + " Total: " + (dice1+dice2));
    }

}
    
