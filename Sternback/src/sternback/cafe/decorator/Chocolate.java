package sternback.cafe.decorator;

import sternback.cafe.Drink;
import sternback.cafe.IngredientDecorator;

public class Chocolate extends IngredientDecorator {
    private final Drink drink;

    public Chocolate(Drink drink) {
        this.drink =drink;
    }

    @Override
    public double getPrice() {
        return 0.20 + drink.getPrice();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }
}
