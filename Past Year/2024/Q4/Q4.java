
package q4;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        initializeSeatingPlan(5);
        
    }
    
    public static void initializeSeatingPlan(int n){
        Random rd = new Random();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = rd.nextInt(2);
            } 
        }
        analyzeSeating(arr);
    }
    
    public static void analyzeSeating(int[][] a) {
        int occupied = 0;
        int maxOccupiedSeats = 0;
        int rowIndex = -1;

        for (int i = 0; i < a.length; i++) {
            int rowOccupiedSeats = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    rowOccupiedSeats++;
                    occupied++;
                }
            }
            if (rowOccupiedSeats > maxOccupiedSeats) {
                maxOccupiedSeats = rowOccupiedSeats;
                rowIndex = i;
            }
        }

        System.out.println("Total Occupied Seats: " + occupied);

        if (rowIndex != -1) {
            System.out.println("Row with the Most Occupied Seats: " + (rowIndex+1));
        } else {
            System.out.println("No rows with occupied seats.");
        }
        display(a);
    }
    
    public static void display(int[][] arr){
        System.out.println("Seating Plan: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            } 
            System.out.println("");
        }
    }

}
