
package tutorial5;

public class T5Q6 {
    public static void main(String[] args) {
                
        //6. Write the statements that generate 1 random integer within 0 – 255. Convert the number to binary and 
        //store the bit into an 8 bit array. Then, display the binary number.
        
        int randInt = (int)(Math.random()*256);
        System.out.println("Random integer : " + randInt);
        int[] binaryNum = new int [32];
        
        int i = 0;
        while (randInt > 0){
            // extracts the least significant bit (LSB) of the binary representation
            // Store the remainder when dividing randInt by 2 in the binaryNum array at index i.
            binaryNum[i] = randInt % 2;
            //Update randInt by dividing it by 2 to shift to the next bit.
            randInt = randInt / 2;
            //Increment the index for the next binary digit.
            i++; 
        }
        //from the most significant bit to the least significant bit
        for (int j = i-1; j >=0; j--){
            System.out.print("Binary number: " + binaryNum[j]);
        }
            System.out.println(" ");
         

    //decimal to binary conversion
        int rand = (int)(Math.random() * 256);
        System.out.println(rand);
        int rem;
        String hexa = "";
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (rand>0){
            rem = rand %16;
            hexa =  hex[rem] + hexa;
            rand /= 16;
        } 
        System.out.println(hexa);

    }
    
}
