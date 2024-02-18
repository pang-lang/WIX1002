
import java.util.*;
public class tutorial4 {
    public static void main(String[] args) {
        // TODO code application logic here
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
        } System.out.println(s);

        
        //3. Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
        //fibonnaci is sum of the previoius two term
        int n1 = 0, n2 = 1;
        int n3;
        for (int i=1; i<=10; i++){
            System.out.print(n1 + ", " );
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }    
             
        //4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
        Scanner sc = new Scanner(System.in);
        System.out.println("original word: ");
        String word = sc.nextLine(), nstr = ""; 
        char ch;
        
        for (int i=0; i < word.length(); i++){
            ch= word.charAt(i); //extracts each character
            nstr += ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
//------------------
        String in = "I have a cats.";
        String rev = "";

        for (int i=in.length()-1; i>=0; i--){
            char c = in.charAt(i);
            rev += c;
        } System.out.println(rev);
        
        
    }
    
}


    

