
package pyq171;

public class Essay extends GradedActivity {
    protected int grammar;
    protected int spelling; 
    protected int length;
    protected int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        //super.setScore(g + l + s + c);
        this.score = grammar + spelling + length + content;
    }
 
    @Override
    public String toString(){
        return "Essay score: \n" + 
                "Grammar: " + grammar + "\n" +
                "Spelling: " + spelling + "\n" +
                "Length: " + length + "\n" +
                "Content: " + content + "\n" +
                        super.toString();
        
    }
    
}
