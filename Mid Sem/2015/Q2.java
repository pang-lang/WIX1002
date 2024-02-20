
package midsem;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type;
        double weight;
        double total = 0;
        do {
            System.out.print("Enter the type of durian: [Quit] to terminate: ");
            type = sc.nextLine();
            
            if (type.equals("Quit")){
                break;   
            } else {
                System.out.print("Enter the sales in kg: ");
                weight = sc.nextDouble();
                
                //consume newline
                sc.nextLine();
                if (type.equals("MK")){
                   weight *= 25;
                    total += weight;
                } else if (type.equals("HL")){
                    weight *= 22;
                    total += weight;
                } else if (type.equals("D24")){
                    weight *= 20;
                    total += weight;
                } else if (type.equals("UM")){
                    weight *= 18;
                    total += weight;
                }
            }
          
        } while (!type.equals("Quit"));

        System.out.println("Total sales: " + total);
    }
    
}
