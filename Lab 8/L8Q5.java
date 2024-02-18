
public class L8Q5 {
    public static void main(String[] args) {
        //5. Define a class Game. The class has a constructor that accept player name. 
        //Besides, the class contains a method move that roll the dice. 
        //Create a Tester class to test the program with two players and the player that reach 100 or more win the game.
        Game game = new Game("Ali", "Siti");
        game.move();
    }
}
    class Game{
        private String player1;
        private String player2;    
        
        Game(){
            player1 = null;
            player2 = null;
        }
        
        Game(String player1, String player2){
            this.player1 = player1;
            this.player2 = player2;
        }
        
        public void move(){
            int sum1 = 0;
            int sum2 = 0;           
            do{
                sum1 += (int)(Math.random()*6+1);
                System.out.println("Player 1: " + sum1);
                sum2 += (int)(Math.random()*6+1);
                System.out.println("Player 2: " + sum2);
            } while (sum1<100 && sum2<100);
            
            if (sum1>sum2){
                System.out.println("Player 1 wins");
            } else
                System.out.println("Player 2 wins");   
        }       
    }
    
/*
import java.util.Random;
 
public class Game {
    private String fullname;
    private int dice, amount;
    private Random g;
 
    public Game(String n) {
        fullname = n;
        amount = 0;
        g = new Random();
    }
 
    public int getAmount() {
        return amount;
    }
 
    public String getFullName() {
        return fullname;
    }
 
    public void move() {
        dice = g.nextInt(6) + 1;
        amount+=dice;
        System.out.println(fullname + " rolls " + dice + " Total: " + amount);
    }
}

 
public class Test {
    public static void main(String[] args) {
        Game a = new Game("John");
        Game b = new Game("Alvin");
 
        while(true) {
            a.move();
            if (a.getAmount()>=100) {
                System.out.println(a.getFullName() + " WIN!");
                break;
            }
            b.move();
            if (b.getAmount()>=100) {
                System.out.println(b.getFullName() + " WIN!");
                break;
            }
        }
    }
*/