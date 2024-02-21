
package pyq192;

import java.util.Scanner;

public class Q6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter customer id: ");
        String id = sc.nextLine();
        
        System.out.print("Enter quantity ordered: ");
        int quantity = sc.nextInt();
        
        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();
        
        Order o1 = new Order(name, id, quantity, price);
        ShippedOrder o = new ShippedOrder(name, id, quantity, price);
        System.out.println("");
        System.out.println(o1.toString());
        System.out.println("");
        System.out.println(o.toString());
    }
    
}
