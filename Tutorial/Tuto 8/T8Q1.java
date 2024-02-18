//name of the .java file must be same as the name of the public class
//online one public class is allowed in one .java file
package tutorial8;
public class T8Q1 {
    public static void main(String[] args) {
        //g. Create an object of the class Student.
        Student s = new Student("012-345678");
        s.display();
        
        //h. Change the contact number using the mutator method.
        s.setContact("014-235649");
        s.display();
        
        //j. Create an object of the class Animal that used to represent a cat.
        Animal obj = new Animal();
        //Animal obj = new Animal("Cat");
        
        
        //k. Create an object of the class Number with the value 20 and 40.
        //Number obj = new Number(20,40);
        
    }
}
        //a. Define a class Student.
    class Student{
            //b. Declare the instance variable that used to store contact number.
            private String contact;
        
        //constructor is the name of the method and same name as class
        //c. Create the constructor that initializes the contact number to null. (default constructor - without variable)
        public Student(){
            contact = "";
        }
        
        //d. Create another constructor that assign the parameter value to the contact number.
        public Student(String a){
            contact = a;
            //this.contact(contact in student class) = contact(on parameter)
        }
        
        //e. Create an accessor and mutator method for the contact number.
        //accessor is getter (read); mutator is setter (set)
        public String getContact(){
            return contact;
        }
        public void setContact(String c){
            this.contact = c;
        }
        
        //f. Create a method that used to display the contact number.
        public void display(){
            System.out.println("The contact number is " + this.contact);
        }
        }
        
        class Animal{
        }
      
        
        //k. Create an object of the class Number with the value 20 and 40.
        class Number{
        }
            
        
        
        
        
        
        
        
    

