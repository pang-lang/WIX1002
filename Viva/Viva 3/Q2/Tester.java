package viva3;
public class Tester {
    public static void main(String[] args) {
        System.out.println("The epic battle begins!");
        Phantom phantom = new Phantom();
        BlackMage blackMage = new BlackMage();
        
        int damageValue;
        
        while (blackMage.getHp() > 0) {
            // Inside the loop, Phantom deals damage to the Black Mage
            damageValue = phantom.damage(blackMage);
            System.out.println(blackMage.toString(damageValue));
        } 
        System.out.println("The Black Mage is defeated...");
    }
}
