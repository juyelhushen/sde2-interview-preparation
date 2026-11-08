package low_level_design.LibraryManagementSystem.observer;

import low_level_design.LibraryManagementSystem.entity.Book;
import low_level_design.LibraryManagementSystem.entity.Member;

public class SMSNotificationObserver implements LibraryObserver {

    @Override
    public void onBookAvailable(Book book, Member member) {
        System.out.printf("  [SMS] To: %s | Your reserved book '%s' is ready.%n",
                member.getPhone(), book.getTitle());
    }
}