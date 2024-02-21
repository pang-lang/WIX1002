package pyq161;
public class Tester {
    public static void main(String[] args) {
    Rebate r = new Rebate("John Lim", "1111222233334444");
    Point p = new Point("John Lim", "5555666677778888");
    
    r.getReward("grocery", 124.8);
    r.getReward("other", 64.6);
    r.getReward("fuel", 95.4);
    r.getReward("utility", 100);
    r.getReward("other", 220);
    
    p.getReward("Saturday", 124.8);
    p.getReward("Friday", 64.6);
    p.getReward("Sunday", 95.4);
    p.getReward("Friday", 100);
    p.getReward("Tuesday", 220);
    
    System.out.println(r.toString());
    System.out.println(p.toString());
    
    if (r.getTotalCashReward()>p.getTotalCashReward())
        System.out.println("The best card is Point Reward Card");
    else
        System.out.println("The best card is Cash Rebate Card");
    }
}
    

