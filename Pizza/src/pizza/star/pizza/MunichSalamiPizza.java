package pizza.star.pizza;

public class MunichSalamiPizza extends Pizza {
    public MunichSalamiPizza() {
        name = "Salami pizza from Munich";
        dough = "Dry dough";
        sauce = "Tomato-Sauce";

        topping.add("Mozzarella");
        topping.add("Salami");
    }
}
