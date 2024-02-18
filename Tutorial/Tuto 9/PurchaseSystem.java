
package tutorial9;
public class PurchaseSystem {
    //4. Define a class PurchaseSystem. The class consists of product code, unit price, quantity and total price. 
    //Besides the class consists of a method to compute the total price and a display method. 
    //Derived a class SugarPurchase from PurchaseSystem. 
    //This new class add a sugar weight attributed and override the method to compute the total price as unit price*quantity*sugar weight.
    
    private String code;
    private double price;
    private int quantity;
    protected double totalPrice;
    
    PurchaseSystem(){
        code = null;
        price = 0;
        quantity = 0;
        totalPrice = 0;
    }
    PurchaseSystem(String code, double price, int quantity){
        this.code = code;
        this.price = price; 
        this.quantity = quantity;
    }
    public double totalPrice(){
        return this.price * this.quantity;    
    }
    public void display(){
        System.out.println("The total price is RM " + totalPrice());    
    }
    
    class SugarPurchase extends PurchaseSystem{
        double weight;
        
        SugarPurchase(){
            weight = 0;
        }
        
        //@Override
        SugarPurchase(String code, double price, int quantity, double weight){
            super(code, price, quantity);
            this.weight = weight;
        }
        public double totalPrice(){
            return price * quantity * this.weight;    
        }
    }
        
    public static void main(String[] args) {
        PurchaseSystem purchaseSystem = new PurchaseSystem("111", 3.2, 5);
        purchaseSystem.display();
        PurchaseSystem.SugarPurchase sugarPurchase = purchaseSystem.new SugarPurchase("111", 3.2, 5, 10);
        sugarPurchase.display();
    }
}
        
       
    

