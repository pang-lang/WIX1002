
package pyq191;

import java.util.ArrayList;
import java.util.Scanner;

//TTATGTTTTAAGGATGGGGCGTTAGTT
//GGTATGATGGGTTGA
//ATGTGA
//ATGTTTGTAA
//TGGATGTATATA

public class Q3 {
    public static void main(String[] args) {
        
        do{
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter a genome string [quit to stop]: ");
            String genome = sc.nextLine();
  
            if (genome.equals("quit"))
                break;
            
            ArrayList<String> result = new ArrayList<>();
            int i=0, start = 0, end = 0;
            boolean started = false;
            
            //ensures that there are at least three characters remaining in the string
            while (i < genome.length()-2){
                
                //start codon
                if (genome.substring(i, i+3).equals("ATG")){
                    started = true;
                    start = i+3;
                    i += 2;
                }
                //end codon
                if (started && genome.substring(i, i+3).equals("TAA") || 
                    genome.substring(i, i+3).equals("TAG") || 
                    genome.substring(i, i+3).equals("TGA")){
                    end = i;
                    i += 2;
                    
                    //extract gene
                    String extract = genome.substring(start,end);
                    if (extract.length() > 0 && extract.length() % 3 == 0){
                        result.add(extract);
                    }
                }
                i++;
            }
            
            if (result.size() > 0){
                result.forEach(gene -> System.out.println(gene));
            } else {
                System.out.println("No gene is found.");  
            }
            
        } while (true);
    }
}


/*
        Scanner sc = new Scanner(System.in); 
        String genome;
        
        do {
            System.out.print("Enter a genome string [quit to stop]: ");
            genome = sc.nextLine();
            
            String[] g = genome.split("ATG");
            //no of substring in g that does not meet the condition
            int count = 0;
            
            for (int i=0; i<g.length; i++){
                if(g[i].contains("TAG")){
                    String TAG = g[i].substring(0, g[i].indexOf("TAG"));
                    //no genetic sequence in between ATG and TAG
                    if (TAG.length() == 0)
                        count++;
                    //has a valid gene sequence
                    else if (TAG.length() % 3 ==0){
                        System.out.println(TAG);
                    //substring not empty but does not does not satisfy the length
                    } else {
                        count++;
                    }
                    
                } else if(g[i].contains("TAA")){
                    String TAA = g[i].substring(0, g[i].indexOf("TAA"));
                    if (TAA.length() == 0)
                           count++;
                    else if (TAA.length() % 3 ==0){
                        System.out.println(TAA);
                    } else {
                        count++;
                    }
                    
                } else if (g[i].contains("TGA")){
                    String TGA = g[i].substring(0, g[i].indexOf("TGA"));
                    if (TGA.length() == 0){
                        count++;
                    } else if (TGA.length() % 3 == 0){
                        System.out.println(TGA);
                    } else {
                        count++;
                    }
                }
                else {
                    count++;
                }
            }
            
            if (count == g.length){
                System.out.println("No gene is found.");
            }
        } while (!genome.equals("quit"));
    }
}
*/


            
