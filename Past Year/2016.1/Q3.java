
package pyq161;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        display(arr);
        getMax(arr);
        getApp(arr);
        getReverse(arr);
    }

        public static void display(int[] a){
            System.out.print("The random integer: ");
            for(int i=0; i<a.length; i++){
            a[i] = (int)(Math.random()*1001);
            System.out.print(a[i] + " ");
        }
        }
       
        public static void getMax(int[] a){
            System.out.print("\nMaximum number: ");
            int max = a[0];
            for(int i=1; i<a.length; i++){
                if (a[i]>max){
                    max = a[i];
                }
            } System.out.println(max);    
        }
        
        public static void getApp(int[] a){
            System.out.print("The approximation of the integer to the nearest tenth: ");
            for (int i=0; i<a.length; i++){
                int n = a[i];
                int digit = n%10;
                if (digit >= 5){
                    int num = 10-digit;
                    n += num;      
                } else if(digit > 0) {
                    n-= digit;
                } System.out.print(n + " ");
        }
        }
        
        public static void getReverse(int[] a){
            System.out.print("\nThe random integer in reverse order: ");
            for (int i=0; i<a.length; i++){
                int n = a[i];
                int digit;
                int rev = 0;
                while (n!=0){
                    digit = n%10;
                    rev = rev*10 + digit;
                    n /= 10;    
                } System.out.print(rev + " ");
            }
        }
}
        
        
    

