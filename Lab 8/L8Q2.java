

public class L8Q2 {
    //2. Define a class name BankAccount. The class allows the customer to open the saving account with their name, 
    //IC or passport number and the deposit amount. The class consists of deposit method and withdraws method. 
    //Besides, the class can display the current balance. Create a Tester class to test the program.
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", "123402123", "A12345", 3000);
        acc.deposit(5000);
        acc.withdraw(300);
        acc.display();
        
    }
}
    class BankAccount{
        private String name;
        private String IC;
        private String passport;
        private double balance;
        
        public BankAccount(){
            name = null;
            IC = null;
            passport = null;
            balance = 0;
        }
        
        //constructor
        public BankAccount(String name, String IC, String passport, double deposit){
            this.name = name;
            this.IC = IC;
            this.passport = passport;
            this.balance = deposit;   
        }
        
        public void deposit (double amount){
            balance += amount;
        }
        
        public void withdraw (double amount){
            if (amount<balance){
                balance -= amount;
            } else 
                System.out.println("Your withdraw is more than your balance.");
        }
        
        public void display(){
            System.out.println("Name\t: " + name + "\nBalance\t: " + balance);
        }
    }  

