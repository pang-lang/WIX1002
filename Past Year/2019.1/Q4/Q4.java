
package pyq191;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, 
                n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;
        
        String[] sentence = null;
        String[] words = null;
        
        try {
            Scanner input = new Scanner(new FileInputStream("MyAmbition.txt"));
            System.out.println("The essay is: ");
            
            while(input.hasNextLine()){ 
                String temp = input.nextLine();
                System.out.println(temp);
                
                sentence = temp.split("\\. ");
                words = temp.split(" ");
                int count = 0;
                while (count < temp.length()){
                    char character = temp.charAt(count);
                        switch(character){
                            case 'a': a++; break;
                            case 'b': b++; break;
                            case 'c': c++; break;
                            case 'd': d++; break;
                            case 'e': e++; break;
                            case 'f': f++; break;
                            case 'g': g++; break;
                            case 'h': h++; break;
                            case 'i': i++; break;
                            case 'j': j++; break;
                            case 'k': k++; break;
                            case 'l': l++; break;
                            case 'm': m++; break;
                            case 'n': n++; break;
                            case 'o': o++; break;
                            case 'p': p++; break;
                            case 'q': q++; break;
                            case 'r': r++; break;
                            case 's': s++; break;
                            case 't': t++; break;
                            case 'u': u++; break;
                            case 'v': v++; break;
                            case 'w': w++; break;
                            case 'x': x++; break;
                            case 'y': y++; break;
                            case 'z': z++; break;
                        }
                        count++;
                    }
            }

                System.out.println("Number of sentences: " + sentence.length);
                

                System.out.println("Number of words: " + words.length);
                System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d + " E: " + e + " F: " + f + " G: " + g + " H: " + h + 
                        "\nI: " + i + " J: " + j + " K: " + k + " L: " + l + " M: " + m + " N: " + n + " O: " + o + "\nP: " + p + 
                        " Q: " + q + " R: " + r + " S: " + s + " T: " + t + " U: " + u + " V: " + v + " W: " + w + 
                        "\nX: " + x + " Y: " + y + " Z: " + z);
            
            input.close();
        } catch(IOException ex){
            System.out.println("Problem with input file.");
        }
    }
    
}