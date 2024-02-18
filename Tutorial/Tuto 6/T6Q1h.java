package tutorial6;

import java.util.Random;

public class T6Q1h {
    public static void main(String[] args) {
        //h. Define a static method that generate random number within 0 – 10. The
        //method will return the first random number that generate twice.
        System.out.println("The random numbers are: ");
        generateTwice();
    }
    public static int generateTwice (){
        int[] array = new int[12];
        int randNum = (int)(Math.random()*11);
        
        System.out.println(randNum);
        
        while(randNum != randNum){
            
      } return randNum;
                
        }
    }
    

//        int r = doubleRandom();
//        System.out.println("The double random number is: " + r);
//    }
//
//    static int doubleRandom() {
//        Random generator = new Random();
//        final int MAX = 10;
//        int[] counts = new int[MAX + 1];
//        while (true) {
//            int temp = generator.nextInt(MAX + 1);
//            counts[temp]++;
//            if (counts[temp] == 2) {
//                return temp;
//            }
//        }
//    }
//}


//        int[] random = new int[10];
//        for (int i = 0; i < 11; i++)
//            random[i] = rand.nextInt(11);
//        int check = twice(random);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random[i] + " ");
//        }
//        System.out.println("");
//        if (check == -1) System.out.println("No duplicate numbers.");
//        else System.out.println(check + " generated twice.");
//    }
//    public static int twice(int[] random){
//        for (int i = 0; i < 10; i++) {
//            for (int j = i+1; j < 10; j++)
//                if (random[i]==random[j]) return random[i];
//        }
//        return -1;
//    }
