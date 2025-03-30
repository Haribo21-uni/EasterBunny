package strategy;

import factory.EasterEgg;

public interface HidingStrategy {
    void hide(EasterEgg egg);

    String hideEggMessage();
}
