
package tutorial6;
public class T6Q1d {
    public static void main(String[] args) {
        //d. Define a static method that used to determine whether the parameter is a
        //pentagonal number. A pentagonal number is a figurate number that extends
        //the concept of triangular and square numbers to the pentagon. Pn = 1⁄2 n(3n -1)
        
        //The first few pentagonal numbers are 1, 5, 12, 22, 35, 51, 70, … 
         int n = 12;
        if (isPentagonalNumber(n))
            System.out.println(n + " is a pentagonal number");
        else 
            System.out.println(n + " is not a pentagonal number");
    }

    public static boolean isPentagonalNumber(int n) {
        int i = 1;
        int m;
        do {
            m = ((i * (3 * i - 1)) / 2);
            i += 1;
        } while (m < n);
        return m == n;
    }
}