
package pyq182;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double totalPrice, withTax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bags of sold: ");
        int bags = sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram): ");
        double weight = sc.nextInt();
        
        totalPrice = weight*bags*5.99;
        withTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("Price per kilogram: $5.99");
        System.out.println("Sales tax: 7.25%");
        System.out.printf("Total rice after tax: $%.2f", withTax);
    }
    
}
