
package Q2;
public class Q2c {
    public static void main(String[] args) {
        Playable[] instruments = new Playable[2];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        for (Playable instruement : instruments){
            instruement.play();
        }
        
    }
    
}
