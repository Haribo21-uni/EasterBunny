package decorator;

import factory.EasterEgg;

public class StickerEgg extends EggDecorator {
    public StickerEgg(EasterEgg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Яйце с лепенки.");
    }
}
