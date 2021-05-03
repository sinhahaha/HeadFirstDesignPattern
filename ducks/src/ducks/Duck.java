package ducks;

import ducks.flying.FlyingBehaviour;
import ducks.quaking.QuakingBehaviour;

public abstract class Duck {
    private FlyingBehaviour flyingBehaviour;
    private QuakingBehaviour quakingBehaviour;

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setQuakingBehaviour(QuakingBehaviour quakingBehaviour) {
        this.quakingBehaviour = quakingBehaviour;
    }

    public void fly() {
        flyingBehaviour.fly();
    }

    public void quack() {
        quakingBehaviour.quak();
    }

    public void swim() {
        System.out.println("All ducks can swim!");
    }
}
