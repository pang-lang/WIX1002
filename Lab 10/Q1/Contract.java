
package Q1;

public class Contract extends EmployeeSalary{
    private int income = 500;
    private double totalSales;

    public Contract(String name, double totalSales) {
        super(name," Contract");
        this.totalSales = totalSales;
    }
    
    @Override
    double setSalary(){
        return income + totalSales * 0.5;
    }
    
//    public String toString(){
//        return "The salary for contract staff is " + setSalary();    
//    }
}

