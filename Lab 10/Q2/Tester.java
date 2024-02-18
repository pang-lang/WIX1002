
package Q2;

public class Tester {
    public static void main(String[] args) {
        SubstituitionCipher a = new SubstituitionCipher("data.txt", "cipher.txt", 6);
        a.encoding();
        SubstituitionCipher b = new SubstituitionCipher("cipher.txt", "newplain.txt", 6);
        b.decoding();
        
        ShuffleCipher c = new ShuffleCipher("data.txt", "cipher2.txt", 2);
        ShuffleCipher d = new ShuffleCipher("cipher2.txt", "newplain2.txt", 2);
        c.encoding();
        d.decoding();
    }
    
}
