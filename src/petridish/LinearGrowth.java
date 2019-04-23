package petridish;

public class LinearGrowth implements GrowthStrategy {

    private int delta;

    public LinearGrowth(int delta) {
        this.delta = delta;
    }

    @Override
    public long grow(long initialPopulation) {
        return initialPopulation + delta;
    }

}
