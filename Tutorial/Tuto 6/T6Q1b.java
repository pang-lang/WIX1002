package tutorial6;
import java.util.Scanner;
public class T6Q1b {
    public static void main(String[] args) {
        //b. Define a static method that that determine whether the given integer is a square number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (squareNum(num))
            System.out.println("The integer is a square number");
        else 
            System.out.println("The integer is not a square number");
    }
    //it must be double
        public static boolean squareNum (double num){
            for (int i=0; i*i<=num; i++){
                //condition for square num
                if((num%i==0) && (num/i==i)){
                    return true;
                }     
            }
            return false;  
        }
    }
    

