package viva1;
import java.util.Scanner;
public class V1Q3 {
    public static void main(String[] args) {
        //Write a program to determine if the number entered by the user is a Strong Number or not. 
        //A Strong Number is a number whose sum of the factorial of each digit is equal to the
        //number itself. For example, 145 is a Strong Number because 1! + 4! + 5! = 1 + 24 + 120 = 145.
        int digit;
        int sum = 0; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        final int NUM = num;
        
        do {
            //get the first digit from right
            digit = num % 10;
            //factorial starts with 1
            int factorial = 1;
            //factorial formula
            for (int i=1; i<=digit; i++){
                factorial *= i;
            } 
            sum += factorial;  
            num /= 10;
            
        } while(num>0);     
        
        if (sum == NUM)
            System.out.println("The number " + NUM + " is a strong number" );
        else
            System.out.println("The number " + NUM + " is not a strong number");  
        
    }
    
}


/*
    while(num>0){
            digit = num % 10;
            //factorial starts with 1
            int factorial = 1;
            //factorial formula
            for (int i=1; i<=digit; i++){
                factorial *= i;
            } 
            sum += factorial;  
            num /= 10;
            
        }
*/