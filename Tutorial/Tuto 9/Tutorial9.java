
package tutorial9;
public class Tutorial9 {
    public static void main(String[] args) {
        //a. Write a static method compare that return true if two objects parameter
        //(Student s, Teacher t) are belongs to the same class. Otherwise return false. 
        
        Student student = new Student();
        Teacher teacher = new Teacher();
        boolean result1 = compareClass(student, teacher);
        boolean result2 = isClass(student);
        System.out.println("Both classes are equals : " + result1);
        System.out.println("The object parameter (Students) belong to descendent class of Person : " + result2);
        
    }
    
        public static class Person{}
        static class Student extends Person{}
        static class Teacher{}

        public static boolean compareClass(Student s, Teacher t){
            if (s.getClass().equals(t.getClass()) ) {
                return true;
            } else {
                return false;
        }  
        /*
        public static boolean compare(Object a, Object b){
            return (a.getClass() == b.getClass());
        }
        */
        }
        
        //b. Write a static method isClass that return true if the object parameter (Students) 
        //is belong to any descendent class of Person. Otherwise return false.
        
        public static boolean isClass(Student s){
            if (s instanceof Person) {
                return true;
            } else {
                return false;
            }
        }
        /*
        public static boolean isClass(Object a){
            return (a instanceOf Person);
        } 
        to check whether object a belongs to the class person
        */
        
}
    

