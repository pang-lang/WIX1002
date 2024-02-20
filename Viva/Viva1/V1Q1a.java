package viva1;
import java.util.Scanner;
public class V1Q1a {
    public static void main(String[] args) {
        //pattern question
//        4321234
//         32123
//          212
//           1

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        //printing the number of spaces
        //control the number of rows
        for (int i=num; i>=1; i--){
            //print the spaces
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            //printing number in decreasing order from i to 1
            for (int j=i; j>=1; j--){
                System.out.print(j);
            } 
            //printing number in increasing order from 2 to i
            for (int k=2; k<=i; k++){
                System.out.print(k);
            }
            //printing number in multiple lines  
            System.out.println("");      
        } 

    }
}
   
    
