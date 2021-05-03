package ducks.flying;

public class FliesWithRocket implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with rockets!");
    }
}
