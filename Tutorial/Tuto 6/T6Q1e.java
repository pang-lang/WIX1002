
package tutorial6;
public class T6Q1e {
    public static void main(String[] args) {
        // e. Define a static method that displays the number of letters and the number of
        //digits of a String parameter.
        String sentence = "plang0404";
        int letterCount = countLetter(sentence);
        int digitCount = countDigit(sentence);
        System.out.println("The number of letters is: " + letterCount);
        System.out.println("The number of digits is: " + digitCount);
    }
    public static int countLetter(String sentence){
        int letterCount = 0;
        for (int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
        if (Character.isAlphabetic(ch))
                letterCount++;
        }
       return letterCount;
    }
   public static int countDigit(String sentence){
       int digitCount = 0;
       for (int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (Character.isDigit(ch))
                digitCount++;
        }
       return digitCount;
   }
}
