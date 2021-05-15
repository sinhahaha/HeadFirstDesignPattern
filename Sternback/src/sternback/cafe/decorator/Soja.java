package sternback.cafe.decorator;

import sternback.cafe.Drink;
import sternback.cafe.IngredientDecorator;

public class Soja extends IngredientDecorator {

    private final Drink drink;

    public Soja(Drink drink) {
        this.drink =drink;
    }

    @Override
    public double getPrice() {
        return 0.15 + drink.getPrice();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Soja";
    }
}
