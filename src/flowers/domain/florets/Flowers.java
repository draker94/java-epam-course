package flowers.domain.florets;

import flowers.enums.Freshness;

public abstract class Flowers {

    protected String name;
    protected Freshness freshness;
    protected int stemLength;
    protected int cost;
    protected boolean inBouquet;

    public Flowers(Freshness freshness, int stemLength, int cost) {
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = cost;
        inBouquet = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isInBouquet() {
        return inBouquet;
    }

    public void setInBouquet(boolean inBouquet) {
        this.inBouquet = inBouquet;
    }

    @Override
    public String toString() {
        return "Цветок: " + name +
                ". Свежесть - " + freshness.getRussianFreshness() +
                ", длинна стебля - " + stemLength +
                " см, стоимость - " + cost +
                " белорусских рубля.";
    }
}
