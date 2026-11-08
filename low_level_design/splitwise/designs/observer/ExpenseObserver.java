package low_level_design.splitwise.designs.observer;

import low_level_design.splitwise.entity.Expense;
import low_level_design.splitwise.entity.User;

public interface ExpenseObserver {
    void onExpanseAdded(Expense expense, User payer);
}
