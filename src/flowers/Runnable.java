package flowers;

import flowers.console.PrintBouquet;
import flowers.domain.*;
import flowers.domain.florets.*;
import flowers.model.service.BouquetService;
import flowers.model.service.BouquetServiceImpl;

import static flowers.enums.Freshness.*;

public class Runnable {
    public static void main(String[] args) {
        Flowers rose = new Rose(NORMAL, 40, 2);
        Flowers tulip = new Tulip(NORMAL, 44, 1);
        Flowers peony = new Peony(BEST, 50, 3);
        Flowers carnation = new Carnation(BAD, 34, 1);

        PackingAccessory accessory = new PackingAccessory("Средняя упаковка", 3, 6);

        Bouquet bouquet = new Bouquet(accessory, rose, tulip, peony, carnation);
        PrintBouquet.print(bouquet);

        Flowers rose1 = new Rose(NORMAL, 23, 1);
        PackingAccessory accessory1 = new PackingAccessory("Универсальная упаковка", 1, 9);
        Bouquet bouquet1 = new Bouquet(accessory1, rose1, rose);
        System.out.println();

        BouquetService service = new BouquetServiceImpl();
        service.sortByFreshness(bouquet);
        PrintBouquet.print(bouquet);
        service.findFlowerByStem(bouquet, 30, 50);
    }
}
