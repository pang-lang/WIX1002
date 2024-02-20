
package midsem;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nine digit integer: ");
        int num = sc.nextInt();
       
        int third = num % 100000;
        int first = num / 100000000;
        int second = (num - (first * 100000000) - (third)) / 100000;
        
        int checkSum = 0; 
        int digit;
        int n = 1;
        
        while (n <= 9){
            digit = num % 10;
            checkSum += digit*n;
            num /= 10;
            n++;
        }
        checkSum %= 11;
        char lastDigit = (checkSum == 10) ? 'X' : (char)('0' + checkSum);
//        if (checkSum == 10){
//            checkSum = (char)('X');
//        } 
//        
        System.out.println("10-digit ISBN : " + first + "-" + second + "-" + third + '-' + checkSum);
    }
}
    