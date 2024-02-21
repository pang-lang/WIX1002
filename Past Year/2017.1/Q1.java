
package pyq171;
import java. util. Scanner;
public class Q1 {
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in);
    int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
    int inputNumber; // number entered by user
    int value = 0; // number of stars to print
    int counter = 1; // counter for current number //err1
    while (counter <= 5){ 
        System.out.print( "Enter number: ");
        inputNumber = input.nextInt(); //err2
        //define appropriate num if input is between 1-30 
        if ( inputNumber >= 1 && inputNumber <= 30){ 
          switch (counter){ //err3
            case 1: number1 = inputNumber; break;
            case 2: number2 = inputNumber; break;
            case 3: number3 = inputNumber; break; //err
            case 4: number4 = inputNumber; break; //err
            case 5: number5 = inputNumber; break;
          } //err4
            counter++;//err5
        }// end if
        else 
        System.out.println( "Invalid Input\nNumber should be between 1 and 30" );
    }// end while
    // print histograms
    for (counter = 1; counter <= 5; counter++){ //err6
        switch (counter){ //err7
            case 1: value = number1; break;
            case 2: value = number2; break;
            case 3: value = number3; break;
            case 4: value = number4; break;
            case 5: value = number5; break;
        } // switch
        for (int j = 1; j <= value; j++) //err8
            System.out.print("*");
        System.out.println();
        } //end for loop
    } // end main
} //end class Graphs
    
