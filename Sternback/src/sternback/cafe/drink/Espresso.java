package sternback.cafe.drink;

import sternback.cafe.Drink;

public class Espresso extends Drink {

    public Espresso() {
        this.setDescription("Espresso");
    }

    @Override
    public double getPrice() {
        return 1.99;
    }

}
