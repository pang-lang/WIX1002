
package pyq181;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {      
        double highestScore = 0;
        String winner = "";
        try {
            Scanner input = new Scanner(new FileInputStream("Q4.txt"));
            while (input.hasNextLine()){
                double[] score = new double[5];
                double min, max, diff=0, sum=0, finalScore = 0;
                
                String temp = input.nextLine();
                String[] line = temp.split(",");
                
                //Parse the scores from the line into score array
                for (int i=0; i<score.length; i++){
                    score[i] = Double.parseDouble(line[i+1]);
                }
                
                Arrays.sort(score);
                for (int i = 1; i < score.length - 1; i++) {
                    finalScore += score[i];
                }
                diff = Double.parseDouble(line[line.length-1]);
                finalScore *= diff;
                
                /*
                //remove max and min score
                max = score[0];
                min = score[0];
                for (int i=1; i<score.length; i++){
                    if (score[i]>max){
                        max = score[i];
                    } 
                    if (score[i]<min){
                        min = score[i];
                    }
                    sum += score[i];
                }
                
                diff = Double.parseDouble(line[line.length-1]);
                finalScore = (sum - max - min)*diff;
                */
                
                if (finalScore > highestScore){
                    highestScore = finalScore;
                    winner = line[0];
                }
                    
                System.out.println(line[0] + " score " + finalScore);
            }
            input.close();
            System.out.println(winner + " is the winner.");
        } catch(IOException e){
            System.out.println("Problem with input file.");
        }
    }
}
    

