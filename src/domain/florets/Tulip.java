package domain.florets;

import enums.Freshness;
import enums.TulipFlowerShape;

public class Tulip extends Flower {

    private TulipFlowerShape flowerShape;

    public Tulip(Freshness freshness, int stemLength, int cost, TulipFlowerShape flowerShape) {
        super("Тюльпан", freshness, stemLength, cost);
        this.flowerShape = flowerShape;
    }

    public TulipFlowerShape getFlowerShape() {
        return flowerShape;
    }

    public void setFlowerShape(TulipFlowerShape flowerShape) {
        this.flowerShape = flowerShape;
    }
}
