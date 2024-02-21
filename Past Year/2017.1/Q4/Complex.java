
package pyq171;
public class Complex {
    private int real; //real
    private int imaginary; //imaginary

    public Complex() {
    }
    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void addComplexNum(Complex num1, Complex num2){
        int areal = num1.getReal() + num2.getReal();
        int aimaginary = num1.getImaginary() + num2.getImaginary();
        System.out.println("Addition of the two complex numbers: " + areal + " + " + aimaginary + "i");
    }
    
    public void subtractComplexNum(Complex num1, Complex num2){
        int sreal = num1.getReal() - num2.getReal();
        int simaginary = num1.getImaginary() - num2.getImaginary();
        System.out.println("Subtraction of the two complex numbers: " + sreal + " + " + simaginary + "i"); 
    }
    
    public String toString(){
        return "(" + real + " , " + imaginary + ")";
    }
}