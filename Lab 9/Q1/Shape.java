
package Q1;

public class Shape {
    protected String name;
    protected double perimeter;
    protected double area;

    public Shape(String name) {
        this.name = name;
    }
    
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void display(){
        System.out.println("Shape: " + name);
        System.out.printf("Perimeter: %.2f\n" , perimeter);
        System.out.printf("Area: %.2f\n",area);
    }
    
}
