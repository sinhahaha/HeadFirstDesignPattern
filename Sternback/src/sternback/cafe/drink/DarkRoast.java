package sternback.cafe.drink;

import sternback.cafe.Drink;

public class DarkRoast extends Drink {

    public DarkRoast() {
        this.setDescription("Dark Roast");
    }

    @Override
    public double getPrice() {
        return 0.99;
    }
}
