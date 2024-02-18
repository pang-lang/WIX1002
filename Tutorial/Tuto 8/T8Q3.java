
package tutorial8;

public class T8Q3 {
    public static void main(String[] args) {
        //Create a class that used to represent the 2 dimension coordinate system. The class consists of constructors, 
        //instance variables, accessor and mutator method and an output method that display the x-coordinate and y-coordinate.
        Coordinate c = new Coordinate(5,6);
        c.showCoordinate();
    }
}
        class Coordinate {
            private int x;
            private int y;
            
            public Coordinate(){
                x = 0;
                y = 0;
            }           
            public Coordinate (int x, int y){
                this.x = x;
                this.y = y;
            }
            
            public int getx(){
                return this.x;
            }
            public int gety(){
                return this.y;
            }
            
            public void setx(int x){
                this.x = x;   
            }
            public void sety (int y){
                this.y = y;
            }
            
            public void showCoordinate(){
                System.out.println("(" + x + ", " + y + ")");
            }
            
        }


        
        
    
