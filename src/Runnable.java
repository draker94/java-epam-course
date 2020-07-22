import console.PrintBouquet;
import domain.Bouquet;
import model.reader.LoadData;
import model.reader.LoadDataFakeImpl;
import model.service.BouquetService;
import model.service.BouquetServiceImpl;


public class Runnable {
    public static void main(String[] args) {

        LoadData loadData = new LoadDataFakeImpl();
        Bouquet bouquet = loadData.loadBouquet();
        PrintBouquet.print(bouquet);
        System.out.println();

        BouquetService service = new BouquetServiceImpl();
        service.sortByFreshness(bouquet);
        PrintBouquet.print(bouquet);
        System.out.println();

        service.findFlowerByStem(bouquet, 35, 50);
    }
}
