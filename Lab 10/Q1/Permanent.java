
package Q1;

public class Permanent extends EmployeeSalary{
    private char category;

    public Permanent(String name, char category) {
        super(name," Permanent");
        this.category = category;
    }

    @Override
    double setSalary(){
        switch(category){
            case ('A'):
                return 4000;
            case('B'):
                return 3000;
            case('C'):
                return 2000;
        }  
        return 0;
    }
    
//    public String toString(){
//        return "The salary for permanent staff at category " + category + " is " + setSalary();
//    }
    }

