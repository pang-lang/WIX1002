package Q3;


public class GameTwo extends Dice {
    private int dice1;

    public GameTwo(String n) {
        super(n);
    }
    
    public void rollDice(){
        int temp;
        int temp1;
        
        dice1 = (int)(Math.random()*6+1);
        this.display();
        if (dice1 == 6){
            temp = (int)(Math.random()*6+1);
            if (dice1 == 6){
                this.display();
                this.displayNoScore();
                dice1 = 0;
            } else {
                temp1 = temp;
                temp += dice1;
                dice1 = temp1;
                this.display();
                dice1 = temp;
            }
        }
        addScore(dice1);
        if (getScore()==100){
            super.display();
            displayWin();
        } else if (getScore() < 100){
            super.display();
        } else {
            addScore(dice1);
            this.displayNoAdd();
            super.display();
        }
    }
    
    public void display(){
        System.out.println("Dice: " + dice1);
    }
    
    public void displayNoScore(){
        System.out.println("Roll 6 twice. No score.");
    }
    
    public void displayNoAdd(){
        System.out.println("Total score more than 100. No score added.");
    }
    
}
    
    
   