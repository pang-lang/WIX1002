
public class Q5 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                int randNum = (int)(Math.random()*2);
                arr[i][j] = randNum;
                System.out.print(arr[i][j] + " ");
            } System.out.println("");
        }
        //row
        for (int i=0; i<arr.length; i++){
                if (arr[i][0] == 0 && arr[i][1] == 0 && arr[i][2] == 0){
                    System.out.println("All 0's on row " + (i+1));
                } else if (arr[i][0] == 1 && arr[i][1] == 1 && arr[i][2] == 1){
                    System.out.println("All 1's on row " + (i+1));
                }
            } 
        
        //column
        for(int j=0; j<arr.length; j++){
            if (arr[0][j] == 0 && arr[1][j] == 0 && arr[2][j] ==0){
                System.out.println("All 0's on column " + (j+1));
            } else if (arr[0][j] == 1 && arr[1][j] == 1 && arr[2][j] == 1){
                System.out.println("All 1's on column " + (j+1));
            }
        } 
        
        //diagonal
        if (arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0){
            System.out.println("All 0's on diagonal ");
        } else if (arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1){
            System.out.println("All 1's on diagonal ");
                }
            } 
        }
    
        
    
    

