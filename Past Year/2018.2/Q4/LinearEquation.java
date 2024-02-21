
package pyq182;
public class LinearEquation {
    private int a, b, c, d, e, f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public String toString(){
        return (a + "x + " + b + "y = " + e + "\n" + c + "x + " + d + "y = " + f );
    }
    
    public boolean isSolvable(){
        return (a*d - b*c != 0);       
    }
    
    public double computeX(){
        int x;
        x = (e*d - b*f)/(a*d-b*c);
        return x;
    }
    
    public double computeY(){
        int y;
        y = (a*f - e*c)/(a*d-b*c);
        return y;
    }
}
