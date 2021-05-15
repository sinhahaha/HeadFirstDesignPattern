package pizza.star;

import pizza.star.pizza.Pizza;
import pizza.star.pizzeria.BerlinPizzeria;
import pizza.star.pizzeria.MunichPizzeria;
import pizza.star.pizzeria.Pizzeria;

public class Main {
    public static void main(String[] args) {
        Pizzeria berlinPizzeria = new BerlinPizzeria();
        Pizzeria munichPizzeria = new MunichPizzeria();

        Pizza pizza = berlinPizzeria.orderPizza("Salami");
        printPizza(pizza);

        Pizza pizza2 = munichPizzeria.orderPizza("Salami");
        printPizza(pizza2);
    }

    private static void printPizza(Pizza pizza) {
        System.out.println("We ordered " + pizza.getName() + "!");
    }
}
