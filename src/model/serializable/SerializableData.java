package model.serializable;

import domain.Bouquet;

public interface SerializableData {

    void saveBouquet(Bouquet bouquet, String relativePath);
    Bouquet loadBouquet(String relativePath);

}
