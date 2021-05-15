package sternback.cafe.decorator;

import sternback.cafe.Drink;
import sternback.cafe.IngredientDecorator;

public class HotMilk extends IngredientDecorator {

    private final Drink drink;

    public HotMilk(Drink drink) {
        this.drink =drink;
    }

    @Override
    public double getPrice() {
        return 0.10 + drink.getPrice();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Hot Milk";
    }
}
