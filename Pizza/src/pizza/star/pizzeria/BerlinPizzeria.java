package pizza.star.pizzeria;

import pizza.star.pizza.BerlinSalamiPizza;
import pizza.star.pizza.HamPizza;
import pizza.star.pizza.Pizza;
import pizza.star.pizza.TunaPizza;

public class BerlinPizzeria extends Pizzeria {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "Salami" -> new BerlinSalamiPizza();
            case "Ham" -> new HamPizza();
            case "Tuna" -> new TunaPizza();
            default -> null;
        };
    }
}
