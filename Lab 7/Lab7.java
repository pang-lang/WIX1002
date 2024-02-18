package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        //1. Write a program that store the table below in a binary file name coursename.dat. 
        //Then, ask the users to enter a course code. The program will display the course name from coursename.dat.
        storeCourse();
        readCourse();
    }
        public static void storeCourse(){
            try {
                
                ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("coursename.dat"));
                             
                out.writeUTF("WXES111");
                out.writeUTF("Programming I");
                out.writeUTF("WXES1115");
                out.writeUTF("Data Structure");
                out.writeUTF("WXES1110");
                out.writeUTF("Operating System");                  
                out.writeUTF("WXES1112");
                out.writeUTF("Computing Mathematics I");
                                                
            out.close();
        } catch (IOException e){
            System.out.println("Problem with file output.");
        }
        }
        public static void readCourse(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a course code: ");
            String cod = sc.nextLine();
            System.out.print("The course is: ");
        
        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("coursename.dat"));
            try { 
                while(true){
                    String courseCode = in.readUTF();
                    String courseName = in.readUTF();
                    
                if (cod.equals(courseCode)){
                    System.out.print(courseName + "\n");
                    break;
                }
            }
            
        } catch (EOFException e){
            System.out.println("Course code not found.");
        }
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }    
}

// also can be as in two array
// for (int i=0; i<courseCode.length; i++)
//  for (int j=0; j<courseName.length; j++)
//    sout coursecode[i]
//      sout coursecode[j]

//        try{
//                String[][] array = {{"WXES1116", "Programming I"}, {"WXES1115", "Data Structure"}, {"WXES1110", "Operating System"}, {"WXES1112", "Computing Mathematics I"}};
//                ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("coursename.dat"));
//                for(int i=0;i<array.length;i++){
//                    for(int j=0;j<array[i].length;j++){
//                        output.writeUTF(array[i][j]);
//                    }
//                }
//                output.close();
//            } catch(IOException e){
//                System.out.println("Problem with file output.");
//            }
//        
//    try{
//                ObjectInputStream input = new ObjectInputStream(new FileInputStream("course.dat"));
//                System.out.print("Enter the course code: ");
//                Scanner sc = new Scanner(System.in);
//                String code = sc.nextLine();
//                boolean found = false;
//                try{
//                    while(true){
//                        String courseCode = input.readUTF();
//                        String courseName = input.readUTF();
//                        if(courseCode.equals(code)){
//                            found = true;
//                            System.out.println("The course name for the code is "+courseName+".");
//                            break;
//                        }
//                    }
//                }catch(EOFException e){
//                    System.out.println("Couldn't find the course code.");
//                }
//                input.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("The file is not found.");
//            } catch (IOException e) {
//                System.out.println("Problem with file output.");
//            }
//        }

