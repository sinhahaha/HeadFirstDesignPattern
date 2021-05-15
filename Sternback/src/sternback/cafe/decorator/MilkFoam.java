package sternback.cafe.decorator;

import sternback.cafe.Drink;
import sternback.cafe.IngredientDecorator;

public class MilkFoam extends IngredientDecorator {

    private final Drink drink;

    public MilkFoam(Drink drink) {
        this.drink =drink;
    }

    @Override
    public double getPrice() {
        return 0.10 + drink.getPrice();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", MilkFoam";
    }
}
