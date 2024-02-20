package viva1;
import java.util.Scanner;
public class V1Q2 {
    public static void main(String[] args) {
        //2. Write a program to reverse the digits of a positive or negative integer.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        int digit = 0;
        int reverse = 0;
        int minus = 1;
        
        //check num is neg or pos
        if (integer<0){
            minus = -1;
            //returns to the positive value 
            integer = Math.abs(integer);
        }
        while (integer != 0){
            //get the last digit
            digit = integer % 10; 
           //updates the reverse variable to include the current digit at the end
            reverse = reverse * 10 + digit; 
            //removes the last digit from the original integer
            integer /= 10;
        }
        reverse *= minus;
        System.out.println("Reversed integer: " + reverse);
                
    }
}

/*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a a negative integer: ");
        int integer = input.nextInt();
        int digit = 0;
        int reverse = 0;
        
        for (; integer != 0 ; integer /= 10){
            digit = integer % 10;
            reverse = reverse * 10 + digit; 
            
        }
        
        System.out.println("Reversed integer: " + reverse);
*/
        