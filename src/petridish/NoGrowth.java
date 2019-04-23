package petridish;

public class NoGrowth implements GrowthStrategy {

    @Override
    public long grow(long initialPopulation) {
        return initialPopulation;
    }

}
