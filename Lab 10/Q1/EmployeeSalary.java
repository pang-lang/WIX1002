
package Q1;

abstract public class EmployeeSalary {
    private String name;
    private String type;

    public EmployeeSalary(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    abstract double setSalary();  
    
    public void showDetails(){
        System.out.println("Employee's name\t: " + name + "\nEmployee's type\t:" + type + "\nThe total salary is " + setSalary());
    }
}


