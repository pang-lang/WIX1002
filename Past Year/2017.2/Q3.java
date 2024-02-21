
package pyq181;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size = sc.nextInt();
        System.out.print("Enter font type: ");
        char type = sc.next().charAt(0);
        System.out.print("Enter format [1 - Vertical 2 - Horizontal]: ");
        int format = sc.nextInt();
        display(size,type,format);
    }
    
    public static void display(int s, char t, int f){
        if (s==0 || f == 0)
            return;
        
        if (f == 1){
            for (int row = 0; row < (s*2)+3; row++){
                for (int column = 0; column < s+2; column++){
                    if (row == 0 || row == s+1 || row == 2+s*2){
                        System.out.print(t);
                    } else {
                        if (column == 0 || column == 1+s) {
                            System.out.print(t);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }  
        } 
        
        else {
            for (int row = 0; row<s+2; row++){
                for (int column = 0; column < (s*2)+3; column++){
                    if (row == 0 || row == 1+s) {
                            System.out.print(t);
                    } else {
                        if (column == 0 || column == s+1 || column == 2+s*2){
                            System.out.print(t);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            } 
        }
    }
}
        
    
        
    