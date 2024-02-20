
package pyq22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new FileInputStream("Diving.txt"));
            int lines = 0;
            while (input.hasNextLine()){
                lines++;
                input.nextLine();
            } 
            int noOfRecords = lines/5;
            
            Diving[] diver = new Diving[noOfRecords];
            input = new Scanner(new FileInputStream("Diving.txt"));
            
            for (int i=0; i<noOfRecords; i++){
                String name = input.nextLine();
                String country = input.nextLine();
                double[][] scores = new double[3][7];
                double[] diff = new double[3];
                for (int d=0; d<3; d++){
                    for (int s=0; s<7; s++){
                        scores[d][s] = input.nextDouble();
                    }
                    diff[d] = input.nextDouble();
                }
                diver[i] = new Diving(name, country,scores,diff);
                if (i != noOfRecords - 1) 
                    input.nextLine(); // capture the "next line" if not the last element
            }
            input.close();
            
            for (Diving d : diver){
                System.out.println(d.toString());
                System.out.println("");
            }
            
            for (int pass=0; pass<noOfRecords; pass++){
                for (int i=0; i<noOfRecords-1; i++){
                    if (diver[i].getFinalScore() < diver[i+1].getFinalScore()){
                        Diving hold = diver[i];
                        diver[i] = diver[i+1];
                        diver[i+1] = hold;
                    }
                }
            }
            
            System.out.println("Gold : " + diver[0].getName() + "(" + diver[0].getCountry() + ")");
            System.out.println("Silver : " + diver[1].getName() + "(" + diver[1].getCountry() + ")");
            System.out.println("Bronze : " + diver[2].getName() + "(" + diver[2].getCountry() + ")");
            
        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
    }
    
}
