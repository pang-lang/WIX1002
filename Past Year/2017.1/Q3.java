
package pyq171;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
 
        //write file
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            char[] arr = new char [6];
            //generate an uppercase or a lowercase letter.        
            for (int i = 0; i < arr.length; i++) {
                char c;
                if (Math.random() < 0.5) {
                c = (char)((Math.random() * 26) + 'A');
            } else {
                c = (char) ((Math.random() * 26) + 'a');
            } out.print(c);
            } 
            out.close();
    } catch (IOException e){
            System.out.println("Problem with output file");
    }
        
        //read file
        try {
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            String temp = in.nextLine();
            char[] arr = new char [6];
            System.out.print("The string generated is: ");
                for (int i=0; i<arr.length; i++){
                    arr[i] = temp.charAt(i);
                    System.out.print(arr[i]);
                }
                
            System.out.print("\nCharacter in ascending order: ");
            sortArr(arr,'>');
            display(arr);
            System.out.print("\nCharacter in descending order: ");
            sortArr(arr,'<');
            display(arr);
            System.out.println("");
        } catch (IOException e){
            System.out.println("Problem with input file");
    }
    }

        
    public static void sortArr(char[] a, char c){
        char temp;
        if (c == '>'){
            for (int i=0; i<a.length-1; i++){
                for (int j=i+1; j<a.length; j++){
                    if (a[i] > a[j]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;  
                    }
                }   
            }                    
        } else
            for (int i=0; i<a.length-1; i++){
                for (int j=i+1; j<a.length; j++){
                    if (a[i] < a[j]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
    
    public static void display(char[] a){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
}
            
}


