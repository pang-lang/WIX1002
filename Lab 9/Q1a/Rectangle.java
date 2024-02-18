package Q1a;

import java.util.Scanner;

public class Rectangle extends Shape{
    private double side;
    private double length;
        
    //parameterized constructor
    public Rectangle(){
        super("Rectangle");
        }
            
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of rectangle\t: ");
        this.side = sc.nextDouble();
        System.out.print("Enter the length of rectangle\t: ");
        this.length = sc.nextDouble();
    }
        
    public void computePerimeterandArea(){
        setPerimeter((this.side + this.length) * 2);
        setArea(this.side * this.length);
        }
}
