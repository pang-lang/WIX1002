import java.lang.Math;
public class Q3 {
    public static void main(String[] args) {
        
        int num1 = (int)(Math.random()*41) + 10;
        int num2 = (int)(Math.random()*41) + 10;
        int num3 = (int)(Math.random()*41) + 10; 
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("The random numbers generated are : " + num1 + ", " + num2 + ", " + num3);
        
        int sum = num1 + num2 + num3;
        System.out.println("The sum of three numbers generated is " + sum);
        
        double average = sum / 3;
        System.out.printf("The average of three numbers generated is %.2f", average);
    }
}
        
/*

        Random random = new Random();
 
        int num1 = random.nextInt(41) + 10;
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;
 
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
 
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Third Number: " + num3);
        System.out.println("Sum of the Numbers: " + sum);
        System.out.printf("Average of the Numbers: %.2f\n", average);

*/