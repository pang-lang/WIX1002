
import java.util.*;
public class T4Q1 {
    public static void main(String[] args) {
        //1. Write statements for each of the following
        //a. Find the largest integer n so that n3 is less than 2000.
        int n = 1;
        while (Math.pow(n,3) < 2000){
            n++;
        }
        n--;
        System.out.print(n);
        
        //b. Display the square number of the first twelve integers starting from 1.
        for (int count=1; count<=12; count++){
            int square = count*count;
            System.out.println(square);}
        
        //c. Display a 4-by-5 matrix using random number within 0 to 100.
        Random r = new Random();
        final int ROW = 4;
        final int COL = 5;
        
        for (int i=0; i<ROW; i++){ //row
            for (int j=0; j<COL; j++) //column
                System.out.print(r.nextInt(101)+ "\t");
            System.out.println();
        }
//---------------------
        int[][] arr = new int[4][5];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*101+1);
                System.out.print(arr[i][j] + " ");
            } System.out.println("");
        }
        
        //d. Compute the sum of numbers from 1 to a given number.
        Scanner input = new Scanner(System.in);
        System.out.println("Given number: ");
        int no = input.nextInt();
        int sum = 0;
        for (int count=0; count<=no; count ++){
            sum += count;
            System.out.println(sum);
        }
        
        //e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
        double total = 0.0;
        for (double i=1; i<=25; i++){
            double div = i /(26-i);
            total += div;
        }
        System.out.printf("The sum of the series is %.2f" ,total);
//----------------------------
        double s = 0;
        double a, b;
        for ( a=1, b=25; a<=25; a++, b--){
            s += a/b;
        } 
        System.out.println(s);

    }
    
}


    

