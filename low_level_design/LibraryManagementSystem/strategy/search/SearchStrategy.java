package low_level_design.LibraryManagementSystem.strategy.search;

import low_level_design.LibraryManagementSystem.entity.Book;
import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> catalog, String query);
}
