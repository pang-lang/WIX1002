
package pyq201;
        
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        System.out.println("Reading from log file...");
        System.out.println("*".repeat(40));
        System.out.println("Records read from log file\n");

        ArrayList<String[]> recordQ = new ArrayList<String[]>();
        ArrayList<String[]> recordS = new ArrayList<String[]>();
        ArrayList<String[]> recordE = new ArrayList<String[]>();

        int totalNumOfRecord = calculateNumOfRecord(recordQ, recordS, recordE);

        ArrayList<String> users = new ArrayList<String>();
        ArrayList<Integer> jobSubmitted = new ArrayList<Integer>();

        findUser(recordS, users, jobSubmitted);
        printUser(users, jobSubmitted);

        printJobStatus(recordS, recordE);
        
    }

    public static int calculateNumOfRecord(ArrayList<String[]> recordQ, ArrayList<String[]> recordS, ArrayList<String[]> recordE) {
        int totalNumOfRecord = 0;

        try {
            Scanner inputStream = new Scanner(new FileInputStream("sampleLog.txt"));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] record = line.split(" ");
                totalNumOfRecord++;
                putRecord(record, recordQ, recordS, recordE);
                printRecord(record, totalNumOfRecord);
            }
            System.out.println("\ntotal records read: " + totalNumOfRecord + "\n");
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        return totalNumOfRecord;
    }

    public static void printRecord(String[] record, int numOfRecord) {
        System.out.println("Record " + numOfRecord);
        for (String attribute : record) {
            System.out.println("\t" + attribute);
        }
    }

    public static void putRecord(String[] record, ArrayList<String[]> recordQ, ArrayList<String[]> recordS, ArrayList<String[]> recordE) {
        String type = record[1].split(";")[1];
        if (type.equalsIgnoreCase("Q")) {
            recordQ.add(record);
        } else if (type.equalsIgnoreCase("S")) {
            recordS.add(record);
        } else if (type.equalsIgnoreCase("E")) {
            recordE.add(record);
        }
    }

    public static void findUser(ArrayList<String[]> recordS, ArrayList<String> users, ArrayList<Integer> jobSubmitted) {
        for (int i = 0; i < recordS.size(); i++) {
            String name = recordS.get(i)[1].split(";|=")[4];
            if (!users.contains(name)) {
                users.add(name);
                jobSubmitted.add(0);
            }
            int indexOfName = users.indexOf(name);
            jobSubmitted.set(indexOfName, jobSubmitted.get(indexOfName) + 1);
        }
    }

    public static void printUser(ArrayList<String> users, ArrayList<Integer> jobSubmitted) {
        System.out.println("*".repeat(40));
        System.out.println("Print user submission stat\n");
        System.out.println("User" + " ".repeat(16) + "Jobs Submitted");
        System.out.println("-".repeat(4) + " ".repeat(16) + "-".repeat(14));

        for (int i = 0; i < users.size(); i++) {
            String name = users.get(i);
            int numOfJobsSubmitted = jobSubmitted.get(i);
            System.out.println(name + " ".repeat(20 - name.length()) + numOfJobsSubmitted);
        }
    }

    public static void printJobStatus(ArrayList<String[]> recordS, ArrayList<String[]> recordE) {
        System.out.println("\n" + "*".repeat(40));
        System.out.println("Print Job Status\n");

        System.out.println("Job ID" + " ".repeat(5) + "Submitted (queue)" + " ".repeat(6) + "Started (start time)" + " ".repeat(2) + "Exited (end time/error)");
        System.out.println("-".repeat(6) + " ".repeat(5) + "-".repeat(17) + " ".repeat(6) + "-".repeat(20) + " ".repeat(2) + "-".repeat(23));

        for (int i = 0; i < recordS.size(); i++) {
            String id = recordS.get(i)[1].split(";|\\.ce2\\.dicc\\.um\\.edu\\.my")[2];
            System.out.print(id + " ".repeat(11 - id.length()));
            String queue = recordS.get(i)[4].split("=")[1];
            System.out.print("Y (" + queue + ")" + " ".repeat(19 - queue.length()));
            String startTime = recordS.get(i)[8].split("=")[1];
            System.out.print("Y (" + startTime + ")" + " ".repeat(18 - startTime.length()));
            
            printEndTime(recordE, id, i);
        }
    }

    public static void printEndTime(ArrayList<String[]> recordE , String id , int i) {

        boolean gotExitStatus = false;

        for (int j = 0; j < recordE.size(); j++) {
            String idForRecordE = recordE.get(j)[1].split(";|\\.ce2\\.dicc\\.um\\.edu\\.my")[2];
            if (idForRecordE.equalsIgnoreCase(id)) {
                gotExitStatus = true;
                String exitStatus = recordE.get(j)[17].split("_|=")[2];
                if (!exitStatus.equalsIgnoreCase("1")) {
                    System.out.println("Error: Exit Status " + exitStatus);
                } else {
                    String endTime = recordE.get(i)[16].split("=")[1];
                    System.out.println(endTime);
                }

            }
        }
        if (gotExitStatus == false) {
            System.out.println("null");
        }
    }
}


    
