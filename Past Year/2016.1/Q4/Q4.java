
package pyq161;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try {
        Scanner input = new Scanner(new FileInputStream("Q4.txt"));
        while(input.hasNextLine()){
            String pw = input.nextLine();
            int Uppercasecount = 0;
            int Lowercasecount = 0;
            int Digitcount = 0;
            int Specialcharcount = 0;
            for (int i=0; i<pw.length(); i++){
                char pos = pw.charAt(i);
            if (Character.isUpperCase(pos)){     
                Uppercasecount++;
            } else if (Character.isLowerCase(pos)){
                Lowercasecount++;
            } else if (Character.isDigit(pos)){
                Digitcount++;
            } else if ("!@#$%^&*+-".indexOf(pos)>=0){
                Specialcharcount++;
            }
            }
            if (pw.length()>=8 && Uppercasecount>=1 && Lowercasecount>=1 && Digitcount>=1 && Specialcharcount>=1){
                System.out.println("Strong password.");
            } else
                System.out.println("Not a strong password.");
            } 
        input.close();
    } catch (IOException e){
        System.out.println("Problem with input file.");
    }
    }
    
}
