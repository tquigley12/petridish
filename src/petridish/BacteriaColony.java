package petridish;

public class BacteriaColony {

    private long population = 0;
    private GrowthStrategy growthStrategy;

    public BacteriaColony(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public void setGrowthStrategy(GrowthStrategy growthStrategy) {
        this.growthStrategy = growthStrategy;
    }

    public void grow() {
        /*
         * Because we didn't ask for a GrowthStrategy in the constructor, we are
         * trusting the user of BacteriaColony to call setGrowthStrategy() BEFORE
         * they try to call grow(). In case they don't, this null check prevents
         * the program from crashing.
         */
        if (growthStrategy != null) {
            population = growthStrategy.grow(population);
        }
    }
}
