package pizza.star.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> topping = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Throw dough " + dough);
        System.out.println("Add sauce " + sauce);
        System.out.println("Add toppings: " + String.join(", ", topping));
    }

    public void bake() {
        System.out.println("Bake for 25 Minutes");
    }

    public void cut() {
        System.out.println("Cut diagonal");
    }

    public void pack() {
        System.out.println("Pack official");
    }

    public String getName(){
        return name;
    }
}
