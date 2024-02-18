
package tutorial5;

import java.util.Scanner;

public class T5Q5 {
    public static void main(String[] args) {
        //5. Write the statements that display the string array name sentence in reverse order.
        //Each string element must be displayed in reverse order as well.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        String [] s = sentence.split(" ");
        String [] rev = new String[s.length];
        
        for (int i = 0; i<s.length; i++){
            rev[i] = "";
            for (int j=s[i].length()-1; j>=0; j--){
                char c = s[i].charAt(j);
                rev[i] += c;
            }
               
        }
        for(int i=rev.length-1; i>=0; i--){
            System.out.print(rev[i] + " ");
        }
        
    }
    
}
