
package pyq172;

public class Tester {
    public static void main(String[] args) {
        PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765", "EM02");
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301", 35);
        
        System.out.println(p1.toString());
        System.out.println("");
        System.out.println(p2.toString());
    }
    
}
