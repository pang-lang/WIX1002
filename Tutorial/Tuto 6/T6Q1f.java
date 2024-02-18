package tutorial6;
import java.util.Random;
public class T6Q1f {
    public static void main(String[] args) {
        //f. Define a static void method that generates 10 random numbers within 0 to 100 
        //to the method’s parameter. The random numbers can be accessed by the main
        //method.
        int[] randomNumbers = new int [10];
        System.out.println("The random numbers generated are: ");
        generateRandNum(randomNumbers);
        
    }
        public static void generateRandNum (int[] numbers){
            Random r = new Random();
            for (int i=0; i<numbers.length; i++){
                int randNum = r.nextInt(101);
                numbers[i]=randNum;
                System.out.print(numbers[i] + " ");
            }
        } 
}


