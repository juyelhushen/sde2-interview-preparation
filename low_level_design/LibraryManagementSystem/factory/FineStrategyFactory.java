package low_level_design.LibraryManagementSystem.factory;

import low_level_design.LibraryManagementSystem.enums.MemberType;
import low_level_design.LibraryManagementSystem.strategy.fine.FineStrategy;
import low_level_design.LibraryManagementSystem.strategy.fine.PremiumMemberFineStrategy;
import low_level_design.LibraryManagementSystem.strategy.fine.StandardFineStrategy;

public final class FineStrategyFactory {
    private FineStrategyFactory() {
    }

    public static FineStrategy getStrategy(MemberType memberType) {
        return switch (memberType) {
            case STANDARD -> StandardFineStrategy.INSTANCE;
            case PREMIUM -> PremiumMemberFineStrategy.INSTANCE;
        };
    }
}
