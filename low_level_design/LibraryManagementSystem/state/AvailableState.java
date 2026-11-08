package low_level_design.LibraryManagementSystem.state;

import low_level_design.LibraryManagementSystem.entity.BookItem;
import low_level_design.LibraryManagementSystem.enums.BookItemStatus;
import low_level_design.LibraryManagementSystem.exception.InvalidStateTransitionException;

public class AvailableState implements BookItemState {

    @Override
    public void reserve(BookItem item) {
        item.setState(new ReserveState());
    }

    @Override
    public void borrow(BookItem item) {
        item.setState(new BorrowState());
    }

    @Override
    public void returnBook(BookItem item) {
        throw new InvalidStateTransitionException("Cannot return a book that is already available.");
    }

    @Override
    public void reportLost(BookItem item) {
        item.setState(new LostState());
    }

    @Override
    public BookItemStatus getStatus() {
        return BookItemStatus.AVAILABLE;
    }
}
