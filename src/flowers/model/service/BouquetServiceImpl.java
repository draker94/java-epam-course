package flowers.model.service;

import flowers.domain.Bouquet;
import flowers.domain.florets.Flowers;
import flowers.domain.florets.FlowersComparator;

import java.util.Arrays;

public class BouquetServiceImpl implements BouquetService {

    @Override
    public void sortByFreshness(Bouquet bouquet) {
        FlowersComparator flowersComparator = new FlowersComparator();
        Arrays.sort(bouquet.getFlowers(), flowersComparator);
    }

    @Override
    public void findFlowerByStem(Bouquet bouquet, int from, int to) {
        int counter = 0;
        for (Flowers f : bouquet.getFlowers()) {
            if (f.getStemLength() >= from && f.getStemLength() <= to) {
                counter++;
                System.out.println(String.format("Цветок с подходящим стеблем (от %d до %d) найден! %s", from, to, f));
            }
        }
        if (counter == 0) System.out.println("К сожалению по Вашему запросу ничего не найдено :( ");
    }
}
