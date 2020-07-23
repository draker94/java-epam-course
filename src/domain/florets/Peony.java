package domain.florets;

import enums.Freshness;

public class Peony extends Flowers {

    public Peony(Freshness freshness, int stemLength, int cost) {
        super("Пион", freshness, stemLength, cost);
    }

}
