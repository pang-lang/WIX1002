public class L4Q6 {
    public static void main(String[] args) {
        ///6. Write a program that generates a non-negative random integer. Display the number of digits in the integer.
        int num = (int)(Math.random()*10000);
        System.out.println("Random number generated: " + num);
        
        int count = 0;
        while(num !=0){
            num /= 10;
            count++;
        }
        System.out.println("There are " + count + " number of digits. ");
        
        
        //int digit1 = (num%10);
        //int digit2 = ((num/10)%10);
        //int digit3 = ((num/100)%10);
        //int digit4 = ((num/1000)%10);
            
            
        
              
    }
    
}
