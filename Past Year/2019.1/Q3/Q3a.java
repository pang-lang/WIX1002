
package pyq191;

import java.util.Scanner;

public class Q3a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter genome string [quit to stop] : ");
            String s = sc.nextLine();
            if (s.equals("quit")) 
                break;
            if (!s.contains("ATG") || (!s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA"))){
                System.out.println("No gene is found.");
                continue;
            }
            boolean hasGene = false;
            int start = s.indexOf("ATG");
            int n = s.length();
            //start and stop codon
            while(start < n - 6 && start != -1){
                String res = "";
                for(int i=start+3; i<=n-3; i+=3){
                    if (matchedEnding(s.substring(i,i+3)) && qualified(res)){
                        System.out.println(res);
                        hasGene = true;
                        break;
                        //If the current triplet is "ATG," it means that a new potential start codon has been found before a valid stop codon, 
                        //so the loop breaks, and the search for a gene starting from the new potential start codon begins.
                    } else if (s.substring(i, i+3).equals("ATG")){
                        break;
                        //checks if the current triplet is a valid stop codon ("TAG," "TAA," or "TGA").
                        //If the current triplet is not a stop codon, it is appended to the res variable.
                    } else res += s.substring(i,i+3);
                }
                //start + 3 = starting inde of the next ATG
                start = s.indexOf("ATG", start+3);
            }
            if (!hasGene) 
                System.out.println("No gene is found.");
        }
    }
    public static boolean matchedEnding(String s){
        return s.equals("TAG") || s.equals("TAA") || s.equals("TGA");
    }
    public static boolean qualified(String s){
        return s.length() >= 3 && s.length() % 3 == 0 && !s.contains("ATG") && !s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA");
    }
}
    

        /* 
stdin:
TTATGTTTTAAGGATGGGGCGTTAGTT
GGTATGATGGGTTGA
ATGTGA
ATGTTTGTAA
TGGATGTATATA
quit

stdout:
TTT
GGGCGT
GGT
No gene.
No gene.
No gene.

*/
