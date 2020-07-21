package domain.florets;

import enums.Freshness;

public class Rose extends Flowers {

    public Rose(Freshness freshness, int stemLength, int cost) {
        super(freshness, stemLength, cost);
        name = "Роза";
    }

}
