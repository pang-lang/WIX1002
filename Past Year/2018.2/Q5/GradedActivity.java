
package pyq182;

public class GradedActivity {
    protected static int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static char getGrade(int s){
        if (s >= 90){
            return 'A';
        } else if (s >= 80){
            return 'B';
        } else if (s >= 70){
            return 'C';
        } else if (s >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public String toString(){
        return "Total Score: " + score + "\nEssay Grade: " + getGrade(score);
    }
    
}
