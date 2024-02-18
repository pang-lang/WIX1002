
package tutorial9;
    //3. Define a class PaySystem. The class consists of the payrate per hour and the number of hours. 
    //The class also contains a method to return the total pay for a given amount of hours and a method to display the total payment. 
    //Derive a class RegularPay from PaySystem that has a constructor and did not override any base methods. 
    //Derived a class SpecialPay from PaySystem that override the base method and return the total pay plus 30% commission. 

public class PaySystem {
    double payrate;
    double hours;
    
    PaySystem(){
        payrate = 0;
        hours = 0;
    }
    PaySystem(double payrate, double hours){
        this.payrate = payrate;
        this.hours = hours;
    }
    
    public double totalPay(){
        return this.payrate * this.hours;
    }
    
    public void display(){
        System.out.println("The total payment is " + totalPay());
    }
}
    
    class RegularPay extends PaySystem {
        public RegularPay(double payrate, double hours){
            super(payrate, hours);
        }
    }

    
    class SpecialPay extends PaySystem {
        public SpecialPay(double payrate, double hours){
            super(payrate, hours);
        }
        
        @Override
        public double totalPay(){
            return this.payrate * this.hours * 1.3;
            //return super.totalPay()*1.3;
        }
    }


    
    
