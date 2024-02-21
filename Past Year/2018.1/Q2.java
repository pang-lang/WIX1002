
package pyq181;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = sc.nextInt();
        int countAAA=0, countAA=0, countA=0;
        System.out.print("The random numbers are: ");
        for (int i=0; i<n; i++){
            int num = (int)(Math.random()*101+50);
            System.out.print(num + " ");
            if (num%10 == 0 || num%10 == 1 || num%10 == 2 || num%10 == 3)
                countAAA++;
            else if (num%10 == 4 || num%10 == 5 || num%10 == 6)
                countAA++;
            else
                countA++;
        }
        
        System.out.println("\nGroup AAA : " + countAAA);
        System.out.println("Group AA : " + countAA);
        System.out.println("Group A: " + countA);
    }
    
}
