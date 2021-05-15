package sternback.cafe.drink;

import sternback.cafe.Drink;

public class SpecialDrink extends Drink {

    public SpecialDrink() {
        setDescription("Special Drink");
    }

    @Override
    public double getPrice() {
        return 0.89;
    }
}
