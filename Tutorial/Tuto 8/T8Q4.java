
package tutorial8;
public class T8Q4 {
    public static void main(String[] args) {
        //4. Create a class Payment that accept different type of payment methods such as cash payment, cheque payment and credit card payment. 
        //For cash payment, the class accepts the amount in cash; for cheque payment, the class accepts the amount and the cheque number; 
        //for credit card payment, the class accepts the amount, card holder name, cardType, expiration date and validation code. 
        //Use the same method name for the payment.
        
        class Payment {
            private double amount; 
            private String chequeNo, cardName; //amount & cheque no
            private String date, validCode; //amount, name, type, date, validation code
        
        public void Payment(double amount){ //cash
            this.amount = amount;
        }
        
        public void Payment(double amount, String chequeNo){ //cheque
            this.amount = amount;
            this.chequeNo = chequeNo;   
        }
        
        public void Playment(double amount, String cardName, String date, String validCode){
            this.amount = amount;
            this.cardName = cardName;
            this.date = date;
            this.validCode = validCode;
        }
        }
    }
}
        
      
        
