
package pyq182;

public class Essay extends GradedActivity{
    protected int grammar;
    protected int spelling;
    protected int length;
    protected int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        this.score = grammar + spelling + length + content;
    }
    
    @Override
    public String toString(){
        return "Essay Score: \nGrammar: " + grammar + "\nSpelling: " + spelling + "\nLength: " + length + "\nContent: " + content +
                "\n\n" + super.toString();
    }
}
