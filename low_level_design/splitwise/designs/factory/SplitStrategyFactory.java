package low_level_design.splitwise.designs.factory;

import low_level_design.splitwise.designs.strategy.EqualSplitStrategy;
import low_level_design.splitwise.designs.strategy.ExactSplitStrategy;
import low_level_design.splitwise.designs.strategy.SplitStrategy;
import low_level_design.splitwise.enums.SplitType;

public class SplitStrategyFactory {
    private SplitStrategyFactory() {
    }

    public static SplitStrategy createSplitStrategy(SplitType type) {
        return switch (type) {
            case EXACT -> ExactSplitStrategy.INSTANCE;
            case EQUAL -> EqualSplitStrategy.INSTANCE;
        };
    }
}
