package pyq201;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Frequency Distribution Table");
        int cnt2 = 0, cnt4 = 0, cnt6 = 0, cnt8 = 0, cnt10 = 0;
        try {
            Scanner input = new Scanner(new FileInputStream("raw.txt"));
            while(input.hasNextLine()){
                int num = input.nextInt();
                switch(num){
                    case 2 : cnt2++; break;
                    case 4 : cnt4++; break;
                    case 6 : cnt6++; break;
                    case 8 : cnt8++; break;
                    case 10 : cnt10++; break;
                }
            }
            input.close();
            System.out.println("2 : " + cnt2);
            System.out.println("4 : " + cnt4);
            System.out.println("6 : " + cnt6);
            System.out.println("8 : " + cnt8);
            System.out.println("10 : " + cnt10);
            
            System.out.println("The mode the data set is: " + findMode(cnt2,cnt4,cnt6,cnt8,cnt10));
        } catch (IOException e){
            System.out.println("Problem with file input.");
        }
    }
    
    public static int findMode(int c2, int c4, int c6, int c8, int c10){
            if (c2>c4 && c2>c6 && c2>c8 && c2>c10){
                return 2;
            } else if (c4>c2 && c4>c6 && c4>c8 && c4>c10){
                return 4;
            } else if (c6>c2 && c6>c4 && c6>c8 && c6>c10){
                return 6;
            } else if (c8>c2 && c8>c4 && c8>c6 && c10>c6){
                return 8;
            } else
                return 10;
                  
    }
    
}
