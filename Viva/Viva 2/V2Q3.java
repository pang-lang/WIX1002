package viva2;

import java.io.IOException;
import java.util.Scanner;

public class V2Q3 {
    public static void main(String[] args) { 
        //accepts a string array and return a boolean array as its output to address this issue
        String[] array = new String [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 values: ");
        for (int i=0; i<array.length; i++){
            array[i] = sc.next();
        }
        boolean[] result = isVal(array);
        
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    
        public static boolean[] isVal(String[] arr){
            boolean[] result = new boolean [6];
            for(int i=0; i<arr.length; i++){
                try {
                    double val = Double.parseDouble(arr[i]); 
                    result[i] = true;    
                } catch (NumberFormatException e){
                    result[i] = false;
                }
            } return result;
        } 
}

        
    
    

