import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        //Cramer’s rule is used to solve the linear equations.
        //ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
        //Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x and y. 
        //If ad – bc is equal to 0. Display "The equation has no solution"
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value for b: ");
        double b = input.nextDouble();
        System.out.println("Enter the value for c: ");
        double c = input.nextDouble();
        System.out.println("Enter the value for d: ");
        double d = input.nextDouble();
        System.out.println("Enter the value for e: ");
        double e = input.nextDouble();
        System.out.println("Enter the value for f: ");
        double f = input.nextDouble();
        
        double x = (e*d - b*f)/(a*d - b*c);
        double y= (a*f - e*c)/(a*d - b*c);

        if (a*d - b*c == 0)
            System.out.println("The equation has no solution.");
        else
            System.out.println("The result for x: " + x);
            System.out.println("the result for y: " + y);
        
    }
    
}
