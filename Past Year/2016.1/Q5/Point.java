
package pyq161;
public class Point extends CreditCard {
    
    public Point(String name, String number){
        super(name, number);
        super.type = "Point Reward";
    }
    
    public double getReward(String day, double amount){
        if (day.equalsIgnoreCase("friday"))
            return totalCashReward += ((int)(amount)*0.01)*2;
        else if (day.equalsIgnoreCase("saturday"))
            return totalCashReward += ((int)(amount)*0.01)*3;
        else if (day.equalsIgnoreCase("sunday"))
            return  totalCashReward += ((int)(amount)*0.01)*4;
        return 0;
    }
}
    
    
    

