package viva1;
import java.util.Scanner;
public class V1Q1 {
    public static void main(String[] args) {
        //pattern question : 
//           1
//          212
//         32123
//        4321234
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();
        
        //print row
        for (int i=1; i<=lines; i++){
            //print space
            for (int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
        //print num
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
        
            for (int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println("");
        }           
    }  
}




       
        

        
           
