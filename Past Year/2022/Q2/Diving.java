
package pyq22;

import java.util.Arrays;

public class Diving {
    protected String name;
    protected String country;
    protected double[][] scores = new double[3][7];
    protected double[] diff = new double[3];

    public Diving(String name, String country, double[][] scores, double[] diff) {
        this.name = name;
        this.country = country;
        this.scores = scores;
        this.diff = diff;
    }
    
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
    public double getFinalScore(){
        double sum = 0;
        double finalScore = 0;
        
        for (int i=0; i<scores.length; i++){
            Arrays.sort(scores[i]);
            for (int j=2; j<scores[i].length-2; j++){
                sum += scores[i][j];
            }
            sum *= diff[i];
            finalScore += sum;
        }
        return finalScore;
    }
    
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            str.append("Judges Scores : ");
            for (int j = 0; j < scores[i].length; j++) {
                str.append(scores[i][j]).append(" ");
            }
            str.append("\nDifficulty Rating : ").append(diff[i]).append("\n");
        }
        return String.format("Diver: %s (%s)\n%sFinal Score: %.2f", name, country, str.toString(), getFinalScore());                  
    }
}
