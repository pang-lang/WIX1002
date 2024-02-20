package viva2;
import java.util.Arrays;
import java.util.Scanner;
public class V2Q2 {
    public static void main(String[] args) {
        //Can you provide a Java method that receives 2 double arrays as input and returns a double value as output to help her solve this problem? 
        
        // first response
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array 1: ");
            int n1 = sc.nextInt();
            double[] array1 = new double[n1];
            System.out.print("Enter the elements of the array: ");
            for(int i=0;i<n1; i++){
                array1[i] = sc.nextDouble();}
            System.out.print("The element in array 1 are: ");
            for(int i=0;i<n1; i++){
                System.out.print(array1[i] + " " );    
        }   System.out.println("");
        
        // second response
            System.out.print("\nEnter the size of array 2: ");
            int n2 = sc.nextInt();
            double[] array2 = new double[n2];
            System.out.print("Enter the elements of the array: ");
            for(int i=0;i<n2; i++){
                array2[i] = sc.nextDouble();}
            System.out.print("The element in array 2 are: ");
            for(int i=0;i<n2; i++){
                System.out.print(array2[i] + " " );
        }   
            System.out.println("");
            
            System.out.printf("The median: %.3f", findMedian(array1, array2));
            //System.out.printf("The interquartile range: %.3f", (double)(findInterquartile(array1, array2)));
    }
        
        public static double findMedian(double[] a, double[] b){
            //merge array
            int n3 = a.length+b.length;
            double[] merge = new double [n3];
            for (int i=0; i<a.length; i++){
                merge[i] = a[i];
            } for (int i=0; i<b.length; i++){
                merge[a.length + i]= b[i];
            }
            System.out.println("\nThe merge array: ");
            for (int i=0; i<n3; i++){
                System.out.print(merge[i] + " ");   
            }
            System.out.println("");
            
            //bubblessort
            for (int pass=0; pass<=merge.length; pass++){
                for(int i=0; i<merge.length-1; i++)
                    if (merge[i]>merge[i+1]){
                        double hold = merge[i];
                        merge[i] = merge[i+1];
                        merge[i+1] = hold;
                    }
            }
                
            System.out.println("\nThe sorted array: ");
            for (double value : merge){
                System.out.print(value + " ");
            }
            System.out.println("");
            
            if (n3%2 == 0){
            //even array
                int position = merge.length/2;
                return ((merge[position] + merge[position-1])/2); 
            }   
            else {
            //odd array
                return (merge[merge.length/2]);
            }
            
        }
}
        


/*        
        public static double findInterquartile(double[] a, double[] b){
            //merge array
            int n3 = a.length+b.length;
            double[] merge = new double [n3];
            for (int i=0; i<a.length; i++){
                merge[i] = a[i];
            } for (int i=0; i<b.length; i++){
                merge[a.length + i]= b[i];
            }
            System.out.println("\nThe merge array: ");
            for (int i=0; i<n3; i++){
                System.out.print(merge[i] + " ");   
            }
            System.out.println("");
            
            //bubblessort
            for (int pass=0; pass<=merge.length; pass++){
                for(int i=0; i<merge.length-1; i++)
                    if (merge[i]>merge[i+1]){
                        double hold = merge[i];
                        merge[i] = merge[i+1];
                        merge[i+1] = hold;
                    }
            }
                
            System.out.println("\nThe sorted array: ");
            for (double value : merge){
                System.out.print(value + " ");
            }
            System.out.println("");
            
            if (n3%2 == 0){
            //even array
                int q1 = n3/4;
                int q2 = (3*(n3))/4;
                return (merge[q2] - merge[q1]); 
            }   
            else {
            //odd array
                int q1 = n3/4;
                int q2 = (3*(n3))/4;
                return (((merge[q2]+merge[q2+1])/ 2) - ((merge[q1]+merge[q1-1])/2)); 
            }  
    }

        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
*/