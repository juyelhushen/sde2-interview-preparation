package low_level_design.LibraryManagementSystem.service;

import low_level_design.LibraryManagementSystem.entity.Book;
import low_level_design.LibraryManagementSystem.entity.Member;
import low_level_design.LibraryManagementSystem.observer.LibraryObserver;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotificationService {

    private final List<LibraryObserver> observers = new CopyOnWriteArrayList<>();

    public void registerObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    public void notifyBookAvailable(Book book, Member member) {
        for (LibraryObserver observer : observers) {
            observer.onBookAvailable(book, member);
        }
    }

}
