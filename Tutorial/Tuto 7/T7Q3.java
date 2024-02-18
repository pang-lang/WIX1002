
package tutorial7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class T7Q3 {
    public static void main(String[] args) {
         
        //3. Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it 
        //in a text file named data.txt. Then, read from the text file and display the sentence.
        String str = "Hello World";
        int len = str.length();
        int[] strInInt = new int [len];
        for (int i=0; i<len; i++){
            strInInt[i]=str.charAt(i);
        }
        
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            //write to file
            for (int i=0; i<len; i++){
                for (int j=0; j<8; j++){
                    if ((strInInt[i]&128) ==0){
                        out.print("0");   
                    } else
                        out.print("1"); 
                    strInInt[i] <<= 1;
                }            
            }
            out.close();
        } catch (IOException e){
            System.out.println("Problem with file output");    
        }
        
        
        try {
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            String temp, str1 = "";
            temp = in.next();
            for (int i=0; i<temp.length()/8; i++){
                int a = Integer.parseInt(temp.substring(8*i,(i+1)*8),2);
                str1 +=(char)(a);
            }
            System.out.println(str1);
            in.close();
            
//              while (in.hasNext()) {
//                String binaryString = in.next();
//                int decimalValue = Integer.parseInt(binaryString, 2);
//                char character = (char) decimalValue;
//                System.out.print(character);
                      
        } catch (IOException e){
            System.out.println("Problem with file output.");
        }
    }
}
//        public static String reverse(String input){
//            char[] a = input.toCharArray();
//            int l, r = 0;
//            r = a.length - 1;
// 
//            for (l = 0; l < r; l++, r--){
//            // Swap values of l and r 
//            char temp = a[l];
//            a[l] = a[r];
//            a[r] = temp;
//        } return String.valueOf(a);
//    }
//}
        
       