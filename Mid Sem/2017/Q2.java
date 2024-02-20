
package midsem;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        int c = 0;
        System.out.println("Enter integer (-1 to quit): ");
        
        for (int i=0; ; i++){
            int num = sc.nextInt();
            
            if (num == -1){
                break;
                //use count instead of 1
            } else if (num>=1 && num <=9) {
                arr[count] = num;
                System.out.print(arr[count] + " ");
                count++;
            }
        }
            
            arr = Arrays.copyOf(arr, count);
            Arrays.sort(arr);
            int min = arr[0];
            for (int j=1; j<arr.length; j++){
                if (arr[j] == min)
                    c++;
            }
        
        
        System.out.println("\nThe minimum number is: " + min);
        System.out.println("The occurence count of " + min + " is " + (c+1));
        
    }
    
}
    
