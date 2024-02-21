
package pyq181;

public class Watermelon extends Fruit {
    protected double weight;

    public Watermelon(String fruit, String type, double weight) {
        super(fruit, type);
        this.weight = weight;
    }

    
    public double totalPrice(){
        if (type.equalsIgnoreCase("Local")){
            if (weight<2)
                return weight*2.25;
            else if (weight<5)
                return weight*1.95;
            else
                return weight*1.65;  
        } else if (type.equalsIgnoreCase("Imported")){
            if (weight<2)
                return weight*3.75;
            else if (weight<5)
                return weight*3.45;
            else
                return weight*3.15; 
        } else 
            return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + weight + "kg = RM " + totalPrice();
    }
    
}
