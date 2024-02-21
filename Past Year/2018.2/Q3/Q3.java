
package pyq182;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String[][] no = new String[10][2];
        String[] names = new String[10];
        double[] marks = new double[10];
        int count = 0;
        double max = 0, min = 0;
        int index1 = 0, index2 = 0;
        
        try {
            Scanner input = new Scanner(new FileInputStream("student.txt"));
            while (input.hasNextLine()){
                String temp = input.nextLine();
                for (int i =0; i<10; i++){
                    no[i] = temp.split(",");
                    names[i] = no[i][0];
                    marks[i] = Double.parseDouble(no[i][1]);
                
                max = marks[0];
                min = marks[1];
                    if (marks[i] == -1){
                        count++;
                    } else {
                        if (marks[i] > max){
                            
                            index1 = i;
                    }   else if (marks[i] < min){
                            index2 = i;
                    }
                }
            }   
        }
            input.close();
            System.out.println("The student with the highest mark: " + names[index1]);
            System.out.println("The student with the lowest mark: " + names[index2]);
            System.out.println("The number of students who were absent from the exam: "  + count); 
            
        }catch(IOException e){
            System.out.println("Problem with input file.");
        } 
    }
}
