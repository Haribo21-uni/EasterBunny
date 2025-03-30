package singleton;

import factory.*;

public class MagicBag {
    private static MagicBag instance;

    private MagicBag() {}

    public static MagicBag getInstance() {
        if (instance == null) {
            instance = new MagicBag();
        }
        return instance;
    }

    public EasterEgg createEgg(String type) {
        return EasterEggFactory.createEgg(type);
    }
}
