
package pyq201;

public class Tester {
    public static void main(String[] args) {
        
        Job j1 = new Job( "J1", 252, 20);
        Job j2 = new Job( "J2", 108, 10);
        Job j3 = new Job( "J3", 72, 25);
        
        CloudPackage c1 = new CloudPackage("P2-15", 4, 15, 1.24); 
        CloudPackage c2 = new CloudPackage("P2-30", 6, 30, 2.11); 
        CloudPackage c3 = new CloudPackage("P5-20", 4, 20, 1.38); 
        CloudPackage c4 = new CloudPackage("P6-20", 6, 20, 1.88); 
        
        Job[] jobs = {j1, j2, j3};
        CloudPackage[] packages = {c1,c2,c3,c4};
        
        double totalCost = 0;
        double minCost = Double.MAX_VALUE;
        int minIndex = -1;
        
        for (int i=0; i<jobs.length; i++){
            for (int j=0; j<packages.length; j++){
                if (packages[j].check(jobs[i])){
                    if (packages[j].totalCost(jobs[i]) <= minCost){
                        minCost = packages[j].totalCost(jobs[i]);
                        minIndex = j;
                    }
                }
            }
           
            totalCost += minCost;
            System.out.println(jobs[i].toString());
            System.out.println(packages[minIndex].toString());
        }
  
        System.out.println("Total Cost: " + totalCost);
    }
}
    

                 
