package lab6;
public class L6Q3 {
    public static void main(String[] args) {
    //3. Write a Java method that accepts an array of 10 integers. 
    //The method should reverse the integer in the array. Example, if the number is 1234, the number will change to 4321.
        int [] array = {1234, 5678, 9101, 12345, 678910, 3456, 5786, 8795, 5647, 4536};
        System.out.println("The original number: " );
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");        
    } 
        System.out.println("");
    
        System.out.println("The reversed number: ");
        getReverse(array);
    }
    public static void getReverse(int[] numbers){
        // array index
        for (int i=0; i<numbers.length; i++){
            int num = numbers[i];
            int reverse = 0; 
            
            while (num != 0){
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            } 
            System.out.print(reverse + " "); 
        }
    } 
}
    
/*
        int[] arr = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        reversedNumber(arr);
        System.out.println("\nReversed integer : ");
        for (int i = 0; i<10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reversedNumber(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int num = arr[i];
            int reversedNum = 0;
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
            arr[i] = reversedNum;
        }
    }
}
*/

