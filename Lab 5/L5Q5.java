package lab5;
import java.util.Scanner;
public class L5Q5 {
    public static void main(String[] args) {
        //5. Write a program that generates 20 random integers within the range from 0 to 100.
        //Sort the array in descending order. Then, accepts an integer input from the user. Then,
        //search the array using this number. Compare the performance of linear search and
        //binary search. 
        Scanner sc = new Scanner(System.in);
        int[] array = new int [20];
        System.out.println("A list of 20 random integer within 0 to 100: ");
        //generate 20 random numbers
        for (int i=0; i< array.length; i++){
            int randNum = (int)(Math.random()*101);
            array[i] = randNum;
            System.out.print(randNum + " ");   
        } 
        System.out.println("");
        System.out.println("The integers in descending order: ");
        
        //sort integers in descending order
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j=i; j<array.length; j++){
                if (array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a: array){
            System.out.print(a + " ");
        }
        System.out.println("");
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();
        
        //linear search
        boolean found = false;
        for (int i=0; i<array.length;i++){
            if (array[i] == input){
                System.out.println("LINEAR SEARCH: "
                        + "Number found at position " + i);
                found = true;
                break;
            }
        }
        if (!found){
                System.out.println("lINEAR SEARCH :"
                + " Number not found");
    }
             
        //binary search
        int low=0; 
        int high = array.length-1;
        boolean foundb = false;
        
        while (low <= high){
            int middle = low + (high-low)/2;
            int value = array[middle];
            
            if (value < input) { 
                low = middle + 1;
            } else if (value > input) {
                high = middle - 1;
            } else {
                System.out.println("BINARY SEARCH: Number found at position " + middle);
                foundb = true;
                break;
            }
        }
        if (!foundb){
            System.out.println("BINARY SEARCH: Number not found");
    }
    }
}
         


