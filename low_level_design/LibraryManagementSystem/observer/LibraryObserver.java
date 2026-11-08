package low_level_design.LibraryManagementSystem.observer;

import low_level_design.LibraryManagementSystem.entity.Book;
import low_level_design.LibraryManagementSystem.entity.Member;

// Observer pattern — anything that wants to react to a book becoming
// available implements this. NotificationService registers one or more
// implementations (email, SMS) without Book or Library knowing they exist.
public interface LibraryObserver {
    void onBookAvailable(Book book, Member member);
}