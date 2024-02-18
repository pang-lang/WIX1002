package lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        //4. Write a program that display the number of characters, words and lines in a text file. 
        //Assume that each word is separated by one space character.
        

        int charCount = 0, wordCount = 0, lineCount = 0;
        
        try {
            Scanner input = new Scanner(new FileInputStream("course.txt"));
            String temp = "";
            
            while(input.hasNextLine()){
                temp = input.nextLine();
                lineCount++;
                
                String[] words = temp.split(" ");
                wordCount += words.length;
                
                char[] character = temp.toCharArray();
                charCount += character.length;
            }
            input.close();
        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
        
        System.out.println("Character count: " + charCount);
        System.out.println("Words count: " + wordCount);
        System.out.println("Lines count: " + lineCount);
        
    }
}
