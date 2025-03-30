package decorator;

import factory.EasterEgg;

public class ColoredEgg extends EggDecorator {
    public ColoredEgg(EasterEgg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Оцветено яйце.");
    }
}
