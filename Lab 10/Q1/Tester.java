
package Q1;

public class Tester {
    public static void main(String[] args) {
        Permanent p = new Permanent("Ali",'A');
        p.showDetails();
        System.out.println("");
        
        Contract c = new Contract("Charlotte",4000);
        c.showDetails();
        System.out.println("");
        
        Temporary t = new Temporary("Lydia", 8);
        t.showDetails();
    }
    
}
