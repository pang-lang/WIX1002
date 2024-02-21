
package pyq181;

public abstract class Fruit {
    protected String name; 
    protected String type;

    public Fruit(String fruit, String type) {
        this.name = fruit;
        this.type = type;
    }
    
    public abstract double totalPrice();
    
    public String toString(){
        return type + " " + name + " - ";
    }
    
}
