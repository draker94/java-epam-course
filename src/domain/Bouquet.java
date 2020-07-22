package domain;

import domain.florets.Flowers;
import java.util.Arrays;

public class Bouquet {

    private PackingAccessory accessory;
    private Flowers[] flowers;
    private int price;

    public Bouquet(PackingAccessory accessory, Flowers... flowers) {
        if(check(accessory, flowers)) {
            accessory.setUse(true);
            this.accessory = accessory;
            this.flowers = Arrays.copyOf(flowers, flowers.length);
            for(Flowers f : this.flowers) {
                f.setInBouquet(true);
                this.price += f.getCost();
            }
        }
        else {
            System.out.println("Во время сборки букета произошла ошибка :c");
            throw new UnsupportedOperationException();
        }
    }

    public PackingAccessory getAccessory() {
        return accessory;
    }

    public void setAccessory(PackingAccessory accessory) {
        this.accessory = accessory;
    }

    public Flowers[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers[] flowers) {
        this.flowers = flowers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

     public boolean check(PackingAccessory accessory, Flowers... flowers) {
         boolean allOk = true;
         if (flowers.length < accessory.getMinCapacity() || flowers.length > accessory.getMaxCapacity()) {
             System.out.println(String.format("Вы выбрали упаковочный аксессуар неподходящего размера." +
                     "В данную упаковку помещается от %d до %d цветов", accessory.getMinCapacity(), accessory.getMaxCapacity()));
             allOk = false;
         }
         if(accessory.isUse()) {
             System.out.println("Данный аксессуар уже используется!");
             allOk = false;
         }
         for (Flowers f : flowers) {
             if (f.isInBouquet()) {
                 System.out.println("Цветок уже в другом букете, так не пойдёт! Удалите из заготовки букета: " + f + System.lineSeparator());
                 allOk = false;
             }
         }
         return allOk;
    }
}
