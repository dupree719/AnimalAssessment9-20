package superclass;

public class Superman extends SuperHero{


    @Override
    public void useSpecialPower() {
        System.out.println("Fly");
    }
    @Override
    public void putOnSuit() {
        System.out.println("Putting on" + this.getSuit());
    }
}
