package flowers.console;

import flowers.domain.Bouquet;
import flowers.domain.florets.Flowers;

public class PrintBouquet {

    public static void print(Bouquet bouquet) {
        if (bouquet.getFlowers() == null) return;
        System.out.println(String.format("Букет упакованный в %s. Цена - %d. Внутри %d цветов.",
                bouquet.getAccessory().getName(), bouquet.getPrice(), bouquet.getFlowers().length));
        for(Flowers f : bouquet.getFlowers()) {
            System.out.println(f);
        }
    }

}
