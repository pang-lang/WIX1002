
package pyq201;

import java.io.*;
import java.util.Scanner;

public class Q4b {
    public static void main(String[] args) {
        int rec=readRec();
//        System.out.println(rec);
        String[][]record=new String[rec][];
        
        System.out.println("Reading from log file...");
        System.out.println("*****************************************");
        System.out.println("Record read from log file");
        int cnt=0;
        try{
            Scanner in=new Scanner(new FileInputStream("sampleLog.txt"));

            int i=0;
            while(in.hasNextLine()){    
               String line=in.nextLine(); 
               record[i]=line.split(" ");
               i++;
            }
              
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        for(int i=0;i<rec;i++){
            System.out.println("Record "+(i+1));
            for(String a:record[i]){
                System.out.println("\t"+a);
            }
            System.out.println();
        }
        
        System.out.println("total records read: "+rec);
        System.out.println("\n*********************************************");
        System.out.println("Print user submission stat");
        System.out.printf("\nUser%10sJobs Submitted"," ");
        System.out.printf("\n----%10s--------------\n"," ");
        
        
        int numUser=readUser();
//        System.out.println(numUser);
        String[]user=new String[numUser];
        int[]job=new int [numUser];
        int ucnt=0;
        boolean found =false;
        
        for(int i=0;i<rec;i++){
            for(String a:record[i]){
                if(a.contains(";S;")&&a.contains("user")){
                    String u=a.substring(a.indexOf("=")+1);
//                    System.out.println(u);

                    for(int k=0;k<ucnt;k++){
                        if(u.equals(user[k])){
                            found=true;
                            job[k]++;
                            break;
                        }
                    }
                    
                    if(!found){
                        user[ucnt]=u;
                        job[ucnt]=1;
                        ucnt++;
                    }
                    found=false;
                }
            }
            
        }
        
        
        for(int i=0;i<user.length;i++){
            if(user[i]!=null)
            System.out.printf("%-7s%8s%d\n",user[i]," ",job[i]);
        }
        
        
        System.out.println("\n*************************************************");
        System.out.println("Print jobs status");
        System.out.printf("\nJob ID\t\tSubmitted (queue)\tStarted (start time)\tExited (end time/error)");
        System.out.print("\n------\t\t-----------------\t--------------------\t----------------------");
        
        for(int i=0;i<rec;i++){
            String id=null,queue=null,start=null,end=null;
         
            if(record[i][1].contains(";S;")){
//                id=record[i][1].split(";")[2].substring(0,5);
                for(String a:record[i]){
                    if(a.contains(";S;")){
                        id=a.split(";")[2].substring(0,5);
                    }
                    if(a.contains("queue")){
                        queue=a.split("=")[1];
                    }
                    if(a.contains("start")){
                        start=a.split("=")[1];
                    }
                   for(int j=i+1;j<rec;j++){
                       if(record[j][1].contains(";E;")&&record[j][1].split(";")[2].substring(0,5).equals(id)){
                           for(String s: record[j]){
                               if(s.contains("Exit_status")&&Integer.parseInt(s.split("=")[1])!=1){
                                    end="Error: Exit Status "+s.split("=")[1];
                                    break;
                                }else{
                                   for(String q:record[j]){
                                       if(q.contains("end")){
                                           end=q.split("=")[1];
                                       }
                                   }
                               }
                           }
                           break;
                           
                       }
                   }
                    
                }
            System.out.printf("\n%-8s\t\tY (%s)\t\t\tY (%s)%2s\t\t%s",id,queue,start," ",end);
            
            }
        }
        
        System.out.println("\n*************************************************");
        
        
    }
    
    
    
    public static int readRec(){
        int cnt=0;
        try{
            Scanner in=new Scanner(new FileInputStream("sampleLog.txt"));
            while(in.hasNextLine()){
                String line=in.nextLine();
                if(line.contains(";Q;")||line.contains(";S;")||line.contains(";E;")){
                    cnt++;
                }
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            
            
        }
        return cnt;
    }
    
    public static int readUser(){
        int cnt=0;
        try{
            Scanner in=new Scanner(new FileInputStream("./src//Hard//sampleLog.txt"));
            while(in.hasNextLine()){
                String line=in.nextLine();
                if(line.contains(";S;")){
                    cnt++;
                }
            }
            in.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            
        }
        return cnt;
    }
}

    

