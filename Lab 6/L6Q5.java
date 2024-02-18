package lab6;
import java.util.Scanner;
public class L6Q5 {
    public static void main(String[] args) {
        //5. Write a Java method that accepts three parameters, the method will compare whether the third parameter value 
        //is equal to the multiplication of parameter 1 and parameter 2. Then, write a Java multiplication game for any 
        //random number within 0 – 12.
        
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int score = 0;
        do{
            System.out.println("Enter negative number to quit. ");
            int randNum1 = (int)(Math.random()*13);
            int randNum2 = (int)(Math.random()*13);
            System.out.print(randNum1 + " x " + randNum2 + " = " );
            input = sc.nextInt();
            score += getScore(randNum1, randNum2, input);
        } while (input >= 0);
        System.out.println("Your score is " + score);
    }
    
    public static int getScore(int a, int b , int ans){
        int count=0;
        if (a*b == ans){
            return 1;   
        } else
            return 0;
    }
}
