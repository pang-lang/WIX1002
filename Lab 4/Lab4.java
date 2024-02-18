
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        // 1. Write a program that accepts an integer from user. Then, display its entire factors in increasing order.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        System.out.print("The factors are: ");    
        for (int i=1; i < integer; i++){
            if (integer % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(integer);
            
        
    }
    
}
