import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        //Write a program that used to calculate mortgage loan. The program will create the amortization table with equal total payment plan. The following are the formula and the sample output.        
        Scanner input = new Scanner(System.in);
        double monthlyPayment, principle, totalMonth;
        double interest;
        double C, R, L;
        double totalInterest = 0;
        System.out.println("Enter principle amount: " );
        principle = input.nextDouble();
        System.out.println("Enter interest: ");
        interest = input.nextDouble();
        System.out.println("Enter total month: ");
        totalMonth = input.nextDouble();
        interest = interest / (12 * 100);
        System.out.println("Month Monthly Payment Principle Interest Unpaid Balance Total Interest");
        for(int m = 1; m <= 12; m++){
        monthlyPayment = ( principle * interest)/( 1 - Math.pow( 1 + interest, - totalMonth));
        C = monthlyPayment * Math.pow( 1 + interest, -(1 + totalMonth - m));
        L = monthlyPayment - C;
        R = (L / interest ) - C;
        totalInterest += L;
        System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", m, monthlyPayment, C, L, R, totalInterest);
          
        }
    }
}

/*
        double principle, interest, month, monthlyPayment;
        double totalInterest = 0;
        double c,l,r; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        principle = input.nextDouble();
        System.out.println("Enter the interest in %: ");
        interest = input.nextDouble()/ (12*100);
        System.out.println("Enter total number of month(s): ");
        month = input.nextInt();
        
        System.out.println("Month Monthly Payment Principle Interest Unpaid Balance Total Interest");
        for (int m=1; m<= 12; m++){
            monthlyPayment = (principle*interest)/(1 - Math.pow((1+interest),-m));
            c = m * Math.pow((1+interest),-(1+month-m));
            l = m - c;
            r = (l/interest)-c;
            totalInterest += l;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", m, monthlyPayment, c, l, r, totalInterest);
        }
*/