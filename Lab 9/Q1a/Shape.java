package Q1a;

//name, perimeter, area
public class Shape {
    private String name;
    private double perimeter;
    private double area;

    Shape(){
        name = null;
        perimeter = 0;
        area = 0;
    }
    
    //constructor
    Shape(String name){
        this.name = name;
    }
    
    //getter and setter
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
        System.out.printf("Name: %s, Perimeter: %.2f, Area: %.2f", name, perimeter, area);   
    }
}
    
    
        
        
    
    
    
    
    
    
    



    
   
    
    


    

