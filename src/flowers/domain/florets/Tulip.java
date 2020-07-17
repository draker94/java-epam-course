package flowers.domain.florets;

import flowers.enums.Freshness;

public class Tulip extends Flowers {

    public Tulip(Freshness freshness, int stemLength, int cost) {
        super(freshness, stemLength, cost);
        name = "Тюльпан";
    }

}
