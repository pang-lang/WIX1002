
package tutorial9;
public class Organism {
    //2. Define a class Organism. The class contains the initial size of the organism and the growth rate. 
    //Create a constructor to initialize the instance variables. Then, define a class Animal. 
    //Animal is an organism that has extra instance variable which is the amount of eating need. 
    //Create a constructor to initialize the instance variable and a method to display the Animal instance variables.
    
    //no private since its private class cannot be access in child class 
    int size;
    double rate;
    
    public Organism(){
        size = 0;
        rate = 0;
    }
    
    public Organism(int size, double rate){
        this.size = size;
        this.rate = rate;
    }
    
    public void display(){
        System.out.println("Initial size\t: " + this.size + "\nGrowth rate\t: " + this.rate);
    }
}
    
    class Animal extends Organism{
        //private only for class Animal
        private double eatingNeeds;
        
        public Animal(){
            eatingNeeds = 0;
        }
        
        public Animal(int size, double rate, int eatingNeeds){
            //call superclass constructor to pass size and rate
            super(size,rate);
            this.eatingNeeds = eatingNeeds;
        }
    @Override
    public void display(){
        System.out.println("Initial size\t: " + this.size + "\nGrowth rate\t: " + this.rate + "\nAmount of eating needs : " + this.eatingNeeds);
    }
    
    public static void main(String[] args) {
        Organism o = new Organism(3,0.7);
        Animal animal = new Animal(5,0.8,40);
        System.out.println("Organism");
        o.display();
        System.out.println("Animal");
        animal.display();
    }
    
}
