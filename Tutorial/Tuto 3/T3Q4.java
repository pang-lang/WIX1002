public class T3Q4 {
    public static void main(String[] args) {
        //4. Write the java statements that used the if statement to find the biggest number among three given integers.
        //int randNum1 = (int)(Math.random()*100);
        //int randNum2 = (int)(Math.random()*100);
        //int randNum3 = (int)(Math.random()*100);
        //no need to generate random number, just self declare
        int num1 = 34;
        int num2 = 56;
        int num3 = 78;
        System.out.println("Three random numbers generated : " + num1 + " , " + num2 + " , " + num3);
        if (num1>num2 && num1>num3)
            System.out.println(num1 + " is the largest number");
        else if (num2>num1 && num2>num3)
            System.out.println(num2 + " is the largest number");
        else if (num3>num1 && num3>num2)
            System.out.println(num3 + " is the largest number");
        else if (num1 == num2 && num1 > num3)
            System.out.print(num1 + " is the largest number.");
        else if (num1 == num3 && num1 > num2)
            System.out.print(num1 + " is the largest number.");
        else if (num2==num3 && num2>num1)
            System.out.println(num2 + "is the largest number.");
        else 
            System.out.println("The numbers are euqal.");
        
    }
}
   
