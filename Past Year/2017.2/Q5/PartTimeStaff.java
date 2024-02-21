
package pyq172;

public class PartTimeStaff extends Staff{
    protected int hours;

    public PartTimeStaff(String name, String ic, int hours) {
        super(name, ic);
        this.hours = hours;
    }
    
    public int getSalary(int h){
        return hours*40;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nSalary : RM" + getSalary(hours);
        //return "Full name : " + name + "\nIC : " + ic + "\nSalary : RM" + getSalary(hours);
    }  
}
