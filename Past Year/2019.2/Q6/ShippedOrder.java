
package pyq192;

public class ShippedOrder extends Order{

    public ShippedOrder(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        super(customerName, customerID, quantityOrdered, unitPrice);
    }
    
    public double computeTotalPrice(){
        return quantityOrdered * unitPrice + 4;
    }
    
    public String toString(){
        return "\nShipped" 
                + "\n" + super.toString();
    }
    
}
