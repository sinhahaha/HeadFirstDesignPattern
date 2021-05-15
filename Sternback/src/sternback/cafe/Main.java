package sternback.cafe;

import sternback.cafe.decorator.Chocolate;
import sternback.cafe.decorator.MilkFoam;
import sternback.cafe.decorator.Soja;
import sternback.cafe.drink.DarkRoast;
import sternback.cafe.drink.Espresso;
import sternback.cafe.drink.SpecialDrink;


public class Main {
    public static void main(String[] args) {
        Drink espresso = new Espresso();
        printDrink(espresso);

        Drink darkRoast = new DarkRoast();
        darkRoast = new Chocolate(darkRoast);
        darkRoast = new Chocolate(darkRoast);
        darkRoast = new MilkFoam(darkRoast);
        printDrink(darkRoast);

        Drink specialDrink = new SpecialDrink();
        specialDrink = new Soja(specialDrink);
        specialDrink = new Chocolate(specialDrink);
        specialDrink = new MilkFoam(specialDrink);
        printDrink(specialDrink);
    }

    private static void printDrink(Drink drink) {
        System.out.println(drink.getDescription() + " " + drink.getPrice() + "€");
    }
}
