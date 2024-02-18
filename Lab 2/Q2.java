import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the prince of the car : ");
        double P = scanner.nextDouble();
        
        System.out.println("Enter the down payment : ");
        double D = scanner.nextDouble();
        
        System.out.println("Enter the interest rate in % : ");
        double R = scanner.nextDouble();
        
        System.out.println("Enter the loan duration in year : ");
        double Y = scanner.nextDouble();
        
        double M = (P - D) * (1 + (R * Y / 100)) / (Y * 12);
        
        System.out.printf("The monthly payment is %.2f", M);
        
    }        
}

      
    
    
 
      
      
 
