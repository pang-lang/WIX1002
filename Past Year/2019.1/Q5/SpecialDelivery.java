
package pyq191;

public class SpecialDelivery extends Delivery {
    protected boolean weekend;
    protected boolean nighttime;

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean nighttime) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }
    
    public double totalCost(){
        if (weekend == true && nighttime == true){
            return (super.totalCost() + 50)*1.2;
        } if (nighttime == true){
            return (super.totalCost()*1.2);
        } if (weekend == true){
            return (super.totalCost() + 50);
        } else
            return super.totalCost();
    }
    
    public String toString(){
        if (weekend == true && nighttime == true){
            return super.toString() + "\nWeekend Delivery \nNight Time Delivery";
        } if (nighttime == true){
            return super.toString() + "\nNight Time Delivery";
        } if (weekend == true){
            return super.toString() + "\nWeekend Delivery";
        } else { 
            return super.toString();
        }
    } 
}
 