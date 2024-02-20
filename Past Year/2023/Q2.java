
package pyq23;
import java.util.Scanner;
public class Q2 {
        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in); 
        int numStudent = readNumStudent();
        while(numStudent < 0 || numStudent > 10){
            displayError();
            numStudent = readNumStudent();   
        }
        
        int[][] mark = new int[numStudent][];
        int numSubject=0;
        for (int i=0; i<numStudent; i++){
            numSubject = readNumSubject(i+1);
            while (numSubject < 0 || numSubject > 10){
                displayError();
                numSubject = readNumSubject(i+1);   
            }
            
            mark[i] = new int[numSubject];
            for (int j=0; j < numSubject; j++){
                mark[i][j] = readMark(i+1, j+1);
                if (mark[i][j] > 100 || mark[i][j] < 0){
                    displayError();
                    mark[i][j] = readMark(i+1, j+1);
                }
            }
            
        }
        
        System.out.println("List of Students (" + numStudent + " students)");
        
        double max=-1;
        int studentMax=-1;
        
        for (int i=0; i<numStudent; i++){
            int a = i+1;
            System.out.println("Student " + a);
            int sum = 0;
            for(int j=0; j<mark[i].length; j++){
                int b = j+1;
                System.out.print("Subject " + b + ": ");
                System.out.println(mark[i][j]);
                sum += mark[i][j];
            }
            double average = sum / mark[i].length;
            if (average > max){
                max = average;
                studentMax = i;
            }
            System.out.println("Avarage Marks: " + average);
        }
        System.out.println("Student " + studentMax + " has the highest average, with " + max + " marks");
    }
    
    public static int readNumStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudent = sc.nextInt();
            return numStudent;
    }
    
    public static void displayError(){
        System.out.print("Error!!!");
    }
    
    public static int readNumSubject(int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects for student " + i + ": ");
            return sc.nextInt();
    }
    
    public static int readMark(int i, int j){
        Scanner sc = new Scanner(System.in);
        System.out.print("Student (" + i + ") Enter mark for Subject " + j + ": ");
            return sc.nextInt();
    }
}
