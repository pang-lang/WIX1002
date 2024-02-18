
public class L8Q6 {
    public static void main(String[] args) {
        //6. You operate several burger stalls distributed throughout town. Each burger stall has an ID and the number of burger 
        //sold for the day. The class consists of a constructor to initialize the instance variables and a sold method that increment 
        //the number of burger sold by parameter value. The class also contains a variable and method that tracks the total number of 
        //burgers sold in all stalls. Display the total burger sold by each stall and the total number of burgers sold in all stalls.
        Burgers s1 = new Burgers("P Ali", 70);
        Burgers s2 = new Burgers("Salam", 100);
        s1.display();
        s2.display();
        Burgers.displayAll();
    }
}
        class Burgers{
            private String ID = null;
            private int burgers;
            private static int totalBurgers = 0;
            
            public Burgers(){
                ID = null;
                burgers = 0;
            }
            
            public Burgers(String ID, int burgers){
                this.ID = ID;
                this.burgers = burgers;
                totalBurgers += burgers;
            }
            
            public void display(){
                System.out.println("The total burger sold by " + ID  + " : " + burgers);
            }
            
            public static void displayAll(){
                System.out.println("The total burger sold in all stall : " + totalBurgers);
            }
        }
        
    
    
/*
Burger a = new Burger("MiMi");
       Burger b = new Burger("HaoHao");
       a.sold(100);
       a.sold(10);
       b.sold(80);
        System.out.println("Total sales for Burger stal("+ a.getID() + ") is " + a.getTotalSales());
         System.out.println("Total sales for Burger stal("+ b.getID() + ") is " + b.getTotalSales());
 
         System.out.println("Total sales for all burger stall is " + Burger.getAllSales());
    }
 
}
 
 
public class Burger {
    private String id;
    private int sold;
    private static int totalSales = 0;
 
 
    public Burger(){
        id = "0000";
 
    }
 
    public Burger(String ID){
        id = ID;
 
    }
 
    public String getID(){
        return id;
    }
 
    public int getSold(){
        return sold;
    }
 
    public int getTotalSales(){
 
        return sold;
    }
 
    public static int getAllSales(){
        return totalSales;
    }
 
    public void sold(int quantity){
 
        if(quantity > 0){
            sold += quantity;
            totalSales += quantity;
            System.out.println("Burger stall (" + getID() + ") " + "has sold " + quantity + " burgers today.");
        }
        else{
            System.out.println("No burger sold");
        }
    }
}
*/