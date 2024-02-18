package lab5;
public class L5Q4 {
    public static void main(String[] args) {
    //4. Write a program that rotates 90 degrees clockwise a 3 by 3 matrix   
    System.out.println("3 by 3 Matrix: ");
    int [][] array = {{1,5,7},{3,6,9},{5,3,8}};
    //rows
        for (int i = 0; i < array.length; i++) {
            //columns
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                }
            System.out.println();
            }
        
        
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < array.length; i++){
            for (int j = 2; j >= 0; j--){
                System.out.print(array[j][i] + " ");
            }
        System.out.println();
        }
        
//-------------

        System.out.println("Transposition of Matrix");
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                System.out.print(array[j][i] + " ");
            } System.out.println("");
        }
        

        System.out.println("After rotates 180 degrees clockwise");
        for (int i=2; i>=0; i--){
            for (int j=2; j>=0; j--){
                System.out.print(array[i][j] + " ");
            } System.out.println("");
        }
        

        System.out.println("4 x 4 matrix");
        int[][] arr = {{1,5,7,4}, {3,6,9,1}, {5,3,8,2}};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            } System.out.println("");
        }
    }
}

