package pizza.star.pizza;

public class BerlinSalamiPizza extends Pizza {
    public BerlinSalamiPizza() {
        name = "Salami pizza from Berlin";
        dough = "Dry dough";
        sauce = "Marinara-Sauce";

        topping.add("Parmesan");
        topping.add("Salami");
    }
}
