package tutorial7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class T7Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        //a. Store ten random integers within 0 to 1000 to a text file name integer.txt.
        try{
            PrintWriter out = new PrintWriter (new FileOutputStream("integer.txt"));
            for (int i=1; i<=10; i++){
                out.print((int)(Math.random()*1001) + " ");
            }
            out.close();            
        } catch (IOException e){
            System.out.println("Problem with file output.");
        }   
        
        //b. Read from the text file generated in a. Display all the integer and the largest integer.
        int max = Integer.MIN_VALUE;
        try{
            Scanner in = new Scanner (new FileInputStream("integer.txt"));
            
            while (in.hasNextInt()){
                int num = in.nextInt();
                System.out.print(num + " ");
                if (max<num){
                max = num;
                } 
            } 
            System.out.println("\nThe largest number is: " + max);
            in.close();    
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
        
        //c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
        try{
            ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("integer.dat"));
            for(int i =0; i<10; i++){
                out.writeInt((int)(Math.random()*1001));
            }
            out.close();
        } catch (IOException e){
            System.out.println("Problem with file output");
        }
        
        //d. Read from the binary file generated in a c. Display the all the integer and the average.
        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("integer.dat"));
            //keep on reading till end of file
            int num, sum =0, count=0;
            double average;
            try { 
                while (true) {
                    num = in.readInt();                  
                    System.out.print(num + " ");
                    sum += num;
                    count++;
                }
            } catch (EOFException e){}
            average = sum/count;
            System.out.println("\nThe average is " + average);
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found.");
        } catch (IOException e){
            System.out.println("Problem with file input.");
        }
    }
}
       
        
//objectoutputstream - write; objectinputstream - read
//printwriter out - print scanner in - 
    


        


        
    
            
           

            
        
                    
            
        
        
    
   


  
    
    

  
        

    
    
    
    


        
