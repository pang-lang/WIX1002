
public class T4Q3 {
    public static void main(String[] args) {
        //3. Write the statements that display the first ten values of the Fibonacci sequence. 
        //Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
        //fibonnaci is sum of the previoius two term
        int n1 = 0, n2 = 1;
        int n3;
        for (int i=1; i<=10; i++){
            System.out.print(n1 + ", " );
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }        
    }
}
