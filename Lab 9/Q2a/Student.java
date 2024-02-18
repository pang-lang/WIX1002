package Q2a;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Student extends PersonProfile { 
        private String[] coursename = new String[5];
        private String[] coursecode = new String[5];
        private int[] semester = new int[5];
        private int[] session = new int[5];   
        private int[] marks = new int[5];
    
    //list of course name and course code, semester, session, mark and a file name
    public Student(String name, char gender, String date){
        super(name, gender, date);
        
        try {
            Scanner input = new Scanner(new FileInputStream("course.txt"));
            int i =0;
            while(input.hasNextLine()){
                coursename[i] = input.nextLine();
                coursecode[i] = input.nextLine();
                semester[i] = input.nextInt();
                session[i] = input.nextInt();
                marks[i] = input.nextInt();
                if(input.hasNext()){
                    input.nextLine();
                } else break;
                i++;
            }
            input.close();
        } catch(IOException e){
            System.out.println("Problem with input file.");
        }
    }

    //cannot use char as got symbol
    public String getGrade(int index){
        if (marks[index] >= 85){
            return "A";
        } else if (marks[index] >= 75){
            return "A-";
        } else if (marks[index] >= 70){
            return "B+";
        } else if (marks[index] >= 65){
            return "B";
        } else if (marks[index] >= 60){
            return "B-";
        } else if (marks[index] >= 55){
            return "C+";
        } else if (marks[index] >= 50){
            return "C";
        } else if (marks[index] >= 45){
            return "D";
        } else if (marks[index] >= 35){
            return "E";
        } else 
            return "F";
    }
    
    public void display(){
        String [] grade = new String [5];
        for(int i = 0; i< marks.length; i++){
            grade[i] = getGrade(i);
        }
        
        System.out.println("Course name \t: " + Arrays.toString(coursename));
        System.out.println("Course code \t: " + Arrays.toString(coursecode));
        System.out.println("Semester \t: " + Arrays.toString(semester));
        System.out.println("Session \t: " + Arrays.toString(session));
        System.out.println("Marks \t: " + Arrays.toString(marks));
        System.out.print("Grade \t: ");
        for (String g : grade) {
            System.out.print(g + " ");
        }
    }
    
    
}
