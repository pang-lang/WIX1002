
package pyq161;

public class Rebate extends CreditCard{
    
    public Rebate(String name, String number){
        super(name, number);
        super.type = "Cash Rebate";
    }
    
    public double getReward(String item, double amount){
        if (item.equalsIgnoreCase("fuel"))
            return totalCashReward += amount * 0.08;
        else if (item.equalsIgnoreCase("utility"))
            return totalCashReward += amount * 0.05;
        else if (item.equalsIgnoreCase("grocery"))
            return totalCashReward +=amount * 0.02;
        else 
            return totalCashReward += amount * 0.002;
    } 
    
    public double setTotalCashReward() {
        return totalCashReward;
    }
}
