
package pyq172;
import java.util. Scanner;
public class Q1 {
    public static void main(String[] args) {

    final int N;
    Scanner s = new Scanner(System.in); //err
    System.out.print("Enter a number : "); //err
    N = s.nextInt();//err
    System.out.println("The first " + N + " triangular numbers");
    for (int i=1; i<=N; i++)//err
        System.out.print(getTriangular(i) + " ");
        System.out.println();
    }
    
    public static int getTriangular(int n) {//err
        int sum = 0; //err
        for(int i=1; i<=n; i++)
            sum+=i; //err
        return sum;
        }
    }
