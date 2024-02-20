
package pyq21;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers [1-9] : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        boolean hasSolution = false;
        char[] operator = {'+', '-', '*','/'};
        //first pair operator
        for (int i=0; i<4; i++){
            //second pair operator
            for (int j=0; j<4; j++){
                if (evaluate(operator[j],evaluate(operator[i], n1, n2), n3) == 18) {
                    hasSolution = true;
                    // add brackets around the first pair
                    if (i < 2 && j > 1){ 
                        System.out.printf("(%d %c %d) %c %d = %d\n", n1,operator[i],n2,operator[j],n3,18);
                    } else{
                        System.out.printf("%d %c %d %c %d = %d\n", n1,operator[i],n2,operator[j],n3,18);
                    }
                }
                
                if (evaluate(operator[j], n1, evaluate(operator[i], n2, n3)) == 18){
                    hasSolution = true; 
                    //add brackets around the second pair
                    if (i>1 && j<2){
                        System.out.printf("%d %c %d %c %d = %d\n", n1,operator[j],n2,operator[i],n3,18);
                    }
                    else{
                        System.out.printf("%d %c (%d %c %d) = %d\n", n1,operator[j],n2,operator[i],n3,18);
                    }
                }
            }
        }
        if (!hasSolution)
                System.out.println("No solution.");
    }
            
    
    public static double evaluate(char o, double a, double b){
        switch (o){
            case '+' : return a+b;
            case '-' : return a-b; 
            case '*' : return a*b;
            case '/' : return a / b;
            default : return 0;
        }
    }
}


      
