
package Q2;
import Q2.MessageEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShuffleCipher implements MessageEncoder {
    private String inputFile, outputFile;
    private int N;
    
    public ShuffleCipher(String in, String out, int n) {
        inputFile = in;
        outputFile = out;
        N = n;
    }

    public void encoding() {
        String cipher;
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            Scanner in = new Scanner(new FileInputStream(inputFile));
            while (in.hasNextLine()) {
                cipher = in.nextLine();
                for(int i=1; i<=N; i++)
                    cipher = encode(cipher);
                out.println(cipher);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public void decoding() {
        String plain;
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            Scanner in = new Scanner(new FileInputStream(inputFile));
            while (in.hasNextLine()) {
                plain = in.nextLine();
                for(int i=1; i<=N; i++)
                    plain = decode(plain);
                out.println(plain);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public String encode(String s) {
        String s1, s2, s3="";
        int cnt;
        char c;
        cnt = s.length()/2;
        if (s.length()%2==0) {
            s1 = s.substring(0, cnt);
            s2 = s.substring(cnt, s.length());
            for(int i=0; i<cnt; i++) {
               c = s1.charAt(i);
               s3+= Character.toString(c);
               c = s2.charAt(i);
               s3+= Character.toString(c);
            }
        }
        else {
            s1 = s.substring(0, cnt);
            s2 = s.substring(cnt, s.length());
            for(int i=0; i<cnt; i++) {
               c = s1.charAt(i);
               s3+= Character.toString(c);
               c = s2.charAt(i);
               s3+= Character.toString(c);
            }
            c = s2.charAt(cnt);
            s3+=Character.toString(c);
        }
        return s3;
    }

    public String decode(String s) {
        String s1="", s2="", s3="";
        int cnt;
        char c;
        boolean status=false;
        cnt = s.length();
        if (cnt%2!=0) {
            cnt = cnt - 1;
            status = true;
        }
        for(int i=0; i<cnt; i+=2) {
            c = s.charAt(i);
            s1+= Character.toString(c);
            c = s.charAt(i+1);
            s2+= Character.toString(c);
        }
        if (status) {
            c = s.charAt(cnt);
            s1+= Character.toString(c);
        }
        s3 = s1 + s2;
        return s3;
    }
}

    
