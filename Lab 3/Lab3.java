
import java.util.Scanner;
import java.lang.Math;

public class Lab3 {
    public static void main(String[] args) {
        //Write a program that stimulates a simple calculator. It reads two integers and a character. If the character is a +, the sum is printed; if it is a -, the difference is printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number : ");
        int intNum1 = input.nextInt();
        System.out.println("Enter integer number : ");
        int intNum2 = input.nextInt();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operand : ");
        char character = scanner.next().charAt(0);
        
        int sum = intNum1 + intNum2;
        int diff = intNum1 - intNum2;
        int multi = intNum1 * intNum2;
        int quotient = intNum1 / intNum2;
        int remain = intNum1 % intNum2;
        
        switch (character){
            case '+' : System.out.println(intNum1 + "-" + intNum2 + "=" + sum);break;
            case '-' : System.out.println(intNum1 + "-" + intNum2 + "=" + diff);break;
            case '*' : System.out.println(intNum1 + "*" + intNum2 + "=" + multi);break;
            case '/' : System.out.println(intNum1 + "/" + intNum2 + "=" + quotient);break;
            case '%' : System.out.println(intNum1 + "%" + intNum2 + "=" + remain); break;
            default: System.out.println("character not recognized");
        }
    }
    
}
