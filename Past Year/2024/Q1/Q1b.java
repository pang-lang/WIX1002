
package Q1;

import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        double n = sc.nextDouble();
        System.out.println(sum(n));
        
    }
    public static double sum(double n){
        double sum = 0;
        for (int i=1; i<=n; i++){
            sum += 1.0/i;
        }
        return sum; 
    }
}
