package superclass;

public class SuperHero {
    private String suit, tights, specialPower;
    public void useSpecialPower() {
        System.out.println("Special power is...");
    }
    public void putOnSuit(){
        System.out.println("Putting on" + this.suit);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
