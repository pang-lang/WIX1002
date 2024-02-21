
package pyq171;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment(e.g enter 5.2 for 5.2%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the year for which you compute the tuition fee for: ");
        int year = sc.nextInt();
        System.out.printf("Computed tuition fee for year " + year + " is: %.2f", computeFee(fee,rate,year));
    }
    
    public static double computeFee(double f, double r, int y){
        double rate = (r/100)+1;
        return f * (Math.pow(rate, y-1));
    }    
}
