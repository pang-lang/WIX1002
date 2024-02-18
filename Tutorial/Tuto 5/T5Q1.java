package tutorial5;
import java.util.Scanner;
public class T5Q1 {
    public static void main(String[] args) {
        //1a. Declare an array that used to store 12 floating point numbers.
        float[] floating = new float[12];           
        
        //b. Initialize an array that used to store the value of A to E.
        char[] value = {'A','B','C','D','E'};
        for (int i =0; i<value.length; i++){
            System.out.print(value[i] + " ");
        }
        System.out.println(" ");
        
        //c. Declare an array that used to store 100 students name.
        String[] name = new String[100];
        
        //d. Declare an array for a table with 6 rows 2 columns that used to store integer value.
        //rows, columns
        int [][] table = new int[6][2];
        
        //e. Initialize an array with the following value: 
        int rows = 3;
        int columns = 2;
        //int [][] matrix = new int [rows][columns];
        System.out.println("Before: ");
        int [][] arr = {{6,9},{2,5},{4,6}};
        
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        //f. After initialize the array, modify the value of the above array to 
        System.out.println("After: ");
        arr[2][0] = 3;
        arr[1][1] = 4;
        arr[2][1] = 7;
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        //g. Display all the values of an array name contact in separate lines.
        String[] nameContact = {"Ali", "01234", "Abu", "6789"};
        for (String nameContact1 : nameContact) {
            System.out.println(nameContact1);
        }
    }
}
    

