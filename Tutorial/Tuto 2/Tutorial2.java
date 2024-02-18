
import java.util.Scanner;
import java.lang.Math;
public class Tutorial2 {
    public static void main(String[] args) {
        
        //1. Display the sentence Faculty of Computer Science and Information Technology.
        //a. In one line using multiple Java statements
        System.out.println("Faculty of Computer Science and Information Technology");
        //b. In multiple lines using one Java statement
        System.out.println(("Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology"));
        
        
        //2. Write a Java statement that print "SDN" - Software-defined networking
        System.out.println("'SDN' - Software-defined networking");
        
        
        //3. Correct the error for the following statements.
        System.out.println("Java Programming");
        System.out.println("Introduction to Java!");
        System.out.println("\\t is the horizontal tab character");
        System.out.println("Java is case sensitive!" );
        
        
        //4. Write statements for each of the following 
        //a. Declare a variable that used to store the value of a matric number.
        String matricNumber = "23005227";
        System.out.println("Matric number : " + matricNumber);
        
        //b. Declare a variable that used to store the value of π.
        double pi = Math.PI;
        System.out.println("The value of π is " + pi);
        
        //c. Initialize a variable named M with the value set to false.
        boolean M = false;
        if (M){;
            System.out.println("M is true");
        }
        else{;
            System.out.println("M is false");
        }
        
        //d. Initialize a variable named P with the value set to 8800000000.
        long P = 8800000000L;
        System.out.println("Value of P is " + P);
        
        //e. Initialize a variable named letter with the value set to U.
        char letter = 'U';
        System.out.println("The letter represents " + letter);
        
        //f. Declare a constant variable named PRO. The value of the constant variable is Java.
        final String PRO = "Java";
        System.out.println("PRO is " + PRO);
        
        
        //5. Correct the error for the following statements. a.
        double amount = 32.5;
        amount += 10;
        System.out.println("The amount is " + amount);
        
        //b.
        String chapter = "Summary"; 
        System.out.println(chapter);
        
         //c.
        int num = 0;
        num ++; 
        int num1 = num;
        
       //d.
        int num2 = 3000; 
        System.out.printf("%4d", num2);
     
        //e.
        String contact;
        System.out.println("Enter the contact : ");
        Scanner keyboard = new Scanner(System.in); 
        contact = keyboard.nextLine();
        System.out.println("The contact is " + contact);
        
        
        //6. Write a java program that print the circumference of a circle. The input of the program is diameter. Display the result in three decimal places. (Note  = Math.PI)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter diameter: ");
        double diameter = input.nextDouble();
        double circumference = Math.PI * diameter;
        System.out.printf("The circumference of the circle is " + "%4.3f",circumference);
        
        
        //7. Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 centimeters). Print the output in two decimal 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in inch:");
        double inches = scanner.nextDouble();
        double valueInCm = inches * 2.54;
        double valueInM = valueInCm / 100; 
        System.out.printf(inches + " inches =  %5.2f,valueInM" + "meters");

    }
    
}
