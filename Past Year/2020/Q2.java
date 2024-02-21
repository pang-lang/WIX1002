
package pyq201;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter location 1");
        double lat1 = input();
        double long1 = input();
        
        System.out.println("Enter location 2");
        double lat2 = input();
        double long2 = input();
        
        System.out.printf("Location 1: %.6f Latitude %.6f Longitude", lat1, long1);
        System.out.printf("\nLocation 2: %.6f Latitude %.6f Longitude", lat2, long2);
        
        System.out.printf("\nDistance: %.2f KM" , distance(lat1, lat2, long1, long2));
    }
    
    public static double input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Diection: [N, S, E, W]: ");
        char direction = sc.next().charAt(0);
        System.out.print("Enter degree, Minute and Second: ");
        int degree = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        return conversion(direction, degree, minute, second);
    } 
    
    public static double conversion(char di, int d, int m, int s){
        double degree;
        if (di == 'N' || di == 'E'){
            return (d + (m * 60.0 + s)/3600.0); 
        } else if (di == 'S' || di == 'W'){
            return (-1.0 * d + (m * 60.0 + s)/3600.0); 
    }
        return 0;
    }

    public static double distance(double lat1, double lat2, double long1, double long2){

        double a = Math.pow(Math.sin(Math.toRadians(lat1-lat2)/2), 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) 
                * Math.pow(Math.sin(Math.toRadians(long1-long2)/2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = 6371*c;
        return d;
    }
    
}
