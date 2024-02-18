import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of water in gram: ");
        int water = scanner.nextInt();
        double M = water / 1000;
        
        System.out.println("Enter the initial temperature in Farenheit: ");
        double iniFar = scanner.nextDouble();
        double iniCel = (iniFar - 32) / 1.8;
        
        System.out.println("Enter the final temperature in Farenheit: ");
        double finFar = scanner.nextDouble();
        double finCel = (finFar - 32) / 1.8;
        
        double Q = M * (finCel - iniCel) * 4184;
        System.out.println("The energy needed is " + Q);
   
    }
}

/*
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the amount of water in gram: ");
        int water = scanner.nextInt();
 
        System.out.println("Enter the initial temperature in Fahrenheit");
        float iniTem= scanner.nextFloat();
 
        System.out.println("Enter the final temperature in Fahrenheit");
        float finalTem= scanner.nextFloat();
 
        int M = water/ 1000;
        double iniTemp = (iniTem-32) / 1.8;
        double finalTemp= (finalTem-32)/1.8;
 
        double Q = M * (finalTemp-iniTemp) * 4184;
 
        System.out.println("The energy needed is"+ Q );
*/
 