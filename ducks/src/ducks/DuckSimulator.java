package ducks;

import ducks.flying.FliesWithRocket;

public class DuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.show();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.fly();
        modelDuck.setFlyingBehaviour(new FliesWithRocket());
        modelDuck.fly();
        modelDuck.show();
    }
}
