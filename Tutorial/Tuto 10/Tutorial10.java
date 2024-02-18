
package tutorial10;

import java.util.Arrays;

public class Tutorial10 {

    public static void main(String[] args) {
        //T1Q1();
        //T1Q2();
        T1Q3();
    }
        
    static void T1Q1(){ 
        // we cannot have discount policy as our object (abstract class)
        DiscountPolicy b = new BulkDiscount(5,0.4);
        System.out.println(b.computeDiscount(6, 10));
        
        DiscountPolicy o = new OtherDiscount();
        System.out.println(o.computeDiscount(8,4));
        
        combineDiscount c = new combineDiscount(b,o);
        System.out.println(c.computeDiscount(10,5));
    }
    
    static void T1Q2(){
        SavingAccount a = new SavingAccount(12000);
        System.out.printf("%.2f", a.computeInterest());
        
        FixedAccount b = new FixedAccount(1000);       
        System.out.printf("\n%.2f",b.computeInterest());    
    }
    
    static void T1Q3(){
//        Person[] person = {
//            new Person ("Alice"), new Person ("Lily"),new Person ("Jane"),
//               new Person ("Adam"),new Person ("Charlotte")
//        };
//        Arrays.sort(person);
//        for (Person p : person){
//            System.out.print(p + " ");
//        }
        
        Person[] p = new Person[5];
        p[0] = new Person("Danny");
        p[1] = new Person("Nick");
        p[2] = new Person("Bob");
        p[3] = new Person("Alan");
        p[4] = new Person("Peter");
        
        Person t;
        for (int pass=1; pass<p.length; pass++){
            for (int i=0; i<p.length-1; i++){
                //use .compareTo instead of </> as there are object
                if (p[i].compareTo(p[i+1]) > 0){
                    t = p[i];
                    p[i] = p[i+1];
                    p[i+1] = t;
                }
            }
        }
        
        for (Person ps:p){
            System.out.println(ps.getName());
        }
    }
}
        

