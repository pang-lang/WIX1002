package Q1a;


import java.util.Scanner;

public class Square extends Shape{
    double sideLength;
        
    public Square(){
        super("Square");
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of the square\t: ");
        this.sideLength = sc.nextDouble();
    }    
    public void computePerimeterandArea(){
        setPerimeter(4 * this.sideLength);
        setArea(this.sideLength * this.sideLength);
    }
    
}
