import java.util.Scanner;
public class T3Q5 {
    public static void main(String[] args) {
        //5. Write the java statements that determine whether the Leap year. A Leap year is divisible by 4 but not by 100. However, a Leap year is also divisible by 400.
        Scanner y = new Scanner (System.in);
        System.out.println("Enter the year: ");
        int year = y.nextInt();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println(year + " is a leap year. ");
        else
                System.out.println(year + " is not a leap year. ");    
    }
    
}
 
    //boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);