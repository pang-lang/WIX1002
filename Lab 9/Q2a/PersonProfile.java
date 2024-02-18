package Q2a;

//class has a name, gender and date of birth
public class PersonProfile {
    private String name;
    private char gender;
    private String date;
    
    public PersonProfile(){
        name = null;
        gender = '0';
        date = null;  
    }
    
    public PersonProfile(String name, char gender, String date){
        this.name = name;
        this.gender = gender;
        this.date = date;
    }
    
    public void display(){
        System.out.println("Name\t\t: " + name);
        System.out.println("Gender\t\t: " + gender);
        System.out.println("Date of Birth\t: " + date);
    }    
}

    
    
    

