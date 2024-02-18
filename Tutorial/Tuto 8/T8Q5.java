
package tutorial8;
public class T8Q5 {
    public static void main(String[] args) {
        //5. Create a class Connection. The Connection class keeps track of the number of connections to the server. 
        //Whenever an object is created, a connection is established. 
        //The class has a disconnect method and a display method that display the number of connections to the server.
    }
}
    class Connection{
        //static - variable shared by all obj under the same class
        private static int count = 0;
        
        Connection(){
            count++;
        }
       
        public void disconnect(){
            count--;
        }
        
        public void display(){
            System.out.println("The number of connections to the server: " + count);
        }

}


		
		