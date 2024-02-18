
package tutorial10;

public interface Interest {
    public double computeInterest();    
    }

class SavingAccount implements Interest{
    private double balance;
    private final double rate = 0.5;
 
    public SavingAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest(){
        //return rate*balance/100/12;
        return (0.5/12)*balance;
    }
}

class FixedAccount implements Interest{
    private double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest(){
        return (0.3/12)*balance;
    }
}
