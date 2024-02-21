
package pyq172;

public class PermanentStaff extends Staff {
    protected String grade;

    public PermanentStaff(String name, String ic, String grade) {
        super(name, ic);
        this.grade = grade;
    }
    
    public static int getSalary(String g){
        //swich with return no need to use break
        switch(g){
            case "EM01": return 7000;
            case "EM02" : return 5000;
            case "EM03" : return 3000;
            case "EM04" : return 1000;
        }   
        return 0;
    }
  
    @Override
    public String toString(){
        return super.toString() + "\nGrade: " + grade + "\nSalary: RM" + getSalary(grade);
        //return "Full name : " + name + "\nIC : " + ic + "\nGrade: " + grade + "\nSalary: RM" + getSalary(grade);
    }
    
    
    
    
    
    
}
