import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        //Write a program that calculates the total commission receives based on the table below. 
        //The program will accept the sales volume and calculate the commission. 
        //Display the commission in two decimal places.

        double sales, commission = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        sales = k.nextDouble();
        if (sales > 1000) {
            commission = (sales - 1000) * 12.5/100 + 500 * 10/100 + 400 * 7.5/100 + 100 * 5/100;
        } else if (sales > 500) {
            commission = (sales - 500) * 10/100 + 400 * 7.5/100 + 100 * 5/100;
        } else if (sales > 100) {
            commission = (sales - 100) * 7.5/100 + 100 * 5/100;
        } else if (sales > 0) {
            commission = sales * 5/100;
        } else {
            System.out.println("Invalid sales volume: ");
        }
        System.out.println("Total commission is " + commission + " for " + sales + " sales volume");       
    }   
}
