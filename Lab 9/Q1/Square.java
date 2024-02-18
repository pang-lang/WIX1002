
package Q1;

import java.util.Scanner;

public class Square extends Shape{
    protected double sides;

    public Square() {
        super("Square");
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides: ");
        sides = sc.nextDouble();
    }
    
    public void anc(){
       setArea(sides*sides);
       setPerimeter(4*(sides));
    }
    
}
