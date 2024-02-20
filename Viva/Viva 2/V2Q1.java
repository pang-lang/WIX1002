package viva2;
import java.util.Scanner;
public class V2Q1 {
    public static void main(String[] args) {
        //Can you assist James to write a Java method that accepts a String as parameter and check whether the user's input is a valid password.
        //Password rules:
        //i) A password contains at least 8 characters
        //ii) A password contains at least 1 capital and small letter
        //iii) A password contains at least 3 digits
        //iv) A password must consists at least 1 special character
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password=scanner.nextLine();
        System.out.println(valPassword(password));
    }  
    
    public static boolean valPassword ( String password){ 
        if ( password.length()>7){
            if ( checkPass(password)){
                return true;
            } else {
                return false;
            }
        } else {     
            return false; 
        }
    }
    
    public static boolean checkPass (String password) {
        final int NUM_UPPER_LETTERS=1;
        final int NUM_LOWER_LETTERS=1;
        final int NUM_SPECIAL_CHAR=1;
        final int NUM_DIGITS=3;
        int upperCase=0;
        int lowerCase=0;
        int specialChar=0;
        int digit=0;
        boolean hasNum= false; boolean hasCap= false; boolean hasLow = false; boolean hasSpecial= false;
        char c;
        
        for (int i =0 ; i< password.length();i++){
            c= password.charAt(i);
            if ( Character.isDigit(c)){
                hasNum= true;
                digit ++;
            } else if ( Character.isUpperCase(c)){
                hasCap= true;
                upperCase++; 
            } else if ( Character.isLowerCase(c)){
                hasLow= true; 
                lowerCase ++ ; 
            } else if ( "!@#$%^&*()-+".indexOf(c)>=0){ 
                hasSpecial= true;
                specialChar ++;
            }  
            if (upperCase>=NUM_UPPER_LETTERS && lowerCase>=NUM_LOWER_LETTERS && digit>=NUM_DIGITS &&  
                specialChar==NUM_SPECIAL_CHAR && password.length()>=8){ 
                return true;
            }
        }
            return false; 
    }
}


/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pw = sc.nextLine();
        System.out.println(isValidPassword(pw));
    }
    
    public static boolean isValidPassword(String a){
        int isUpperCase = 0, isLowerCase = 0, isDigit = 0, isSpecialChar = 0;
        for (int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if (ch >='A' && ch <='Z')
                isUpperCase++;
            else if (ch >= 'a' && ch <= 'z')
                isLowerCase++;
            else if (ch >= '0' && ch <= '9')
                isDigit++;
            else if ("!@#$%^&*()-+".indexOf(ch)>=0)
                isSpecialChar++;
        }
        if (a.length()>=8 && isUpperCase>=1 && isLowerCase>=1 && isDigit >=3 && isSpecialChar==1){
            return true;
        } else {
            return false;
        }
    } 
}
*/


    

