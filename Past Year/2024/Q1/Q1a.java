
package Q1;

import java.util.Scanner;

public class Q1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        while (true){
            System.out.print("Enter a number: ");
            String n = sc.nextLine();
            if (n.equals("X")){
                break;
            } else {
                if (Integer.parseInt(n) > 0 )
                    pos++;
                if (Integer.parseInt(n) == 0 )
                    zero++;
                if (Integer.parseInt(n) < 0 )
                    neg++;
            }
        }
        System.out.println("Positive number: " + pos);
        System.out.println("Negative number: " + neg);
        System.out.println("Zero number: " + zero);
            
            
        }
    
}
