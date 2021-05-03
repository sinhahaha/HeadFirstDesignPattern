package ducks;

import ducks.flying.FliesWithWings;
import ducks.quaking.Quaking;

public class MallardDuck extends Duck{
    public MallardDuck() {
        setFlyingBehaviour(new FliesWithWings());
        setQuakingBehaviour(new Quaking());
    }

    public void show(){
        System.out.println("I am a mallard duck!");
    }
}
