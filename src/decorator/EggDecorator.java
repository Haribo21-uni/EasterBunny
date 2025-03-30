package decorator;

import factory.EasterEgg;

public abstract class EggDecorator implements EasterEgg {
    protected EasterEgg decoratedEgg;

    public EggDecorator(EasterEgg decoratedEgg) {
        this.decoratedEgg = decoratedEgg;
    }

    @Override
    public void describe() {
        decoratedEgg.describe();
    }
}
