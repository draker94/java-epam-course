package console;

import domain.Bouquet;
import domain.florets.Flowers;

public class PrintBouquet {

    public static void print(Bouquet bouquet) {
        if (bouquet.getFlowers() == null) return;
        System.out.println(String.format("Букет упакованный в \"%s\". Цена - %d бел. руб. Внутри %d ед. цветов.",
                bouquet.getAccessory().getName(), bouquet.getPrice(), bouquet.getFlowers().length));
        for(Flowers f : bouquet.getFlowers()) {
            System.out.println(f);
        }
    }

}
