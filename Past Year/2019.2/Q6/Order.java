
package pyq192;

public class Order {
    protected String customerName;
    protected String customerID;
    protected int quantityOrdered;
    protected double unitPrice;

    public Order() {
        customerName = null;
        customerID = null;
        quantityOrdered = 0;
        unitPrice = 0.0;
    }
    
    public Order(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        return quantityOrdered * unitPrice;
    }
    
    public String toString(){
        return "Order record" + 
                "\nCustomer Name: " + customerName + 
                "\nCustomer ID: " + customerID + 
                "\nQuantity Ordered: " + quantityOrdered + 
                "\nUnit Price: " + unitPrice + 
                "\nTotal Price: " + computeTotalPrice();               
    }
}
