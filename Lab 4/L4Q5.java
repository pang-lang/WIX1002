
public class L4Q5 {
    public static void main(String[] args) {
        //Write a simple two players dice game. Each player will take turns to roll a dice. 
        //The first players that reach more than 100 points win the game. 
        //If the player rolls a 6, the player will score 6 points and has the chance to roll again.
        
        int player1Score = 0, player2Score = 0;
       
        while (player1Score <=100 && player2Score <=100){
            int player1 = (int)(Math.random()*6+1);
            if (player1 != 6){
                player1Score += player1;
                System.out.println("Player 1 roll's: " + player1 + " Player 1 score's : " + player1Score);
            } while (player1 == 6){
                System.out.println("Player 1 rolls a 6. Player 1 rolls again.");
                player1 = (int)(Math.random()*6+1);
                System.out.println("Player 1 roll's: " + player1);
                player1Score += player1 + 6; 
                System.out.println("Player 1 score's: " + player1Score);
            if (player1Score > 100)
                System.out.println("Player 1 wins!");
                break;              
            }
        
            int player2 = (int)(Math.random()*6+1);
            if (player2 != 6){
                player2Score += player2;
                System.out.println("Player 2 roll's: " + player2 + " Player 2 score's : " + player2Score);
            } while (player2 == 6){
                System.out.println("Player 2 rolls a 6. Player 2 rolls again.");
                player2 = (int)(Math.random()*6+1);
                System.out.println("Player 2 roll's: " + player2);
                player2Score += player2 + 6; 
                System.out.println("Player 2 score's: " + player2Score);
            if (player2Score > 100)
                System.out.println("Player 2 wins!");
                break;          
            }       
        }   
        
        
    }        
}

/*
        Random g = new Random();
        int high = 6, low = 1;
        int p1=0, p2=0;
        while(p1<100 || p2<100){
            System.out.println("---Player 1---");
            int roll_1 = g.nextInt(high-low+1)+low;
            System.out.println("Result: "+roll_1);
            p1+=roll_1;
            while (roll_1 ==6){
                roll_1 = g.nextInt(high-low+1)+low;
                System.out.println("Result: "+roll_1);
                p1+=roll_1;
            }
            if(p1>=100){
                System.out.println("Player 1 WINS");
                break;
            }
            System.out.println("---Player 2---");
            int roll_2 = g.nextInt(high-low+1)+low;
            System.out.println("Result: "+roll_2);
            p1+=roll_2;
            while (roll_2 ==6){
                roll_2 = g.nextInt(high-low+1)+low;
                System.out.println("Result: "+roll_2);
                p2+=roll_2;
            }
            if(p2>=100){
                System.out.println("Player 2 WINS");
                break;
            }
        }
    }
}
*/

/*
        int player1=0, player2=0, dice;
        Random g = new Random();
        game:{
        for(int i=0; ;i++) {
            if (i%2==0) {
                do {
                    dice = g.nextInt(6)+1;
                    player1+=dice;
                    System.out.println("Player 1 - Roll Dice: " + dice + " Total: " + player1);
                    if (player1 >100) {
                        System.out.println("Player 1 WIN!");
                        break game;
                    }
                }while(dice==6);
            }
            else {
                do {
                    dice = g.nextInt(6)+1;
                    player2+=dice;
                    System.out.println("Player 2 - Roll Dice: " + dice + " Total: " + player2);
                    if (player2 >100) {
                        System.out.println("Player 2 WIN!");
                        break game;
                    }
                } while(dice==6);
            }
        }
      }
    }
}
*/
        
        
        
        
        
    
    

