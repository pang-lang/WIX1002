import java.util.Scanner;
public class L4Q2 {
    public static void main(String[] args) {
        //2. Write a program that accepts an integer n from user and then sum the following series.
        //1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer, n: ");
        int integer = scanner.nextInt();
        
        int sum = 0;
        int total = 0;
        
        for (int n=1; n<=integer; n++){
            sum += n;
            total += sum;
        }
        System.out.println(total); 
        
    }
    
}

//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= i; j++) {
//            sum += j;
//        }
//    }
//    System.out.println("The sum of the series is " + sum);
