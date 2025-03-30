package factory;

public class ChickenEgg implements EasterEgg {
    @Override
    public void describe() {
        System.out.println("Кокоше яйце.");
    }
}
