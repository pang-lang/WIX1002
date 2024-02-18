package lab5;
import java.util.*;
public class L5Q6 {
    public static void main(String[] args) {
    //Write a program that used to create Pascal Triangle in the square matrix. The program
    //will accept an integer from the users and use the integer to create the Pascal Triangle.
    Scanner sc = new Scanner(System.in);    
    System.out.println("Enter the number of rows of Pascal Triangle to generate: ");
        int n = sc.nextInt();
        System.out.println("The pascal triangle with " + n + " rows ");
        int[][] matrix = new int[n][n];
        int number = 1;

        for (int i = 0; i <= n; i++) {
            //printing spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            //binomial coefficient
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
            } System.out.println();
    }
}
        public static int factorial(int i) {
            if (i == 0) {
                return 1;
            }
            return i * factorial(i - 1);
}
}

/*
        //printing the number of rows
        for(int i=0; i<n; i++){     
            //iterates through each element in the current row up to the diagonal element
            for (int j=0; j<=i; j++){
                //checks if the current element is on the edge of the triangle 
                if ( j==0 || j==i )
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }
                for (int i=0; i<n; i++){
                    for (int j=0; j<n; j++){
                        System.out.print(matrix[i][j] + " ");            
            }
                    System.out.println(""); 
        }
    }
*/