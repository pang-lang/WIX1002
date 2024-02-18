
package tutorial10;

import java.util.Arrays;
//comparable interface is a interface with a "compareTo method
//a.compareTo(b) : a>b return +ve; a<b return -ve; a=b return 0
//after you implement the interface, you need to implement all the methods in the interface

public class Person implements Comparable <Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    //compareTo return an int and not String
    public int compareTo(Person p){
        return (name.compareTo(((Person)p).getName()));
        //cast p into person and run accessor method then compare
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
}
    
    
