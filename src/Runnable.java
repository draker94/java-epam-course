import console.PrintBouquet;
import domain.Bouquet;
import domain.PackingAccessory;
import domain.florets.*;
import model.serializable.SerializableData;
import model.serializable.SerializableDataImpl;
import model.service.BouquetService;
import model.service.BouquetServiceImpl;

import static enums.Freshness.*;
import static enums.TulipFlowerShape.*;


public class Runnable {
    public static void main(String[] args) {

        Flower rose = new Rose(NORMAL, 40, 2, true);
        Flower tulip = new Tulip(NORMAL, 44, 1, GOBLET);
        Flower peony = new Peony(BEST, 50, 3, 25);
        Flower carnation = new Carnation(BAD, 34, 1, 1);
        PackingAccessory accessory = new PackingAccessory("Средняя упаковка", 3, 6);
        Bouquet bouquetSerExample = new Bouquet(accessory, rose, tulip, peony, carnation);

        SerializableData serializableData = new SerializableDataImpl();
        serializableData.saveBouquet(bouquetSerExample, "data/BouquetMiddle.dat");

        Bouquet bouquet = serializableData.loadBouquet("data/BouquetMiddle.dat");
        PrintBouquet.print(bouquet);
        System.out.println();

        BouquetService service = new BouquetServiceImpl();
        service.sortByFreshness(bouquet);
        PrintBouquet.print(bouquet);
        System.out.println();

        service.findFlowerByStem(bouquet, 35, 50);

        System.out.println();
        Bouquet bouquetBigCheap = serializableData.loadBouquet("data/BouquetBigCheap.dat");
        PrintBouquet.print(bouquetBigCheap);
    }
}
