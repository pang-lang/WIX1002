import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        //Write a program that asks users to enter the radius of a circle and a coordinate point (x, y). 
        //Determine whether the point is inside or outside the circle centered at (0, 0).
        
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = r.nextDouble();
        System.out.println("Enter the coordinate x: ");
        double x = r.nextDouble();
        System.out.println("Enter the coordinate y: ");
        double y = r.nextDouble();
        System.out.println("The coordinate point:(");
        //distance is less than the radius, r, then the point would lie inside the circle; 
        double distance = Math.pow((Math.pow(x,2)+(Math.pow(y,2))), 0.5);
        
        if (distance <= radius)
            System.out.println("The point lies inside the circle.");
        else
            System.out.println("The point lies outside of the circle.");
        
    }
    
}
    //x*x + y*y <= radius*radius
