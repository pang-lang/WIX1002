
import java.util.Scanner;
public class L8Q4 {
    public static void main(String[] args) {
        //4. Define a class Fraction. The class has an input method that accepts the numerator and the denominator from the user. 
        //Use the mutator method to set the numerator and denominator and the accessor method to get the value of numerator and denominator. 
        //This class also has a method to display the fraction reduced to lowest terms. 
        //(find the greatest common divisor for the numerator and denominator. Create a Tester class to test the program.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator\t: ");
        int num = sc.nextInt();
        System.out.print("Enter the denominator\t: ");
        int den = sc.nextInt();
        
        Fraction f = new Fraction(num,den);
        
        int nlowterm = f.getNumerator()/ f.getGCD();
        int dlowterm = f.getDenominator()/f.getGCD();
        System.out.println("The lowest term\t: " + nlowterm + " / " + dlowterm);
    }
}

    class Fraction{
        private int numerator;
        private int denominator;
        
        public Fraction(){
            numerator = 0;
            denominator = 0;           
        }

        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }
        
        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }
        
        public int getGCD(){
            int gcd = 1;
            for (int i=2; i<=numerator && i<=denominator; i++){
                if (numerator%i==0 && denominator%i ==0)
                    gcd = i;
            } return gcd;            
        }
        
    }
 
/*
      int gcd = 1, max;
        if(denominator>=numerator)
            max = denominator;
        else
            max = numerator;
        for(int i=max;i>=2;i--){
            if(denominator % i == 0 && numerator % i == 0){ // find common factor of both
                gcd = i;
                break;
            }
        }
        denominator /= gcd;
        numerator /= gcd;
*/