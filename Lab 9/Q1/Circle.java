
package Q1;

import java.util.Scanner;

public class Circle extends Shape{
    protected double diameter;
    
    public Circle() {
        super("Circle");
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        diameter = sc.nextDouble();
    }
    
    public void anc(){
        setPerimeter(Math.PI * this.diameter);
        setArea(Math.PI * this.diameter * this.diameter % 4);    
    }
}
