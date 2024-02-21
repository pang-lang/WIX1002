
package pyq191;

import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        
        System.out.println("Matrix A");
        generateMatrix(arr1);
        displayMatrix(arr1);
        
        System.out.println("Matrix B");
        generateMatrix(arr2);
        displayMatrix(arr2);
        
        System.out.println("Matrix A + B");
        addMatrix(n,arr1,arr2);
        
        System.out.println("Matrix A x B");
        multiplyMatrix(n,arr1,arr2);
        

    }
    
    public static void generateMatrix(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        } 
    }
    
    public static void displayMatrix(int[][] a){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
            } System.out.println("");
        }
    }
    
    public static void addMatrix(int n, int[][] a1, int[][] a2){
        int[][] arr = new int[n][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = a1[i][j] + a2[i][j];
                System.out.print(arr[i][j] + " ");
            } System.out.println("");
        }
        
    }
    
    public static void multiplyMatrix(int n, int[][] a1, int[][] a2){
        int[][] arr = new int[n][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                for (int k=0; k<arr.length; k++){
                    arr[i][j] += a1[i][k] * a2[k][j];
                }
                System.out.print(arr[i][j] + " ");
            } System.out.println("");
        }
        
    }
}

  