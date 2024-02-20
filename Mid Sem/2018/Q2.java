
package midsem;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int correct = 0;
        int total = 0;
        while (true){
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter a number (-1 to quit): ");
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
        
            System.out.print("Enter a factor: ");
            int factor = sc.nextInt();
            System.out.print(factor + " is a factor of " + num + " ? (true/false) ");
            boolean ans = sc.nextBoolean();
            boolean isAns = isFactor(num,factor);
            if (ans == isAns ){
                System.out.println("Your answer is correct.");
                correct++;    
            } else {
                System.out.println("Your answer is incorrect.");
            } 
            total++;
        }
        System.out.println("The final score is " + correct + "/" + total);
    }
    
    public static boolean isFactor(int n, int f){
        return n%f == 0;
    }
    
}
