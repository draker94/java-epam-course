package console;

import domain.florets.*;

public class PrintFlowerFullInfo {

    public static void print(Flower flower) {
        StringBuilder stringBuilder = new StringBuilder(String.format("Цветок: %s. Свежесть - %s, " +
                        "длинна стебля - %d см, стоимость - %d бел. руб., в букете - ", flower.getName(),
                flower.getFreshness().getCyrillicFreshness(), flower.getStemLength(), flower.getCost()));

        stringBuilder.append(flower.isInBouquet() ? "да" : "нет");
        switch (flower.getClass().getSimpleName()) {
            case "Carnation":
                stringBuilder.append(", колличество цветов в бутоне - ").append(((Carnation) flower).getNumberFlowersInBud());
                break;
            case "Peony":
                stringBuilder.append(", диаметр цветка - ").append(((Peony) flower).getFlowerDiameter()).append(" см.");
                break;
            case "Rose":
                stringBuilder.append(", с шипами - ").append(((Rose) flower).isHasThorns() ? "да" : "нет");
                break;
            case "Tulip":
                stringBuilder.append(", форма цветка - ").append(((Tulip) flower).getFlowerShape().getCyrillicForm());
                break;
        }
        System.out.println(stringBuilder);
    }

}
