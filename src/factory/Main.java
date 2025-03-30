package factory;

import singleton.MagicBag;
import decorator.ColoredEgg;
import decorator.StickerEgg;
import strategy.BasketHiding;
import strategy.ForestHiding;
import strategy.BushHiding;
import strategy.HidingStrategy;

public class Main {
    public static void main(String[] args) {
        MagicBag bag = MagicBag.getInstance();

        EasterEgg egg1 = bag.createEgg("chicken");
        EasterEgg egg2 = bag.createEgg("ostrich");
        EasterEgg egg3 = bag.createEgg("dinosaur");

        egg1 = new ColoredEgg(egg1);
        egg2 = new StickerEgg(egg2);
        egg3 = new StickerEgg(new ColoredEgg(egg3));

        System.out.println("Готови яйца:");
        egg1.describe();
        egg2.describe();
        egg3.describe();

        HidingStrategy basket = new BasketHiding() {
            @Override
            public String hideEggMessage() {
                return "";
            }
        };
        HidingStrategy forest = new ForestHiding() {
            @Override
            public String hideEggMessage() {
                return "";
            }
        };
        HidingStrategy bush = new BushHiding() {
            @Override
            public String hideEggMessage() {
                return "";
            }
        };

        System.out.println("\nСкриване на яйцата:");
        basket.hide(egg1);
        forest.hide(egg2);
        bush.hide(egg3);
    }
}
