
public class L3Q2 {
    public static void main(String[] args) {
        //2. Generate a random integer within 0 to 5 and display the integer in word. 2 is two.
        int randNum = (int)(Math.random()*6);
        //System.out.print("the random number generated : " + randNum + ", ");
        switch (randNum){
            case 0 : System.out.println("0 is zero");break;
            case 1 : System.out.println("1 is one");break;
            case 2 : System.out.println("2 is two");break;
            case 3 : System.out.println("3 is three");break;
            case 4 : System.out.println("4 is four");break;
            case 5 : System.out.println("5 is five");break;
        }
    }
}

//array method
//import java.util.Random;
//Random random = new Random();
//int randomNumber = random.nextInt(6);
//String word[] = {"zero", "one", "two", "three", "four", "five"};
//System.out.println(randomNumber + " is " + word[randomNumber]);