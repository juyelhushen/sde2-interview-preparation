package low_level_design.splitwise.designs.strategy;

import low_level_design.splitwise.entity.Split;

import java.util.List;

public class SplitStrategyContext {

    private SplitStrategy splitStrategy;

    private SplitStrategyContext() {}

    public void setSplitStrategy(SplitStrategy splitStrategy) {
        this.splitStrategy = splitStrategy;
    }

    public void calculateSplits(List<Split> splits, long totalAmount) {
        splitStrategy.validate(splits, totalAmount);
        splitStrategy.computeSplits(splits, totalAmount);
    }
}
