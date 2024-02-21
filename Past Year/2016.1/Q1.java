
package pyq161;
import java.util. Scanner;
//Filename:Q1.java
public class Q1 {
    public static void main(String[] args) {  
    int[] num = {34,15,12,27,74,23};
    int cnt=0;
    for (int i = 0; i < num.length; i++){ //err
         if (isEven(num[i]))//err
            cnt++;
    }
        System.out.println("The number of even number is " + cnt);
        System.out.println("The sum of the array is "+ getTotal(num));//err
    }
    
    public static boolean isEven(int a) { //err
        if (a % 2 == 0) //err
            return true;
        else 
            return false;
    }

    public static int getTotal(int[] a) {//err
        int total=0;
        for (int i = 0; i < a.length; i++)
            total += a[i]; //err
        return total;
    }  
}
