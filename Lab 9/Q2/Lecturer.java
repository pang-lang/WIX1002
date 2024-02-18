
package Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturer extends PersonProfile {
    protected String[] coursename;
    protected String[] coursecode;
    protected int[] semester;
    protected int[] session;
    protected double[] credithour; 
    protected int[] noOfStudents;
    protected String filename;
    
    public Lecturer(String name, char gender, String dob, String filename) {
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
                while (i<6) {
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
            noOfStudents = new int[count];
            credithour = new double[count];
            
            input = new Scanner(new FileInputStream(filename));
            i=0;
            while (input.hasNextLine()){
                coursecode[i] = input.nextLine();
                coursename[i] = input.nextLine();
                semester[i] = Integer.parseInt(input.nextLine());
                session[i] = Integer.parseInt(input.nextLine());
                credithour[i] = Double.parseDouble(input.nextLine());
                noOfStudents[i] = Integer.parseInt(input.nextLine());
                i++; 
            }
            input.close();
            
        } catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
    
    public double getCreditHour(int n, double h){
        if (n>=150){
            return h*3;
        } else if (n>=100){
            return h*2;
        } else if (n>=50){
            return h*1.5;
        } else 
            return h;
    }
    
    public void display(){
        super.display();
        for (int i=0; i<coursecode.length; i++){
            System.out.print(coursecode[i] + " " + coursename[i] + " " + semester[i] + " " + session[i] + " ");
            System.out.println(noOfStudents[i] + " " + credithour[i] + " " + getCreditHour(noOfStudents[i], credithour[i]));
        }    
    }
}
    

