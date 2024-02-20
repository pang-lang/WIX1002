
package midsem;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        //consume new line
        sc.nextLine();
        System.out.print("Enter the move: ");
        String move = sc.nextLine();
        System.out.print("Initial coordinate: (" + x + ", " + y + ")\n");
        for (int i=0; i<move.length(); i++){
            char ch = move.charAt(i);
            if (ch == 'L'){
                x--;
            } else if (ch == 'R'){
                x++;
            } else if (ch == 'U'){
                y++;
            } else if (ch == 'D'){
                y--;
            }
        }
        System.out.println("Final coordinate: (" + x + ", " + y + ")");   
    }
    
}
