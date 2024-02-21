
package pyq171;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        int real1  = sc.nextInt();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        int imaginary1 = sc.nextInt();
        System.out.print("Second complex number. Enter a number for the real part: ");
        int real2 = sc.nextInt();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        int imaginary2 = sc.nextInt();
        
        System.out.println("");
        Complex n1 = new Complex(real1,imaginary1);
        Complex n2 = new Complex(real2, imaginary2);
        
        System.out.println("First complex number: " + n1.toString());
        System.out.println("Second complex number: " + n2.toString());
        
        n1.addComplexNum(n1, n2);
        n1.subtractComplexNum(n1, n2);
       
    }
    
}
