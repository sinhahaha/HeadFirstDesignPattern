package ducks;

import ducks.flying.FliesNot;
import ducks.quaking.SilentQuaking;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyingBehaviour(new FliesNot());
        setQuakingBehaviour(new SilentQuaking());
    }

    public void show(){
        System.out.println("I am a model duck");
    }
}
