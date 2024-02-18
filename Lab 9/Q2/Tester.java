
package Q2;
public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmad",'M', "04-04-2004", "course.txt");
        s1.getInput();
        s1.display();
        
        System.out.println("");
        Lecturer l1 = new Lecturer("Prof Liew", 'M', "23-01-1985", "lecturer.txt");
        l1.getInput();
        l1.display();
    }
}
