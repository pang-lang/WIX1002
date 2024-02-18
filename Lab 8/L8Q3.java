

import java.util.Scanner;


public class L8Q3 {
    public static void main(String[] args) {
        //3. Define a class name WeightCalculator. The class has an input method that accepts the user’s age and height. 
        //Besides, the class consists a method that calculating the recommend weight with this formula
        //recommend weight = (height – 100 + age / 10) * 0.9
        //The class will display the user’s age, height and the recommend weight. Create a Tester class to test the program.
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name\t: ");
        String name = sc.nextLine();
        System.out.print("Enter your age\t: ");
        int age = sc.nextInt();
        System.out.print("Enter your height: ");
        double height = sc.nextInt();
        
        WeightCalculator c = new WeightCalculator(name,age,height);
        c.display();
    }
}

        class WeightCalculator{
            private String name;
            private int age;
            private double height;
            private double weight;
            
            //constructor
            WeightCalculator(){
                name = null;
                age = 0;
                height = 0;
                weight = 0;
            }
            
            WeightCalculator(String name, int age, double height){
                //use this when the variable have the same name
                this.name = name;
                this.age = age;
                this.height = height;
                weight = (height - 100 + age / 10) * 0.9;
            }
            
            public void display(){
                System.out.println("Your weight is\t: " + weight);
            
        }
            
    }

