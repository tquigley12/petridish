package petridish;

public class LogisticGrowth implements GrowthStrategy {

    private double growthRate;
    private long maxPopulation;

    public LogisticGrowth(double growthRate, long maxPopulation) {
        this.growthRate = growthRate;
        this.maxPopulation = maxPopulation;
    }

    @Override
    public long grow(long initialPopulation) {
        double instantaneousGrowthRate = Math.log1p(growthRate);
        long numerator = initialPopulation * maxPopulation;
        double denominator = initialPopulation + (maxPopulation - initialPopulation) * Math.pow(Math.E, -1 * instantaneousGrowthRate);
        return Math.round(numerator / denominator);
    }

}
