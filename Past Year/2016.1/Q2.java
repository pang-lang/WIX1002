
package pyq161;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int comcnt = 0;
        int playercnt = 0;
        
        while(comcnt != 3 && playercnt != 3){
        //player
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
        int player = sc.nextInt();
        //computer
        int computer = (int)(Math.random()*3+1);
        
        if (player == 1){
                System.out.print("Player : Paper ----- ");
                if (computer == 1){
                    System.out.print("Computer : Paper\n");
                    System.out.println("Draw");
                } else if (computer == 2){
                    System.out.print("Computer : Scissor\n");
                    comcnt++;
                    System.out.println("Computer win " + comcnt + " times(s)");
                    
                } else if (computer == 3){
                    System.out.print("Computer : Rock\n");
                    playercnt++;
                    System.out.println("Player win "+ playercnt + " times(s)");
                    
                }
        }
        if (player == 2){
                System.out.print("Player : Scissor ----- ");
                if (computer == 1){
                    System.out.print("Computer : Paper\n");
                    playercnt++;
                    System.out.println("Player win " + playercnt + " times(s)");
                    
                } else if (computer == 2){
                    System.out.print("Computer : Scissor\n");
                    System.out.println("Draw");
                } else if (computer == 3){
                    System.out.print("Computer : Rock\n");
                    comcnt++;
                    System.out.println("Computer win " + comcnt + " times(s)");
                    
                }
        }
         if (player == 3){
                System.out.print("Player : Rock ------ ");
                if (computer == 1){
                    System.out.print("Computer : Paper\n");
                    comcnt++;
                    System.out.println("Computer win " + comcnt + " times(s)");
                    
                } else if (computer == 2){
                    System.out.print("Computer : Scissor\n");
                    playercnt++;
                    System.out.println("Player win " + playercnt + " times(s)");
                    
                } else if (computer == 3){
                    System.out.print("Computer : Rock\n");
                    System.out.println("Draw");
                }
        }
        }
        
        if (playercnt>comcnt){
            System.out.println("Player wins the game.");
        } else
            System.out.println("Computer wins the game.");
     
    }
}
    

