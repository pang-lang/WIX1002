package lab6;
public class L6Q6 {
    public static void main(String[] args) {
        //6. Write a Java method that determine whether a number is a palindromic prime and another method that 
        //determine whether a number is emirp (the number is a prime number and the reverse also a prime number 
        //and is not palindromic prime). Then, write a Java program to use the methods to display the first 20 
        //palindromic prime and emirp.
        int count = 0;
        int i=0;
        while (count<=20){  
            if (isPrime(i) && isPalindrome(i)){
                System.out.print(i + " ");
                count++;   
            } 
            i++;
        }
    }
    
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i ==0){
                return false;
            } 
        } 
        return true;
    }
    
    public static boolean isPalindrome(int n){
        int original = n;
        int rem, rev=0;
        while (n!=0){
            rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return original == rev;       
    }        
}
        
                
      
   