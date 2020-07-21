package model.reader;

import domain.Bouquet;
import domain.PackingAccessory;
import domain.florets.*;

import static enums.Freshness.*;

public class LoadDataFakeImpl implements LoadData {


    @Override
    public Bouquet loadBouquet() {

        Flowers rose = new Rose(NORMAL, 40, 2);
        Flowers tulip = new Tulip(NORMAL, 44, 1);
        Flowers peony = new Peony(BEST, 50, 3);
        Flowers carnation = new Carnation(BAD, 34, 1);
        PackingAccessory accessory = new PackingAccessory("Средняя упаковка", 3, 6);

        return new Bouquet(accessory, rose, tulip, peony, carnation);
    }

}
