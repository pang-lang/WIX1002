
package pyq201;

public class CloudPackage extends Cloud {
    protected int noOfCores;
    protected int memory;
    protected double pricePerHour;

    public CloudPackage(String cloudPackage, int noOfCores, int memory, double pricePerHour) {
        super(cloudPackage);
        this.noOfCores = noOfCores;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Job a){
        return memory >= a.getMemory();
    }
    
    //if straightaway return the total cost, the total cost in the toString method will become 0
    //as the toString inherits form the cloud class
    public double totalCost(Job a){
        totalCost = a.getNoOfTask() / noOfCores * 1 * pricePerHour;
        return totalCost;
        
    }
}
