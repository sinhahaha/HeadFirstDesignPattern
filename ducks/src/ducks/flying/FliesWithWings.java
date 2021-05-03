package ducks.flying;

public class FliesWithWings implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
