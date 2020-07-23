package domain.florets;

import enums.Freshness;

public class Rose extends Flowers {

    private boolean hasThorns;

    public Rose(Freshness freshness, int stemLength, int cost, boolean hasThorns) {
        super("Роза", freshness, stemLength, cost);
    }

    public boolean isHasThorns() {
        return hasThorns;
    }

    public void setHasThorns(boolean hasThorns) {
        this.hasThorns = hasThorns;
    }

}
