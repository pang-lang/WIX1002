
package pyq172;

public class DayOfTheWeek {
    protected int h, q, m, y, J, K;

    public DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }
    
    public boolean isValidDay(){
        int max;
        int min = 1;
        switch(m){
            case 3: case 5: case 7: case 8: case 10: case 12: max = 31; break;
            case 2:
                if (isLeapYear()){
                    m = 14;
                    max = 29;
                    y -= 1;
                } else {
                    m = 14;
                    max = 28;
                    y -= 1;
                } break;
            case 1:
                m = 13;
                max = 31;
                y -= 1;
                break;
            default:
                max = 30;
                break;
                        
        }
        return (min <= q && q <= max);
    }
    
    public boolean isLeapYear(){
        return (y%4 == 0 && y%100 != 0 || y/400 == 0);    
    }
    
    public void display(){
        if (isValidDay()){
            J = y/100;
            K = y%100;
            h = (int) ((q + Math.floor((13*(m+1))/5) + K + Math.floor(K/4) + Math.floor(J/4) + 5*J) % 7);
            String[] day = {"Saturday", "Sunday", "Monday", "Tuesday","Wednesday","Thursday","Friday"};
            System.out.println(q + "/" + m + "/" + y + " is on " + day[h]);
        } else 
            System.out.println(q + "/" + m + "/" + y + " is invalid Input");
    }

}
