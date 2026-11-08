package low_level_design.splitwise.designs.strategy;

import low_level_design.splitwise.entity.Split;

import java.util.List;

public interface SplitStrategy {

    // Step 1: check inputs are valid BEFORE computing anything
    // Fail loudly with a meaningful message — don't silently produce wrong splits
    void validate(List<Split> splits, long totalAmount);

    // Step 2: compute and set amountInPaise on each split
    // Called only after validate() passes
    void computeSplits(List<Split> splits, long totalAmount);
}
