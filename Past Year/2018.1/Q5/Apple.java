
package pyq181;

public class Apple extends Fruit {
    protected int quantity;

    public Apple(String fruit, String type, int quantity) {
        super(fruit, type);
        this.quantity = quantity;
    }

    public double totalPrice(){
        if (type.equalsIgnoreCase("Green"))
            return quantity*1.2;
        else if (type.equalsIgnoreCase("Red"))
            return quantity*1.8;  
        else
            return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + quantity + " = RM " + totalPrice();
    }
}
