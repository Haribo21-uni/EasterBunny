package strategy;

import factory.EasterEgg;

public abstract class BushHiding implements HidingStrategy {
    @Override
    public void hide(EasterEgg egg) {
        System.out.println("Яйцето е скрито под храст.");
    }
}
