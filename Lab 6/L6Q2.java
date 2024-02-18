package lab6;
public class L6Q2 {
    public static void main(String[] args) {
        //2. Write a Java method multiPrint(int n, char c) that prints n copies of character c. 
        //Then, write a Java program to use the method to display the triangles and diamonds.
        printTriangles(6, '*');
        System.out.println(" ");
        printDiamonds(6, '*');
    }
    
    public static void printTriangles(int n, char c){
        int space = n - 1; 
        // loop for no of rows 
        for (int i = 0; i < n; i++) { 
            // loop for space,  
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
            // loop for char 
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " "); 
            }
            System.out.println("");
            space--; 
        }
    }

    public static void printDiamonds(int n, char c){
        int space = n - 1;
        //loop for no of rows
        for (int i = 0; i < n; i++){
            //loop for printing the leading space
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++){
                System.out.print(c + " ");
            }
            System.out.println("");
            space--;
            }
        //loop lower part rows
        
        for (int i = n-1; i > 0; i--){
            System.out.print(" ");
            for (int j = 1; j < n-i; j++)
                System.out.print(" ");
            for (int j = 0 ; j < i; j++)
                System.out.print(c + " ");       
            System.out.println("");
            space++;
        }
    } 
}
    
//    public static void main(String[] args) {
//        int height = 6;
//        for (int i = 1, j = height-1; i < 2*height; i+=2, j--) {
//            multiPrint(j, ' ');
//            multiPrint(i,'*');
//            System.out.println("");
//        }
//        System.out.println("");
//        for (int i = 1, j = height-1; i < 2*height; i+=2, j--) {
//            multiPrint(j, ' ');
//            multiPrint(i,'*');
//            System.out.println("");
//        }
//        for (int i = 2*height - 3, j = 1; i > 0; i-=2, j++) {
//            multiPrint(j, ' ');
//            multiPrint(i,'*');
//            System.out.println("");
//        }
//    }
//    public static void multiPrint(int n, char c){
//        for (int i = 0; i < n; i++)
//            System.out.print(c);
//    }

  
