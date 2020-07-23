package domain.florets;

import enums.Freshness;

public class Tulip extends Flowers {

    public Tulip(Freshness freshness, int stemLength, int cost) {
        super("Тюльпан", freshness, stemLength, cost);
    }

}
