
package midsem;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of staff: ");
        int n = sc.nextInt();
        int count = 0;
        int work = 0;
        while (count<n){
            int id = (int)(Math.random()*90001 + 10000);
            System.out.println("Staff ID: " + id);
            
            int sec = id/1000 % 10;
            int fourth = id/10 % 10;
            if (sec%2 == 1 && fourth % 2 == 0){
                System.out.println("Weekend Duty");
                work++;
            } else {
                System.out.println("Weekend Off");
            }
            count++;
        }
        System.out.println("The number of staffs work during weekend is " + work);
        
    }
    
}
