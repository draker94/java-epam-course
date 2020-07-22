import console.PrintBouquet;
import domain.Bouquet;
import domain.PackingAccessory;
import domain.florets.*;
import model.serializable.SerializableData;
import model.serializable.SerializableDataImpl;
import model.service.BouquetService;
import model.service.BouquetServiceImpl;

import static enums.Freshness.*;


public class Runnable {
    public static void main(String[] args) {

        Flowers rose = new Rose(NORMAL, 40, 2);
        Flowers tulip = new Tulip(NORMAL, 44, 1);
        Flowers peony = new Peony(BEST, 50, 3);
        Flowers carnation = new Carnation(BAD, 34, 1);
        PackingAccessory accessory = new PackingAccessory("Средняя упаковка", 3, 6);
        Bouquet bouquetSer = new Bouquet(accessory, rose, tulip, peony, carnation);

        SerializableData serializableData = new SerializableDataImpl();
        serializableData.saveBouquet(bouquetSer, "data/BouquetMiddle.dat");

        Bouquet bouquet = serializableData.loadBouquet("data/BouquetMiddle.dat");
        PrintBouquet.print(bouquet);
        System.out.println();


        BouquetService service = new BouquetServiceImpl();
        service.sortByFreshness(bouquet);
        PrintBouquet.print(bouquet);
        System.out.println();

        service.findFlowerByStem(bouquet, 35, 50);
    }
}
