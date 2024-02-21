
package pyq172;
import java.util.Scanner;
//2016 sem1 Q3
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("The random integer : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10001);
        }
        
        display(arr);
        System.out.println("");
        System.out.print("Minimum number : ");
        getMin(arr);
        
        System.out.print("The approximation of the integer to the nearest hundred : ");
        getApprox(arr);
        
        System.out.print("The random integer in reverse order : ");
        getReverse(arr);
    }
    
        public static void display(int[] a){
            for (int i=0; i<a.length; i++){
                System.out.print(a[i] + " ");      
            } 
        }
        
        public static void getMin(int[] a){
            int min = a[0];
            for (int i=0; i<a.length; i++){
                if (min<a[i])
                    min = a[i];  
            }
            System.out.print(min);
            System.out.println("");
        }
        
        public static void getApprox(int[] a){ 
            for (int i=0; i<a.length; i++){
                int n = a[i];
                int num, digit;
                digit = n%100;
                if (digit <50)
                    num = n-digit;
                else
                    num = n+(100-digit);
                System.out.print(num + " ");  
            }
            System.out.println("");
        }
        
        public static void getReverse(int[] a){
            for (int i=0; i<a.length; i++){
                int n = a[i];
                int digit, rev = 0;
                while (n!= 0){
                    digit = n % 10; //3
                    rev = rev*10 + digit;
                    n /= 10;
                } 
                System.out.print(rev + " ");  
            }
        System.out.println("");
        }
}
