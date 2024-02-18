
package Q2a;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Student -----");
        PersonProfile profile1 = new PersonProfile("Ali", 'M', "01/02/2003");
        Student s1 = new Student("Aly", 'F', "05/06/2004");
        profile1.display();
        s1.display();
        
        System.out.println("");
        System.out.println("\nLecturer -----");
        Lecturer lecture1 = new Lecturer("Dr Koh", 'F', "05/12/1980");
        lecture1.display();
        System.out.println("");
    }    
}
