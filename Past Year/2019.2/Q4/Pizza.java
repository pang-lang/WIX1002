package pyq192;

public class Pizza {
    protected String size;
    protected int numOfCheeseTopping;
    protected int numOfBeefTopping;
    protected int numOfChickenTopping;

    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public double computeCost(){
        int total = numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping;
        if (size.equalsIgnoreCase("small")){
            return 10 + 2*total;
        } else if (size.equalsIgnoreCase("medium")){
            return 12 + 2*total ;
        } else if (size.equalsIgnoreCase("large")){
            return 14 + 2*total ;
    } return 0;
    } 
        
    public void display(){
            System.out.println("Pizza size: " + size + 
                "\nQuantity of Cheese Toppings: " + numOfCheeseTopping + 
                "\nQuantity of Beef Toppings: " + numOfBeefTopping + 
                "\nQuantity of Chicken Toppings: " + numOfChickenTopping + 
                    "\nTotal Cost: " + computeCost()); 
    }
    
}
