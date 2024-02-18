
public class L8Q7 {
    public static void main(String[] args) {
        //Define class money. The class is used to calculate the number of note and coins for a given amount of money. 
        //The available notes are RM100, RM50, RM10, RM5 and RM1. The available coins are 50cent, 20cent, 10cent and 5 cent. 
        //The class needs to round up the amount according to the table below. The class also contains addition and subtraction 
        //method to add or subtract two objects.

        Money money1 = new Money(10.14);
        money1.display();
 
        Money money2 = new Money(20.19);
        money1.addition(money2);
        money1.display();
        money2.display();
 
        Money money3 = new Money(5.12);
        money1.subtraction(money3);
        money1.display();
    }
}

    class Money {
        private double amount, amountRnd;
        private int note100, note50, note10, note5, note1;
        private int cent50, cent20, cent10, cent5;
 
    public Money(double a) {
        amount = a;
        note100 = 0;
        note50 = 0;
        note10 = 0;
        note5 = 0;
        note1 = 0;
        cent50 = 0;
        cent20 = 0;
        cent10 = 0;
        cent5 = 0;
    }
 
    public double getAmount() { return amount; }
 
    public void addition(Money m) {
        this.amount+=m.getAmount();
    }
 
    public void subtraction(Money m) {
        this.amount-=m.getAmount();
    }
 
    public void display() {
        compute();
        System.out.printf("Amount before rounding: %.2f\n", amount);
        System.out.printf("Amount after rounding: %.2f\n", amountRnd);
        System.out.printf("RM100: %d RM50: %d RM10: %d RM5: %d RM1: %d\n", note100, note50, note10, note5, note1);
        System.out.printf("50cent: %d 20cent: %d 10cent: %d 5cent: %d\n\n", cent50, cent20, cent10, cent5);
    }
 
    public void compute() {
        double temp;
        int total;
        temp = amount*100;
        total = (int) temp;
 
        if (total%10 == 9 || total%10 == 4)
            total+=1;
        else if (total%10 == 8 || total%10 == 3)
            total+=2;
        else if (total%10 == 7 || total%10 == 2)
            total-=2;
        else if (total%10 == 6 || total%10 == 1)
            total-=1;
 
        amountRnd = total / 100.0;
 
        note100 = total / 10000;
        total%=10000;
        note50 = total / 5000;
        total%=5000;
        note10 = total / 1000;
        total%=1000;
        note5 = total / 500;
        total%=500;
        note1 = total / 100;
        total%=100;
        cent50 = total / 50;
        total%=50;
        cent20 = total / 20;
        total%=20;
        cent10 = total / 10;
        total%=10;
        cent5 = total / 5;
    }    
}

/*
public class LabQ7 {
    public static void main(String[] args) {

        money a = new money();
        money b = new money();
 
        a.addNote(50);
        a.addCoin(10);
        a.total();

        b.addNote(10);
        b.total();

        a.subNote(10);
        a.addCoin(1);
        a.addCoin(5);
        a.total();
    }
}

    public class money {
        private int Tnote;
        private double Tcoin;

        public money(){}

        public int getNote(){
            return Tnote;
        }

        public double getCoin(){
            return Tcoin;
        }

    public void addNote(int note){
        if(note == 100  note == 50  note == 10  note == 5  note == 1){
            Tnote += note;
        }

        else{
            System.out.println("Invalid amount of note.");
        }
    }
 
    public void subNote (int note){
        if (note == 100  note == 50  note == 10  note == 5  note == 1) {
            Tnote -= note;
        } else {
            System.out.println("Invalid amount of note.");
        }
    }

    public void addCoin(double coin){
        if (coin == 50  coin == 20  coin == 10  coin == 5){
            coin /= 100;
            Tcoin += coin;
        } else {
            System.out.println("Invalid amount of note.");
        }
    }

    public void subCoin (double coin){
        if (Tcoin > 0) {
            if (coin == 50  coin == 20  coin == 10  coin == 5 || coin == 1) {
                coin /= 100;
                Tcoin -= coin;
            } else {
                System.out.println("Invalid amount of note.");
            }
        } else {
            System.out.println("Not enougn amount.");
        }
    }
 
    public double roundUp(double coin) {
        switch (coin + "") {
            case "0.11":
            case "0.12":
                return 0.10;
            case "0.13":
            case "0.14":
            case "0.15":
            case "0.16":
            case "0.17":
                return 0.15;
            case "0.18":
            case "0.19":
                return 0.20;
            default:
                return coin;
        }
    }
 
    public void total(){
        double total = (double)Tnote + Tcoin;
        double coin = total - (int)total;
        double roundUp = roundUp(coin);
        total = (int)total + roundUp;
        System.out.printf("Total is %.2f ", total);
    }
}

*/

