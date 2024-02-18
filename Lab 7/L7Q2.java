
package lab7;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream; 
import java.io.PrintWriter;
import java.net.URLConnection;

public class L7Q2 {
    public static void main(String[] args) {
        //Write the contents of the Web page into a text file name index.htm.

        try {
            URL u = new URL("https://fsktm.um.edu.my/"); 
            URLConnection cnn = u.openConnection(); 
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            PrintWriter write = new PrintWriter(new FileOutputStream ("index.htm"));
            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
                write.println(line);
            }
            
            write.close();
            in.close();
            
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage()); 
        }
    }
    
}

