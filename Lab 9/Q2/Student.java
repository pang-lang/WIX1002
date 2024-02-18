
package Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student extends PersonProfile {
    protected String[] coursename;
    protected String[] coursecode;
    protected int[] semester;
    protected int[] session;
    protected double[] mark;
    protected String filename;

    public Student(String name, char gender, String dob, String filename) {
        super(name, gender, dob);
        this.filename = filename;
    }
    
    public void getInput(){
        int i; 
        int count = 0;
        String temp;
        try {
            Scanner input = new Scanner(new FileInputStream(filename));
            while (input.hasNextLine()){
                i=0;
                while (i<5) {
                    input.nextLine();
                    i++;
                }
                count++;
            }
            input.close();
            coursecode = new String[count];
            coursename = new String[count];
            semester = new int[count];
            session = new int[count];
            mark = new double[count];
            
            input = new Scanner(new FileInputStream(filename));
            i=0;
            while (input.hasNextLine()){
                coursecode[i] = input.nextLine();
                coursename[i] = input.nextLine();
                semester[i] = Integer.parseInt(input.nextLine());
                session[i] = Integer.parseInt(input.nextLine());
                mark[i] = Double.parseDouble(input.nextLine());
                i++; 
            }
            input.close();
            
        } catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
    
    public String getGrade(double mark){
        if (mark >= 85){
            return "A";
        } else if (mark >= 75){
            return "A-";
        } else if (mark >= 70){
            return "B+";
        } else if (mark >= 65){
            return "B";
        } else if (mark >= 60){
            return "B-";
        } else if (mark >= 55){
            return "C+";
        } else if (mark >= 50){
            return "C";
        } else if (mark >= 45){
            return "D";
        } else if (mark >= 35){
            return "E";
        } else 
            return "F";
    }
    
    public void display(){
        super.display();
        for(int i=0; i<coursecode.length; i++) {
            System.out.print(coursecode[i] + " " + coursename[i] + " " + semester[i] + " " + session[i] + " ");
            System.out.println(mark[i] + " " + getGrade(mark[i]));
        }
    }
}
    
    
    

