
public class Q6 {
    public static void main(String[] args) {
        FinancialRecord A = new FinancialRecord(1234, 10000,7.77);
        A.displayRecordInfo();
        
        System.out.println("");
        
        FinancialRecord B = new FinancialRecord(1001, 20000,8.0);
        B.displayRecordInfo();
        B.getMonthlyInterestRate(8.0);
        B.deposit(1500);
        B.withdraw(500);
        
    }
    
}
