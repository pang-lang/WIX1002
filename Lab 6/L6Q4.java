package lab6;
public class L6Q4 {
    public static void main(String[] args) {
        //4. Write a Java method that implements Euclidean Algorithm to return the greatest common divisor of two positive integers. 
        //Then, write a program to get the GCD for (24, 8) and (200, 625).
        System.out.println("The gcd for 24 and 8 is " + getGCD(24,8));
        System.out.println("THe gcd for 200 and 625 is " + getGCD(200,625));
        }
        public static int getGCD(int n1, int n2){
        int gcd = 1;
        //possible gcd
        int k = 2;
        while (k<=n1 && k<=n2){
            if (n1 % k == 0 && n2 % k == 0){
                gcd = k; 
            }
            k++;
        }
        return gcd;
        }
}

/*
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
*/

/*
    public static void getGCD(int a, int b){
        int gcd = 1;
        for (int i=2; i<=a && i<=b; i++){
            if (a%i==0 && b%i==0){
                gcd = i;
            } 
        } 
        System.out.print(gcd);  
    }
*/      
    

