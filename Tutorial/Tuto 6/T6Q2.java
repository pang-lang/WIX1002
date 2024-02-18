package tutorial6;
public class T6Q2 {
    public static void main(String[] args) {
        //2. Write a program that consists of a method that can display three numbers in decreasing order.
        int a=3, b=4, c=5;
        System.out.println("The numbers in descending order: ");
        int[] num = {a,b,c};
        bubbleSort(num);
        for (int value : num) {
            System.out.print(value + " ");
        }
    }
        public static void bubbleSort (int[] num){
        for (int pass=0; pass<=num.length; pass++){
            for(int i=0; i<num.length-1; i++)
                if (num[i]<num[i+1]){
                    int hold = num[i];
                    num[i] = num[i+1];
                    num[i+1] = hold;
                } 
            }
        }
}

    
    

