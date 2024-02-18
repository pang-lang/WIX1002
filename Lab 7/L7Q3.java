package lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args) {
        //3. Write the statements that replace each line of a text file with its reverse and save it to a new text file name reverse.txt.
        
        try {
            Scanner input = new Scanner((new FileInputStream("lecturer.txt")));
            PrintWriter output = new PrintWriter(new FileOutputStream("reversex.txt"));
            while(input.hasNextLine()){
                String temp = input.nextLine();
                System.out.println(getReverse(temp));
                output.println(getReverse(temp));
            }
            output.close();
        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
    }
        public static String getReverse(String t){
            String result = " ";
            String[] temp = t.split(" ");
            for (int i=temp.length-1; i>=0; i--){
                result += temp[i] + " ";
            }
            return result;
        }
         
    }

/*

    try {
            Scanner input = new Scanner(new FileInputStream("lecturer.txt"));
            PrintWriter output = new PrintWriter(new FileOutputStream("reverse.txt"));
            //reading from txt file
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(reverseString(line));
                output.println(reverseString(line));
            }
            output.close();
            System.out.println("Content reversed and saved to reverse.txt successfully.");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    public static String reverseString(String input) {
        //converts the string to a character array
        char[] charReverse = input.toCharArray();
        String result = "";
        for (int i=charReverse.length-1; i>=0; i--){
            result = result+charReverse[i];
        }
        return result;
        }
    }

*/
        

        
        
        
        
    
  