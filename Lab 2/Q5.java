import java.lang.Math; 
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10001);
        System.out.println("The random number generated is " + num1);
        
        int sum = 0;
        int num = num1;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of digits generated is " + sum);
     
        //674 % 10 = 4
        //Sum = 0 + 4 = 4
        //674 / 10 = 67
 
    }
 
}