package Q2a;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lecturer extends PersonProfile {
    private String[] coursename = new String[4];
    private String[] coursecode = new String[4];
    private int[] semester = new int[4];
    private int[] session = new int[4];
    private double[] credithour = new double [4];
    private int[] noofstudent = new int[4];
    
    public Lecturer(String name, char gender, String date){
        super(name, gender, date);
        
    try {
        Scanner input = new Scanner(new FileInputStream("lecturer.txt"));
        int i = 0;
        while(input.hasNextLine()){
            coursecode[i] = input.nextLine();
            coursename[i] = input.nextLine();
            semester[i] = input.nextInt();
            session[i] = input.nextInt();
            credithour[i] = input.nextInt();
            noofstudent[i] = input.nextInt();
        if (input.hasNext()){
            input.nextLine();
        } else break;
            i++;
        }
        } catch(IOException e){
            System.out.println("Problem with input file.");
        }
    }
    
    public void computeCreditHour(){
        for (int i=0; i< credithour.length; i++){
            if (noofstudent[i] >= 150){
                credithour[i] *= 3;
            } else if(noofstudent[i] >= 100){
               credithour[i] *= 2;
            } else if (noofstudent[i] >= 50){
                credithour[i] *= 1.5;
            } else 
                credithour[i] *= 1;
            }
    }
    
    public void display(){
        System.out.println("Course name \t: " + Arrays.toString(coursename));
        System.out.println("Course code \t: " + Arrays.toString(coursecode));
        System.out.println("Semester \t: " + Arrays.toString(semester));
        System.out.println("Session \t: " + Arrays.toString(session));
        System.out.println("Credit hours \t: " + Arrays.toString(credithour));
        System.out.println("Number of Students  :  " + Arrays.toString(noofstudent));
        System.out.print("Updated credit hour : ");
        for (double g : this.credithour) {
            System.out.print(g + " ");  
        }
    }
}
        
    
   
    
   
