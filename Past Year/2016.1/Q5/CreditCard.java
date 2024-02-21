
package pyq161;
public class CreditCard {
    protected String name;
    protected String number;
    protected String type;
    protected double totalCashReward;
    
    public CreditCard(){
        name = null;
        number = null;
        type = null;
    }
    
    public CreditCard(String name, String number){
        this.name = name;
        this.number = number;
    }
  
    public double getTotalCashReward() {
        return totalCashReward;
    }

    public void setTotalCashReward(double totalCashReward) {
        this.totalCashReward = totalCashReward;
    }
    
    public String toString(){
        return "Credit card :" + name + " (" + number + ")" + "\nCard type: " + 
               type + "\nTotal Cash Reward: " + getTotalCashReward();
    }
    
}
