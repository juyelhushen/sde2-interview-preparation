package low_level_design.splitwise.repository;

import low_level_design.splitwise.entity.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository {
    void save(Expense expense);
    Optional<Expense> findById(String expenseId);
    List<Expense> findByGroupId(String groupId);
    List<Expense> findByPayerId(String payerId);
}
