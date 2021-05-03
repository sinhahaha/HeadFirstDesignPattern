package ducks.flying;

public class FliesNot implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
