package viva1;

import java.util.Scanner;
public class V1Q4 {
    public static void main(String[] args) {
        //4. A password is said to be strong if it satisfies the following criteria:
        //It contains at least one lowercase English character.
        //It contains at least one uppercase English character.
        //It contains at least one special character. The special characters are: !@#$%^&*()-+
        //Its length is at least 8.
        //It contains at least one digit.
        //Check the strength of the input string. Let a strong password be one that satisfies all the above conditions. 
        //A moderate password is one that satisfies the first three conditions and has a length of at least 6. Otherwise, the password is weak.
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String pw = scanner.nextLine();
        
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;        
        
        for (int i=0; i<pw.length(); i++){
            char ch = pw.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCase++;
            } else if (Character.isLowerCase(ch)){
                lowerCase++;
            } else if (Character.isDigit(ch)){
                digit++;
            } else if ("!@#$%^&*()-+".indexOf(ch)>=0){
                specialChar++;
            }
        }
        if (upperCase>=1 && lowerCase >=1 && digit >=1 && specialChar >=1 && pw.length()>=8){
            System.out.println("Strength of password: Strong");
        } else if (upperCase>=1 && lowerCase >=1 && digit >=1 && specialChar >=1 && pw.length()>=6){
            System.out.println("Strength of password: Moderate");
        } else
            System.out.println("Strength of password: Weak");
        }
    }
    

//    for(int i=0;i<str.length();i++){ 
//        if((str.charAt(i)>='A')&&(str.charAt(i)<='Z')) 
//            Uppercase = true; 
//        if((str.charAt(i)>='a')&&(str.charAt(i)<='z')) 
//            Lowercase = true;
//    
//    for(int y=0;y<SpecialCharacter.length();y++){ 
//            if(str.charAt(i)==(SpecialCharacter.charAt(y))) 
//                        special = true; 
//                } 
//            } 
