
import java.util.ArrayList;

public class L4Q8 {
    public static void main(String[] args) {
        //Write a program that generates the first n prime number. n is an random integer within 0 to 100.
        int n = (int)(Math.random()*100);
        System.out.println("Random n number generated: " + n);

        int count = 0;
        int number = 2;

        while (count < n) {
            if (Prime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean Prime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) { //loop till half of the num
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
    System.out.println(isPrime(0,100));
    }
    public static ArrayList<Integer> isPrime(int start, int finish){
        
        ArrayList<Integer> numbers  = new ArrayList<Integer>();
        
        for (int n=start; n<=finish; n++){
            boolean isPrime = true;
            int i=2;
            while (i <= n/2){
                if (n%i == 0){
                    isPrime = false;
                    break;
                } 
                i++;   
            }
            if (isPrime)
                numbers.add(n);
            } return numbers;
        }
    }
*/
       