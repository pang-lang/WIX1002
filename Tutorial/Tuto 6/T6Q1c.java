package tutorial6;
public class T6Q1c {
    public static void main(String[] args) {
        //c. Define a static method that use to compute combination function C(n,k).
        //C(n,k) gives the number of different k-element subsets that can be found in a
        //given set of n elements. C(n,k) = n! / (k! (n-k)!
        int n = 5;
        int k = 2;
        System.out.println(factorial(n)/(factorial(k)*factorial(n-k)));
    }
    public static int factorial(int num){
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact *= i;
    }
        return fact;
    }
}
