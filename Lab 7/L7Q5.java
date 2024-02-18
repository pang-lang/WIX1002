
package lab7;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class L7Q5 {
    public static void main(String[] args) {
        //5. Write a program that read data from a binary file person.dat. (Please download the binary file from the Web site.) 
        //Then, display the name, age and gender (M – Male, F – Female) in ascending order sort by name. 
        //The structure of the binary file is as below:
        //<intVariable-TotalNumberofRecord> 
        //<StringVariable-Name><IntVariable-Age><CharVariable-Gender>
        //<StringVariable-Name><IntVariable-Age><CharVariable-Gender>

        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("person.dat"));
            int num = s.readInt();
            String[] name = new String[num];
            char[] gender = new char[num];
            int[] age = new int[num];
            for(int i=0; i<num; i++){
                name[i] = s.readUTF();
                age[i] = s.readInt();
                gender[i] = s.readChar();
            }
        
        //bubblesort
            for(int i=0; i<num-1; i++){
                for(int j=0; j<num-1-i; j++){
                if(name[j].compareToIgnoreCase(name[j+1])>0){
                    String hold = name[j];
                    name[j] = name[j+1];
                    name[j+1] = hold;

                    int hold1 = age[j];
                    age[j] = age[j+1];
                    age[j+1] = hold1;

                    char hold2 = gender[j];
                    gender[j] = gender[j+1];
                    gender[j+1] = hold2;
                    }
                }
            }
            
            for(int i=0 ; i<num ; i++){
                System.out.println("Name: " + name[i]);
                System.out.println("Age: " + age[i]);
                System.out.print("Gender: ");
                switch(gender[i]){
                    case 'M':
                        System.out.println("Male\n");
                        break;
                    case 'F':
                        System.out.println("Female\n");
                        break;
                }
            }
        
        } catch (FileNotFoundException e){
          System.out.println("File was not found.");
        } catch (IOException e){
            System.out.println("Problem with file input.");
        }
    }
}
        
  
