
package pyq192;

public class QuadraticEquation {
    private int a;
    private int b; 
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
     public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int Discriminant(){
        return b*b - 4*a*c;
    }
    
    public double calcRoot1(){
        if (Discriminant() >= 0){
            double r1 = (-(b) + Math.sqrt(b*b - 4*a*c))/2*a;
            return r1;
        } else
            return 0;
    }
    
     public double calcRoot2(){
         if (Discriminant() >= 0){
            double r2 = (-(b) - Math.sqrt(b*b - 4*a*c))/2*a;
            return r2;
        } else
            return 0;
    }
}
