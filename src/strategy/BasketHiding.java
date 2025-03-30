package strategy;

import factory.EasterEgg;

public abstract class BasketHiding implements HidingStrategy {
    @Override
    public void hide(EasterEgg egg) {
        System.out.println("Яйцето е скрито в кошница.");
    }
}
