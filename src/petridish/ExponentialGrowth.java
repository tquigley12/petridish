package petridish;

public class ExponentialGrowth implements GrowthStrategy {

    private double growthRate;

    public ExponentialGrowth(double growthRate) {
        this.growthRate = growthRate;
    }

    @Override
    public long grow(long initialPopulation) {
        return Math.round(initialPopulation * (1 + growthRate));
    }

}
