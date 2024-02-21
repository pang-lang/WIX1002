
package pyq201;
public class Cloud {
    protected String cloudPackage;
    protected double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    public Cloud(String cloudPackage) {
        this.cloudPackage = cloudPackage;
    }
    
    public String toString(){
        return "Cloud Package: " + cloudPackage +
                " Total Cost = " + totalCost;
    }
    
}
