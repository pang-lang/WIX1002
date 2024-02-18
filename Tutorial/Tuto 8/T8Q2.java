
package tutorial8;
public class T8Q2 {
    public static void main(String[] args) {
        Digit d1 = new Digit (1345);
        Digit d2 = new Digit (4567);
        d1.display();
        d2.display();       
    }
}

    //a. Define a class Digit.
    class Digit{
    
    //b. Declare the instance variable that used to store a number. 
        private int number;
            
    //c. Create a constructor that assign the parameter value to the number.
    public Digit(int a){
        number = a;
    }
    
    //d. Create a digitMultiplication method that returns the multiplication of the number. 
    //If the number is 1345, the method will return 60.
    public int digitMultiplication(){
        int a = number;
        int ans = 1;
        while (a>0){
            ans *= a%10;
            a/=10;
        }
        return ans;
    } 
    //e. Create a method that used to display the digit multiplication of the number.
    public void display(){
        System.out.println("The multiplication of " + this.number + " is " + digitMultiplication());
    }
    }
    
    


		
	
	