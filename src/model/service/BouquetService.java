package model.service;

import domain.Bouquet;

public interface BouquetService {

    void sortByFreshness(Bouquet bouquet);
    void findFlowerByStem(Bouquet bouquet, int from, int to);

}
