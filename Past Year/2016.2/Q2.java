
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 1000: ");
        int num = scanner.nextInt();
        int digit;
        int sum=0;
        while (num!=0){
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of digits is " + sum);
        
    }
    
}
