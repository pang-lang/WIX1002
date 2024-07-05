
package Q2;

import java.util.Scanner;

public class Q2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int age = sc.nextInt();
        
        try {
            checkAge(age);
            System.out.println("Valid age, you are eligible.");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age! " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}