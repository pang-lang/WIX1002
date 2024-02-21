package pyq192;


import java.util.Scanner;


public class Q3 {
    
    public static void main(String[] args) {
        char input;
  
        do {
            Scanner sc = new Scanner(System.in);
            int n1 = (int)(Math.random()*10);
            int n2 = (int)(Math.random()*10);
            System.out.print("What is " + n1 + " + " + n2 + " ? ");
            int user = sc.nextInt();
            
            int ans = n1 + n2;
            if (user == ans){
                System.out.println(n1 + " + " + n2 + " = " + user + " is true");  
            } else {
                System.out.println(n1 + " + " + n2 + " = " + user + " is false");  
            }
            
            System.out.print("Do you want to try another question (y/n)? ");
            input = sc.next().charAt(0);
            
            if (input == 'n'){
                System.out.println("Program ends");
                break;
            }
          
        } while (input == 'y');
    }
    
}
