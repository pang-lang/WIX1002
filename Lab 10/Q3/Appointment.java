
package Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

public class Appointment implements Searchable{
    private int day, month, year, startTime, endTime;
    private String fileName;

    public Appointment(int d, int m, int y, int start, int end, String f) {
        day = d;
        month = m;
        year = y;
        startTime = start;
        endTime = end;
        fileName=f;
    }

    public void process() {
        boolean newfile = false, newrecord = false;
        Scanner in;
        try {
            in = new Scanner(new FileInputStream(fileName));
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found. Creating new file...");
            newfile = true;
        }
        if (newfile==true) {
            addAppointment();
            return;
        }
        else {
           Calendar start = Calendar.getInstance();
           Calendar end = Calendar.getInstance();
           int d, m, y, s, e;
           try {
              in = new Scanner(new FileInputStream(fileName));
              while(in.hasNextInt()) {
                  y = in.nextInt();
                  m = in.nextInt();
                  d = in.nextInt();
                  s = in.nextInt();
                  e = in.nextInt();
                  start.set(y, m-1, d, s, 0);
                  end.set(y, m-1, d, e, 0);
                  if (search(start, end)==true) {
                      newrecord = true;
                      break;
                  }
              }
              in.close();
           } catch (FileNotFoundException ex) {
               System.out.println("File was not found.");
           }
        }
        if (newrecord==false)
            addAppointment();
        else
            System.out.println("There is an exsiting appoinment");
 }

    public void addAppointment() {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(fileName, true));
            out.println(year + " " + month + " " + day + " " + startTime + " " + endTime);
            out.close();
            System.out.println("New appointment added");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public boolean search(Calendar a, Calendar b) {
    Calendar start = Calendar.getInstance();
    Calendar end = Calendar.getInstance();
    int aStart, aEnd, newStart, newEnd;
    
    start.set(year, month - 1, day, startTime, 0);
    
    if (a.get(Calendar.YEAR) == start.get(Calendar.YEAR) && a.get(Calendar.MONTH) == start.get(Calendar.MONTH)
            && a.get(Calendar.DAY_OF_MONTH) == start.get(Calendar.DAY_OF_MONTH)) {
        end.set(year, month - 1, day, endTime, 0);

        aStart = a.get(Calendar.HOUR_OF_DAY);
        aEnd = b.get(Calendar.HOUR_OF_DAY);
        newStart = start.get(Calendar.HOUR_OF_DAY);
        newEnd = end.get(Calendar.HOUR_OF_DAY);

        if (aStart == newStart && aEnd == newEnd)
            return true;
        else if (aStart >= newStart && aStart < newEnd) {
            return true;
        } else if (aEnd > newStart && aEnd <= newEnd) {
            return true;
        } else
            return false;
    } else
        return false;
}
}
