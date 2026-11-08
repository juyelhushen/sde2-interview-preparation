package low_level_design.splitwise.designs.strategy;

import java.util.List;
import low_level_design.splitwise.entity.Split;
import low_level_design.splitwise.exception.InvalidSplitException;

public class ExactSplitStrategy implements SplitStrategy {

    public static final ExactSplitStrategy INSTANCE = new ExactSplitStrategy();

    private ExactSplitStrategy() {
    }

    @Override
    public void validate(List<Split> splits, long totalAmount) {
        long sum = splits.stream().mapToLong(Split::getAmount).sum();
        if (sum != totalAmount) {
            throw new InvalidSplitException(
                    String.format("Exact split amounts sum to %d paise but expense is %d paise.",
                            sum, totalAmount)
            );
        }
    }

    @Override
    public void computeSplits(List<Split> splits, long totalAmount) {

    }
}
