package factory;

public class EasterEggFactory {
    public static EasterEgg createEgg(String type) {
        switch (type.toLowerCase()) {
            case "chicken":
                return new ChickenEgg();
            case "ostrich":
                return new OstrichEgg();
            case "dinosaur":
                return new DinosaurEgg();
            default:
                throw new IllegalArgumentException("Неизвестен тип яйце: " + type);
        }
    }
}
