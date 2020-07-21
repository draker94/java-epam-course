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
        BouquetService service = new BouquetServiceImpl();
        PrintBouquet.print(bouquet);

        System.out.println();
        service.sortByFreshness(bouquet);
        PrintBouquet.print(bouquet);
        System.out.println();

        service.findFlowerByStem(bouquet, 35, 50);
    }
}
