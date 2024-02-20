
package pyq22;

import java.util.Random;


public class Q1 {

    public static void main(String[] args) {
        Random r = new Random();
        double p1 = (double)(r.nextDouble(201)+100);
        double p2 = (double)(r.nextDouble(201)+100);
        double p3 = (double)(r.nextDouble(201)+100);
        System.out.print("3 random price value : ");
        System.out.printf("%.2f %.2f %.2f\n",p1,p2,p3);
        
        System.out.print("5 random even-numbered years : ");
        int c = 0;
        while (c != 5){
            int y1 = (int)(r.nextInt(41)+1990);
            if (y1 % 2 == 0){
                System.out.print(y1 + " ");
                c++;
            } else
                continue;
        }
        
        System.out.print("\nCar Plate Number : ");
        int no = (int)(r.nextInt(90000)+10000);
        char c1 = (char)(r.nextInt(26)+'A');
        char c2 = (char)(r.nextInt(26)+'A');
        System.out.print(no);
        System.out.print(c1);
        System.out.print(c2);
        

        StringBuilder word = new StringBuilder();
         for (int i = 0; i <8; i++) {
            char randomChar = (char) (r.nextInt(26) + 'a'); // 'a' to 'z'
            if (r.nextBoolean()) {
                randomChar = Character.toUpperCase(randomChar); // Uppercase with 50% probability
            }
            word.append(randomChar);
        }
        System.out.print("\nRandom Word: ");
        System.out.print(word.toString() + " \n");


    }
    
}
