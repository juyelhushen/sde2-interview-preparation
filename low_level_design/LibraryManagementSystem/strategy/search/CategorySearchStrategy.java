package low_level_design.LibraryManagementSystem.strategy.search;

import low_level_design.LibraryManagementSystem.entity.Book;
import low_level_design.LibraryManagementSystem.enums.BookCategory;

import java.util.List;

public class CategorySearchStrategy implements SearchStrategy{

    public static final CategorySearchStrategy INSTANCE = new CategorySearchStrategy();

    private CategorySearchStrategy() {
    }

    @Override
    public List<Book> search(List<Book> catalog, String query) {
       try {
           BookCategory target =  BookCategory.valueOf(query);
           return catalog.stream()
                   .filter(b -> b.getBookCategory() == target)
                   .toList();
       } catch (IllegalArgumentException e) {
           return List.of();
       }
    }
}
