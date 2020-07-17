package flowers.domain.florets;

import flowers.enums.Freshness;

public class Peony extends Flowers {

    public Peony(Freshness freshness, int stemLength, int cost) {
        super(freshness, stemLength, cost);
        name = "Пион";
    }

}
