
package Q3;

public class Tester {
    public static void main(String[] args) {
        Appointment a = new Appointment(11, 6, 2010, 11, 12, "appointment.txt");
        Appointment b = new Appointment(12, 6, 2010, 12, 16, "appointment.txt");
        Appointment c = new Appointment(13, 6, 2010, 16, 18, "appointment.txt");
        Appointment d = new Appointment(13, 6, 2010, 10, 12, "appointment.txt");
        Appointment e = new Appointment(13, 6, 2010, 16, 18, "appointment.txt");
        Appointment f = new Appointment(12, 6, 2010, 10, 13, "appointment.txt");
        
        a.process();
        b.process();
        c.process();
        d.process();
        e.process();
        f.process();
    }
}


