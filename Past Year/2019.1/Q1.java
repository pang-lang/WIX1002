
package pyq191;
import java.util. Random;
public class Q1 {

    public static void main(String[] args) {

        System.out.println("This program shows the number of odd and even number from 10 random numbers. "
                + "The random numbers must be from 0 - 100");
        int num, odd=0, even=0;
        Random r = new Random();//err
        for (int i=1; i<=10; i++) { //err
            num = r.nextInt(101);//err
            System.out.println(num + " ");
            if (isEven(num)) {
                even++;
            }      
            else {
                odd++;
            }
        }
        System.out.println("\nNumber of odd number: " + odd);
        System.out.println("Number of even number: " + even);//err
    }
    
    public static boolean isEven(double a){//err
        if (a%2 == 0)//err
            return true;
        else
            return false;
    }    
}
    
