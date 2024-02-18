package Q2;


public class PersonProfile {
    protected String name;
    protected char gender;
    protected String dob;

    public PersonProfile(String name, char gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of birth: " + dob);
    }
    
}
