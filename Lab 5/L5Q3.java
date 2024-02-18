package lab5;
import java.util.Scanner;
public class L5Q3 {
    //3. Write a program that randomly generate the seven day work hours (1-8 hours) for N
    //employee. Then, display the work hours in seven days and the total hours for each employee.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee : ");
        int n = sc.nextInt();
        int sum = 0; 
        
        System.out.println("Work hours for 7 days for ");
        for (int i=1; i <= n; i++){
            System.out.print("Worker " + i + " this week is " );
            for (int j=0; j < 7; j++){
                int hours = (int)(Math.random()*8 + 1);
                System.out.print(hours + " ");
                sum += hours;
            }
            
            System.out.print("The total hours is " + sum);
            System.out.println("");    
            
        }
    }
}

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of employee: ");
        int n = sc.nextInt();
        int[][] working = new int[n][7];
        int total = 0;
        //no of employee
        for (int i=0; i<working.length; i++){
            System.out.println("Worker " + (i+1));
            System.out.println("Working hour: ");
            
            for (int j=0; j<working[i].length; j++){
                working[i][j] = (int)(Math.random()*8+1);
                System.out.print(working[i][j] + " ");
                
                total += working[i][j];
            } System.out.println("Total working hours: " + total);
            System.out.println("");
        }
*/
