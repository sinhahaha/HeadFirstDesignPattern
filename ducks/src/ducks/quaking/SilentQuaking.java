package ducks.quaking;

public class SilentQuaking implements QuakingBehaviour{
    @Override
    public void quak() {
        System.out.println("<<SILENT>>");
    }
}
