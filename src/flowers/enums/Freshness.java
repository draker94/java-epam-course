package flowers.enums;

public enum Freshness {

    BEST(1, "отличная"),
    NORMAL(2, "нормальная"),
    BAD(3, "плохая"),
    WORST(4, "отвратительная");

    private final int freshLevel;
    private final String russianFreshness;

    Freshness(int freshLevel, String russianFreshness) {
        this.freshLevel = freshLevel;
        this.russianFreshness = russianFreshness;
    }

    public int getFreshLevel() {
        return freshLevel;
    }

    public String getRussianFreshness() {
        return russianFreshness;
    }
}
