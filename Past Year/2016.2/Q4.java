
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        int s = sc.nextInt();
        System.out.printf("The area is %.2f squared meters." , getArea(n,s));
    }
    public static double getArea(int n, double s){
        double area;
        //tan 180=Math.PI
        area = (n*s*s)/(4 * (Math.tan(Math.PI/n)));
        return area;
    }
}
