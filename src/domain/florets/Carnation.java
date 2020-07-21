package domain.florets;

import enums.Freshness;

public class Carnation extends Flowers {

    public Carnation(Freshness freshness, int stemLength, int cost) {
        super(freshness, stemLength, cost);
        name = "Гвоздика";
    }

}
