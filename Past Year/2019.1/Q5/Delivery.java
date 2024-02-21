
package pyq191;

public class Delivery {
    protected String sender, recipient;
    protected double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost(){
        if (weight<=5)
            return 2.8*weight;
        else if (weight<=20)
            return (weight-5)*5.2 + 5*2.8;
        else if (weight <=50)
            return 5*2.8 + 15*5.2 + (weight-20)*7;
        else
            return 5*2.8 + 15*5.2 + 30*7 + (weight-50)*8.6;
    }
    
    public String toString(){
        return "From : " + sender + " To : " + recipient + "\nWeight of Package : " + weight + 
                " kg" + "\nShipping Cost : RM" + totalCost(); 
        
    }

}