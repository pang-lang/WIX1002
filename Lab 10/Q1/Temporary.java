
package Q1;

public class Temporary extends EmployeeSalary{
    private double hour;
    private double rate = 15;

    public Temporary(String name, double hour){
        super(name," Temporary");
        this.hour = hour;
    }
    
    @Override
    double setSalary(){
        return hour * rate;
    }
    
//    @Override
//    public String toString(){
//        return "The salary for temporary staff is " + setSalary();
    }
    
