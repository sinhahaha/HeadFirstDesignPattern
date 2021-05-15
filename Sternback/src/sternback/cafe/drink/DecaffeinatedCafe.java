package sternback.cafe.drink;

import sternback.cafe.Drink;

public class DecaffeinatedCafe extends Drink {

    public DecaffeinatedCafe() {
        this.setDescription("Decaffeinated Cafe");
    }

    @Override
    public double getPrice() {
        return 1.05;
    }
}
