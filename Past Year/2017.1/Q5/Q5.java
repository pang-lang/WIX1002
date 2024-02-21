
package pyq171;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int g = sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int s = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int l = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int c = sc.nextInt();
        System.out.println("");
        
        Essay e = new Essay(g,s,l,c);
        System.out.println(e.toString());
        // use super.toString on class instead of main
    }
    
}
