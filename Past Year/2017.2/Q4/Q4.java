
package pyq172;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q4 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Q4.dat"));
            out.writeUTF("25/03/2017");
            out.writeUTF("29/02/2100");
            out.writeUTF("19/01/2017");
            out.writeUTF("31/09/2015");
            out.writeUTF("31/05/2017");
            out.writeUTF("29/02/2016");
            out.close();
            
        } catch (IOException e){
            System.out.println("Problem with output file.");
        }
        
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Q4.dat"));
            String[] temp = new String[3];
            while (input.available() > 0){
                temp = input.readUTF().split("/");
                int q = Integer.parseInt(temp[0]);
                int m = Integer.parseInt(temp[1]);
                int y = Integer.parseInt(temp[2]);
                DayOfTheWeek d1 = new DayOfTheWeek(q, m, y);
                d1.display();
            }

        } catch(IOException e){
            System.out.println("Problem with input file.");
        }
    }
    
    
}
