package pyq192;


import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bags sold: ");
        int numberOfBags = sc.nextInt();
        
        System.out.print("Enter teh weight per bag (kilogram): ");
        double unitWeight = sc.nextDouble();
        
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("\nPrice per kilogram: $5.99");
        System.out.println("Sales tax: 7.25%");
        System.out.println("Total price: $" + totalPriceWithTax);
    }
    
}
