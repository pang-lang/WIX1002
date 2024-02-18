package lab5;
public class L5Q2 {
    public static void main(String[] args) {
        // Write a program that generates 10 non-duplicate random integers eithin the range from 0 to 20.
        boolean[] range = new boolean[21];
        int count = 0;
        while(count<10){
            int randNum = (int)(Math.random()*21);
            //check if the boolean array at the index corresponding to the generated random number is true
            //If it is, it means the number has already been generated
            //This skips the rest of the loop body and starts the next iteration of the loop
            if (range[randNum])
                continue;
            range[randNum] = true;
            //If random number has not been generated, the corresponding element in the array is true.
            count++;
        }
        for (int i = 0; i<21; i++){
            if (range[i])
                System.out.print(i + " ");
        }
        
    }
}

/*
        Random g = new Random();
        int[] num = new int[10];
        boolean duplicate;
        
        for(int i=0; i<num.length; i++){
            do {
                num[i] = g.nextInt(21);
                duplicate = false;
                for(int j=0; j<i; j++){
                    if (num[i] == num[j]) {
                        duplicate = true;
                        break; 
                    }
                }
            } while(duplicate);            
        }
        for (int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        } 
    }
}

*/
        
/*
        for(int i=0, i<num.length; i++){
            num[i] = g.nextInt(21);
            for(int j=0; j<i; j++){
                if (num[i] == num[j]){
                    //decrement the value of i by 1 when a duplicate is found in the inner loop
                    i--;
                    break;
                }
            }
        }
*/


