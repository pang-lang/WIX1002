

public class Lab8 {
    public static void main(String[] args) {
        //1. Define a class name Number. The class is used to handle an integer array. 
        //The class Number will display all the item of the array, the even number, 
        //the prime number, the maximum number, the minimum number, the average, the square number. 
        //Create a Tester class to test the program.
        
        Number a = new Number(); 
        Number b = new Number(5);
        Number c = new Number(4, 50);
        System.out.println("Output A");
        a.display();
        System.out.println("\nOutput B");
        b.display();
        System.out.println("\nOutput C");
        c.display();
        }
}
    
    class Number{
        private int[] array;
        private int size;
        private int lastNum;
       
        //default constructor(A)
        public Number(){ 
            size = 10;
            lastNum = 100;
            //initialize array
            array = new int[size];
            
            for (int i=0; i<size; i++){ 
                array[i] = (int)(Math.random()*lastNum);
            }
        }

        //constructor with parameter (B)
        public Number(int size){ 
            this.size = size;
            lastNum = 100;
            array = new int[size];
        
            //initialize array with random numbers
            for (int i=0; i<size; i++){ 
                array[i] = (int)(Math.random()*lastNum);
            } 
        }
        
        //C
        public Number(int size, int lastNum){ 
            this.size = size;
            this.lastNum = lastNum;
            array = new int[size];
        
            //initialize array with random numbers
            for (int i=0; i<size; i++){ 
                array[i] = (int)(Math.random()*lastNum);
            } 
        }
        
        public void displayArray(){
            System.out.print("The array\t: ");
            for (int i=0; i<size; i++){ 
                System.out.print(array[i] + " ");
        }
            System.out.println("");
        }
        
        //even
        public void isEven(){
            System.out.print("Even numbers\t: ");
            for (int i=0; i<size; i++){
                if (array[i]%2==0){
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }
        
        //prime
        public boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        
        public void showPrime() {
            for (int i=0; i< size; i++){
                if (isPrime(array[i])){
                System.out.print(array[i] + " ");
                }
            } 
        } 
        
        //max
        public int isMax(){
            int max = array[0];
            for(int i = 1; i<size; i++){
                if (array[i] > max){
                    max = array[i];
                }
            } return max;
        } 
        
        //min
        public int isMin(){
            int min = array[0];
            for(int i = 1; i<size; i++){
                if ( array[i] < min){
                    min = array[i];
                }
            } return min;
        } 
        
        //average
        public double average(){
            double sum = 0;
            for (int i=0; i<size; i++){
                sum += array[i];
            }
            return sum/size;
        } 
        
        //square number
        public void isSquare(){
            System.out.print("Square numbers\t: ");           
            for (int i=0; i<size; i++){ 
                double sq = Math.sqrt(array[i]);
                if ((sq - Math.floor(sq)) == 0){
                System.out.print(array[i] + " ");
            }
        } System.out.println("");
        }
        
        public void display(){
            displayArray();
            isEven();
            isSquare();
            System.out.print("Prime numbers\t: " );
            showPrime();
            System.out.println("");
            System.out.println("Max number\t: " + isMax());
            System.out.println("Min number\t: " + isMin());
            System.out.println("Average\t: " + average());
            
        }
    }
          
    


