
package pyq23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OceanData {
    public static void main(String[] args) {
        String inputFile = "ocean_data.csv";
        DataBuoy [] data = new DataBuoy[25];
        float avg_water_temp;
        loadData(inputFile, data);
        showData(data);
        avg_water_temp = (float) calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);
        printMap(data, avg_water_temp); 
    } 
    
    public static void loadData(String file, DataBuoy[] data){
        String[] temp;
        try {
            Scanner input = new Scanner(new FileInputStream(file));
            DataBuoy b;
            for (int i=0; i<data.length && input.hasNextLine(); i++){
                temp = input.nextLine().split(",");
               data[i] = new DataBuoy (temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), 
                Double.parseDouble(temp[3]), Double.parseDouble(temp[4]));    
            }
            input.close();
        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
    }
    
    public static void showData(DataBuoy[] data){
        System.out.println("Data read from buoy: ");
        System.out.printf("%-12s%5s%5s%10s%10s","buoy_id", "lat", "long", "air_t", "water_t");
        for(DataBuoy d : data){
            System.out.printf("\n%-12s%5d%5d%10.2f%10.2f",d.getId(),d.getLatitude(),d.getLongitude(),d.getAir_temperature(),d.getWater_temperature());
        }
    }
    
    public static float calculateAvgWaterTemp(DataBuoy[] data){
        float sum = 0; 
        for (DataBuoy d : data){
            sum += d.getWater_temperature();
        }
        float average = sum / 25;
            return Float.parseFloat(String.format("%.3f", average));
    }
    
    public static void printMap(DataBuoy[] data, double avg){
        System.out.println("Heat Map of water temperature");
        char[][] map = new char[21][21];
        for (int j=0; j<21; j++){
                for (int k=0; k<21; k++){
                   map[j][k]='~';
                } 
            }
            map[10][10]='N';
            
            for (int i=0; i<25; i++){
                if(data[i].getWater_temperature() > avg){
                    map[data[i].getLatitude() + 10][data[i].getLongitude() + 10] = 'H';
                } else if(data[i].getWater_temperature() < avg){
                    map[data[i].getLatitude() + 10][data[i].getLongitude() + 10] = 'C';
                } else if(data[i].getWater_temperature() == avg){
                    map[data[i].getLatitude() + 10][data[i].getLongitude() + 10] = 'A';
                }
            }
         
            for (int j=20; j>=0; j--){
                for (int k=0; k<21; k++){
                    System.out.print(map[j][k]);
                } 
            System.out.println();
        }
        
    }
    
}
