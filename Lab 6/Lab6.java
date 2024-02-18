
package lab6;
public class Lab6 {
    public static void main(String[] args) {
       //1. Write a Java method that returns a triangular number. 
       //A triangular number is defined as 1+2+3+...+ n. 
       //Then, write a Java program to use the method to display the first 20 triangular numbers.
       
       System.out.println("The first 20 triangular numbers: ");
       triangularNumber();
   
    }
    public static void triangularNumber(){
        int n;
        //looping 20 times
        for (int count=1; count<=20 ; count++){
        int sum=0;            
        //calculate the sum
            for (int i=count; i>=1; i--){
               sum +=i;
            }
            System.out.print(sum + " ");
            
        }   
    }
}
        
/*
    public static void main(String[] args) {
        for (int i=1; i<=20; i++){
            System.out.println(triangularnumber(i));
        }
    }

    public static int triangularnumber (int n){
        //formula for triangular number
        return n*(n+1)/2;
    }

    for (int n=1; n<20; n++){
        int triangularNum = n*(n+1)/2;
        System.out.print(triangularNum + " ");
    }
*/