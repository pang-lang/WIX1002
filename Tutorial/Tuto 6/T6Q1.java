package tutorial6;
import java.util.Scanner;
public class T6Q1 {
    public static void main(String[] args) {
        //1. Write statements for each of the following
        //a. Define a static method that returns the maximum number from 3 integer parameters.
        int x = 20, y = 10, z = 400;
        int max = maxNum(x,y,z);
        System.out.println(max);
    }
    public static int maxNum(int x, int y, int z){
            int max = 0;
            
            if (x>=y && y>=z){
                max = x; //return x
            } else if (y>=z && y>=x){
                max = y; //return y
            } else {
                max = z; //return z
            } 
            return max;
        }
    } 


       



       






            
   