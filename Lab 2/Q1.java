import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the temperature in degree Fahrenheit: ");
       double farenheit = scanner.nextDouble();
       double celsius = (farenheit - 32) / 1.8;
       System.out.printf("The temperature in degree Celcius is %4.2f",celsius);
       
    }
}
