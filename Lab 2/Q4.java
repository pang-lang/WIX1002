import java.util.Scanner;
 
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600)/60;
        int seconds = totalSeconds % 60;
        
        System.out.println(totalSeconds + " seconds is " + hours + " hours " + minutes + " minutes and " + seconds + " seconds. ");
        

    }
}  

