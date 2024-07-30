import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Libary {
    private List<Books> books;

    public Libary() {
        books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    // Linear search by title
    public Books linearSearchByTitle(String title) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (requires sorting the list first)
    public Books binarySearchByTitle(String title) {
        // Sort the list by title
        Collections.sort(books, Comparator.comparing(Books::getTitle, String.CASE_INSENSITIVE_ORDER));

        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return books.get(mid);
            }
            if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
