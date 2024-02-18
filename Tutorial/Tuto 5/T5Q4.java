
package tutorial5;

import java.util.Scanner;

public class T5Q4 {
    public static void main(String[] args) {
        //4. Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence. 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the statement: ");
        String statement = scanner.next();
        //split the statement in terms of space
        
        String[] a = statement.split(" ");
        String word = "the";
        int count = 0;
        for (int i=0; i<a.length; i++){
            if (word.equals(a[i])){
                count++;}
        }
        System.out.println("The number of occurrence of the word 'the' : " + count + " times");
        
    }
    
}
