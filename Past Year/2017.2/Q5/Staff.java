
package pyq172;

public class Staff {
    protected String name;
    protected String ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }
    
    public String toString(){
        return "Full name : " + name + "\nIC : " + ic;
    }  
}
