
package pyq23;

public class Q1 {

    public static void main(String[] args) {
        int randNum = (int)(Math.random()*1001);
        System.out.println("Generated number: " + randNum);
        int reverse = getReverse(randNum);
        System.out.println("Number in reversed order: " + reverse);
        int sum = sum(randNum);
        System.out.println("The sum of all integers: "  +sum);
    }
    
    public static int getReverse(int a){
        int rev = 0;
        while (a!=0){
            int digit = a%10;
            rev = rev*10 + digit;
            a /= 10;    
        }
        return(rev);   
    }
    
    public static int sum(int a){
        int sum = 0;
        while (a!= 0){
            int digit = a%10;
            sum += digit;
            a /= 10;
        }
        return sum;
    }
    
}
