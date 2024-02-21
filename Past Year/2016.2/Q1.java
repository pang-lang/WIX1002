
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = sc.nextDouble();
        double kg = pounds*0.454;
        
        System.out.printf(pounds + " pounds is " + kg + " kilograms");

    }
    
}
