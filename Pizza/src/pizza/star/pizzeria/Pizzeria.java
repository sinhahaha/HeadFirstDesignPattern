package pizza.star.pizzeria;

import pizza.star.pizza.Pizza;

public abstract class Pizzeria {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    protected abstract Pizza createPizza(String element);
}
