
package tutorial10;
 //all classes in abstract method is an abstract class
 //abstract class cannot create any object

abstract class DiscountPolicy {

    abstract public double computeDiscount(int count, double cost);
}

class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discount;
    
    public BulkDiscount(int minimum, double discount) {
        this.minimum = minimum;
        this.discount = discount;
    }
    
    @Override
    public double computeDiscount(int count, double cost){
        if (count > minimum){
            return count*cost*(1-discount);    
        } else {
            return count*cost;    
        }
    }
}    

class OtherDiscount extends DiscountPolicy {
    @Override
    public double computeDiscount(int count, double cost){
        if (count >= 8){
            return count*cost*0.7;
        } else if (count >=6){
            return count*cost*0.8;
        } else if (count >=3){
            return count*cost*0.7;
        } else {
           return count*cost*1;
        } 
    }
}

class combineDiscount extends DiscountPolicy {
    //use abstract class to create variable
    //the object created can represent any discount policy
    private DiscountPolicy a;
    private DiscountPolicy b;

        public combineDiscount(DiscountPolicy a, DiscountPolicy b) {
            this.a = a;
            this.b = b;
        }
        
    @Override        
    public double computeDiscount(int count, double cost){
        double dp1 = a.computeDiscount(count, cost);
        double dp2 = b.computeDiscount(count, cost);
        if (dp1>dp2)
            return dp1;
        else
            return dp2;
        //return (Math.max(dp1.computeDiscount(count, cost), dp2.computeDiscount(count, cost)));
    }  
}

    
    
    
    

