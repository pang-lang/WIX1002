
import java.util.Scanner;

public class T4Q4 {
    public static void main(String[] args) {
        //4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
        Scanner sc = new Scanner(System.in);
        System.out.println("original word: ");
        String word = sc.nextLine(), nstr = ""; 
        char ch;
        
        for (int i=0; i < word.length(); i++){
            ch= word.charAt(i); //extracts each character
            nstr += ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        
//------------------

        String in = "I have a cats.";
        String rev = "";

        for (int i=in.length()-1; i>=0; i--){
            char c = in.charAt(i);
            rev += c;
        } System.out.println(rev);
        
        
    }
    
}
