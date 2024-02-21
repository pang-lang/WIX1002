
public class FinancialRecord {
    private int id;
    private double balance;
    private double annualInterestRate;

    //constructor
    public FinancialRecord(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public FinancialRecord(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    //accessor and mutator
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void getMonthlyInterestRate(double annualInterestRate){
        System.out.println("The monthly interest rate is " + (annualInterestRate/12));
    }
    
    public void withdraw(double w){
        System.out.println("Previous balance: " + this.balance);
        this.balance -= w;
        System.out.println("Current balance after withdrawal of RM" + w + " is " + this.balance);      
    }
    
    public void deposit(double d){
        System.out.println("Previous balance: " + this.balance);
        this.balance += d;
        System.out.println("Current balance after deposit of RM" + d + " is " + this.balance);
    }
    
    public void displayRecordInfo(){
        System.out.println("The information about financial record is as follows: ");
        System.out.println("Financial record ID is: " + this.id);
        System.out.println("Financial record balance is: RM" + this.balance);
        System.out.println("Annual interest rate is: " + this.annualInterestRate);
    }
}
    
    
    

