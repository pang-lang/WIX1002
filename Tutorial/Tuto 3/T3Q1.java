import java.util.Scanner;
import java.lang.Math; 
public class T3Q1 {
    public static void main(String[] args) {
        //Write statement for each of the following
        //a. Determine whether 3x8=27.
        int result = 3*8;
        if (result == 27)
            System.out.println("3x8 is equals to 27");
        else
            System.out.println("3x8 is not equals to 27");
    //-bracket, equal sign, multiplication
    
        //b. Determine whether an input integer is an odd number or even number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        if (num%2 == 0 )
            System.out.println("the input integer is an even number");
        else
            System.out.println("the input integer is an odd number");
                
        //c. Determine whether a character is a capital letter.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char input = in.next().charAt(0);
        boolean caps = input >= 'A' && input <= 'Z';
        if (caps)
            System.out.println(input + " is a capital letter");
        else
            System.out.println(input + " is not a capital letter");
        
        //d. Display two strings in alphabetical order ignoring their case.
        Scanner string1 = new Scanner(System.in);
        Scanner string2 = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = string1.next();
        System.out.println("Enter string 2: ");
        String str2 = string2.next();
        if (str1.compareToIgnoreCase(str2) > 0) 
            System.out.println(str1 + " comes before " + str2);
        else if (str1.compareToIgnoreCase(str2) > 0) 
            System.out.println(str1 + " comes after " + str2);
        else
            System.out.println("both strings are equal");

        //e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0,1, ..., 6.
        Scanner day = new Scanner(System.in);
        System.out.println("Enter a number ranged 0-6");
        int userInput = day.nextInt();
        switch (userInput){
            case 0 : System.out.println("Sunday");break;
            case 1 : System.out.println("Monday");break;
            case 2 : System.out.println("Tuesday");break;
            case 3 : System.out.println("Wednesday");break;
            case 4 : System.out.println("Thursday");break;
            case 5 : System.out.println("Friday");break;
            case 6 : System.out.println("Saturday");break;
            default : System.out.println("the number you type is not recogniszed");
            
  
        }
    }
    
}
