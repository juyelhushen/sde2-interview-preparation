package low_level_design.LibraryManagementSystem.strategy.fine;

import low_level_design.LibraryManagementSystem.entity.BookLending;

public interface FineStrategy {
    double calculateFine(BookLending lending);
}
