
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        
        String[] name = readNodeName();
        String[] cpuT = readCPUTot();
        String[] cpuA = readCPUAlloc();
        String[] realMem = readRealM();
        String[] allocMem = readAllocM();
        String[] partition = readPartition();
        
        System.out.println("+-------------------------------------------------------------+");
        System.out.printf("| %-10s%8s%10s%15s%14s |\n","Node","Partitions","CPU","MEMORY","RATIO");
        System.out.println("+-------------------------------------------------------------+");
        
        for (int i=0; i<name.length; i++){
            StringBuilder cpu = new StringBuilder();
            cpu.append(Integer.parseInt(cpuT[i]) - Integer.parseInt(cpuA[i]));
            cpu.append("/");
            cpu.append(cpuT[i]);
            
            StringBuilder memory = new StringBuilder();
            memory.append((Integer.parseInt(realMem[i]) - Integer.parseInt(allocMem[i])) / 1000);
            memory.append("G");
            memory.append("/");
            memory.append(Integer.parseInt(realMem[i])/1000);
            memory.append("G");
            
            double ratio = calcRatio(Integer.parseInt(cpuT[i]),Integer.parseInt(cpuA[i]),Integer.parseInt(allocMem[i]),Integer.parseInt(realMem[i]));
            
            System.out.printf("| %-10s%-14s%7s%15s%13.3f |\n", name[i],partition[i],cpu.toString(),memory.toString(),ratio);
        }
        System.out.println("+-------------------------------------------------------------+");
        
        
//        for (String name1 : partition) {
//            System.out.println(name1);
//        }
//        try {
//            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
//            String line = in.nextLine();
//            if (line.contains("NodeName")){  
//            }
//        } catch(FileNotFoundException e){
//            System.out.println("File not found");
//        } catch(IOException e){
//            System.out.println("Problem with file output");
//        }
        
    }
    
    public static double calcRatio(int totalCPU,int CPUalloc, int allocRAM, int totalRAM){
        double ratio = ((double)(totalCPU-CPUalloc)/totalCPU) - ((double)(totalRAM-allocRAM)/totalRAM);
        if (ratio < 0){
            ratio=-ratio;
        }
        return ratio;
        
    }
    
    public static String[] readNodeName(){
        String[] name=new String[13];
        try {
            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
            int i = 0;
            while (in.hasNextLine()){
                String line = in.nextLine();
                if (line.contains("NodeName")){
                    String[] a = line.split(" A");
                    name[i] = a[0].replaceAll("NodeName=", "");
                    i++;
                } 
            }
            
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
        return name;
    }
    
    public static String [] readCPUTot(){
        String[] cpuT = new String[13];
        try {
            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
            int i = 0;
            while (in.hasNextLine()){
                String line = in.nextLine();
                if (line.contains("CPUTot")){
                    String[]a=line.split(" ");
                    cpuT[i]=a[4].replaceAll("CPUTot=", "");
                    i++;
                } 
            }
            
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Problem with file output");
        }
        return cpuT;
    }
    
    public static String [] readCPUAlloc(){
        String[] cpuA = new String[13];
        try {
            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
            int i = 0;
            while (in.hasNextLine()){
                String line = in.nextLine();
                if (line.contains("CPUAlloc")){
                    String[] a = line.split(" ");
                    cpuA[i] = a[3].replaceAll("CPUAlloc=", "");
                    i++;
                } 
            }
            
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
        return cpuA;
    }
    
    public static String[] readRealM(){
        String[] mem = new String[13];
        try {
            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
            int i = 0;
            while (in.hasNextLine()){
                String line = in.nextLine();
                if (line.contains("RealMem")){
                    String[] a = line.split(" ");
                    mem[i] = a[3].replaceAll("RealMemory=", "");
                    i++;
                } 
            }
            
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
        return mem;
    }
    
    
     public static String[]readAllocM(){
        String[] mem = new String[13];
        try {
            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
            int i = 0;
            while (in.hasNextLine()){
                String line = in.nextLine();
                if (line.contains("AllocMem")){
                    String[] a = line.split(" ");
                    mem[i] = a[4].replaceAll("AllocMem=", "");
                    i++;
                } 
            }    
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
        return mem;
    }
     
    public static String[]readPartition(){
        String[] par = new String[13];
        try {
            Scanner in = new Scanner(new FileInputStream("nodelist.txt"));
            int i=0;
            while (in.hasNextLine()){
               String line = in.nextLine();
                if (line.contains("Partitions")){
                    String[] a = line.split(" ");
                    par[i] = a[3].replaceAll("Partitions=", "");
                    i++;
                } 
            }
            
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
        return par;
    }
}
