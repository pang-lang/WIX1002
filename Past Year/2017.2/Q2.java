
package pyq172;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of teams: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //Consume the newline character left by nextInt()
        sc.nextLine();
        String [][] arr = new String[n][2];
        
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter team " + (i+1) + " name: ");
                arr[i][0] = sc.nextLine();
               
            System.out.print("Enter team " + (i+1) + " score: ");
                arr[i][1] = sc.nextLine();
        }
        
        //sort 2D array
        //to create temporary array for swapping
        String[][] temp = new String[1][2];
        for (int pass=1; pass<arr.length; pass++){
            for (int i=0; i<arr.length-1; i++){
                if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[i+1][1])){
                    temp[0][0] = arr[i][0];
                    temp[0][1] = arr[i][1];
                    
                    arr[i][0] = arr[i+1][0];
                    arr[i][1] = arr[i+1][1];
                    
                    arr[i+1][0] = temp[0][0];
                    arr[i+1][1] = temp[0][1];
                }
            }
        }
        
        System.out.println("List of the team with highest team score first: ");
        for (int i=0; i<arr.length; i++){
                System.out.print(arr[i][0] + "(" + arr[i][1] + ")" + " | ");
        }
    }
}
//can use 1d array also