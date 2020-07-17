package flowers;

import flowers.console.PrintBouquet;
import flowers.domain.*;
import flowers.model.reader.LoadData;
import flowers.model.reader.LoadDataFakeImpl;
import flowers.model.service.BouquetService;
import flowers.model.service.BouquetServiceImpl;


public class Runnable {
    public static void main(String[] args) {

        LoadData loadData = new LoadDataFakeImpl();
        Bouquet bouquet = loadData.loadBouquet();
        BouquetService service = new BouquetServiceImpl();
        PrintBouquet.print(bouquet);

        System.out.println();
        service.sortByFreshness(bouquet);
        PrintBouquet.print(bouquet);
        System.out.println();

        service.findFlowerByStem(bouquet, 30, 50);
    }
}
