
package Q1a;

public class Tester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Square s = new Square();
        
        r.input();
        r.computePerimeterandArea();
        r.display();
        System.out.println("");
        s.input();
        s.computePerimeterandArea();
        s.display();
        System.out.println("");
        c.input();
        c.computePerimeterandArea();
        c.display();
        System.out.println("");
    }    
}
