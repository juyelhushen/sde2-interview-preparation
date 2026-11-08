package low_level_design.LibraryManagementSystem.context;

import low_level_design.LibraryManagementSystem.entity.BookLending;
import low_level_design.LibraryManagementSystem.strategy.fine.FineStrategy;

public class FineCalculationContext {

    private FineStrategy fineStrategy;

    public FineCalculationContext(FineStrategy fineStrategy) {
        this.fineStrategy = fineStrategy;
    }

    public void setFineStrategy(FineStrategy fineStrategy) {
        this.fineStrategy = fineStrategy;
    }

    public double calculateFine(BookLending lending) {
        return fineStrategy.calculateFine(lending);
    }
}
