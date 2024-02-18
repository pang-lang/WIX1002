
package Q1;

import java.util.Scanner;

public class Rectangle extends Shape{
    protected double sides;
    protected double length;
    
    public Rectangle() {
        super("Rectangle");
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides: ");
        sides = sc.nextDouble();
        System.out.print("Enter the length: ");
        length = sc.nextDouble();
    }
    
    public void anc(){
       setArea(sides*length);
       setPerimeter(2*(sides+length));
    }
    
}
