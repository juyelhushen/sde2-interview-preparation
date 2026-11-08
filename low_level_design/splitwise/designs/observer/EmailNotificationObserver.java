package low_level_design.splitwise.designs.observer;

import low_level_design.splitwise.entity.Expense;
import low_level_design.splitwise.entity.User;

public class EmailNotificationObserver implements ExpenseObserver {

    @Override
    public void onExpanseAdded(Expense expense, User payer) {
        expense.getSplits().forEach(
                split -> {
                    if (!split.getUserId().equals(payer.getUserId())) {
                        System.out.printf("  [Email] %s added '%s'. You owe ₹%.2f%n",
                                payer.getName(), expense.getDescription(),
                                split.getAmount() / 100.0);
                    }
                }
        );
    }
}
