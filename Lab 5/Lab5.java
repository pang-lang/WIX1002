package lab5;
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        //1. Write a program to randomly generate N student scores (0-100). The program will
        //prompt the user to enter N students and store the score in an array. Then, the program
        //will display a list of score, the highest score, the lowest score and the average score.
        
        //N students
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int n = sc.nextInt();
        int sum = 0;
        double average = 0;
        //// Initialize min to the maximum possible integer value
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        int[] array = new int [n];
        System.out.print("The list of scores of " + n + " students is: ");
        
        for (int i=0; i<array.length; i++){
            int randNum = (int)(Math.random()*101);
            array[i] = randNum;
            sum += array[i];
        //compare max min use if and not else if    
            if(array[i]>max){
                max = array[i];
            } if(array[i]<min){
                min = array[i];
            }
            System.out.print(array[i] + " ");
        }
        
        average = (double) sum / n;
            
        System.out.println("");
        System.out.println("The highest score is " + max);
        System.out.println("The lowest score is " + min);
        System.out.println("The average score is " + average);            
            
        }
        
    }
    

