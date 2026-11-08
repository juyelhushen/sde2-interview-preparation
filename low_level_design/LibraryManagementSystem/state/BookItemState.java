package low_level_design.LibraryManagementSystem.state;

import low_level_design.LibraryManagementSystem.entity.BookItem;
import low_level_design.LibraryManagementSystem.enums.BookItemStatus;

public interface BookItemState {

    // Each method either performs the transition on the item
    // (by calling item.setState(nextState)) or throws if the
    // transition is illegal from this state.
    void reserve(BookItem item);
    void borrow(BookItem item);
    void returnBook(BookItem item);
    void reportLost(BookItem item);

    BookItemStatus getStatus();

}
