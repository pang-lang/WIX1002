package Q1a;

import java.util.Scanner;

public class Circle extends Shape{
    double diameter;
        
    public Circle(){
        super("Circle");
    }
        
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        this.diameter = sc.nextDouble();
    }
        
    public void computePerimeterandArea(){
        setPerimeter(Math.PI * this.diameter);
        setArea(Math.PI * this.diameter * this.diameter % 4);    
    }
}
