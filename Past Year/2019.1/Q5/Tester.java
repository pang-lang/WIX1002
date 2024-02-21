
package pyq191;

public class Tester {
    public static void main(String[] args) {
        SpecialDelivery a = new SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        SpecialDelivery b = new SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew",19.0, true, true);
        
        System.out.println(a.toString());
        System.out.println("");
        System.out.println(b.toString());
        System.out.println("");
        System.out.println(c.toString());
        System.out.println("");
        System.out.println(d.toString());
        
        double total = a.totalCost() + b.totalCost() + c.totalCost() + d.totalCost();
        System.out.println("The total shipping cost is RM" + total);
    }
    
}
