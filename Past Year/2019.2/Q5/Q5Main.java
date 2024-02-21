
package pyq192;
import java.util.Scanner;

public class Q5Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter values for a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        QuadraticEquation q1 = new QuadraticEquation(a, b, c);
        
        System.out.println("The equation is " + a + "x(^2) " + "+ (" + b + ")x + " + "(" + c + ")");
        System.out.println("Discriminant: " + q1.Discriminant());
        
        if (q1.Discriminant() > 0){
            System.out.println("The roots: " + q1.calcRoot1() + " and " + q1.calcRoot2());
        } else if ((q1.Discriminant() == 0)){
            System.out.println("Same roots: " + q1.calcRoot1());
        } else
            System.out.println("The equation has no roots");
    }
    }
    
    

