
package Q1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Rectangle -----");
        Rectangle r = new Rectangle();
        r.input();
        r.anc();
        r.display();
        System.out.println("");
        System.out.println("Circle -----");
        Circle c = new Circle();
        c.input();
        c.anc();
        c.display();
        System.out.println("");
        System.out.println("Square -----");
        Square s = new Square();
        s.input();
        s.anc();
        s.display();
    }
    
}
