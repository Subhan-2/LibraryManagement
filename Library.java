import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
     private List<Book> books = new ArrayList<>();
    private Map<String, List<String>> borrowedBooks = new HashMap<>(); 

    
    public void addBook(Book book) {
        books.add(book);
    }


    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    // Search for books by title, author, or ISBN
    public List<Book> searchBooks(String query) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(query) || book.getAuthor().contains(query) || book.getISBN().equals(query)) {
                results.add(book);
            }
        }
        return results;
    }

    // Checkout a book
    public boolean checkoutBook(String patronId, String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.isAvailable()) {
                book.setAvailable(false);
                borrowedBooks.computeIfAbsent(patronId, k -> new ArrayList<>()).add(ISBN);
                return true;
            }
        }
        return false;
    }

    // Return a book
    public boolean returnBook(String patronId, String ISBN) {
        if (borrowedBooks.containsKey(patronId) && borrowedBooks.get(patronId).contains(ISBN)) {
            for (Book book : books) {
                if (book.getISBN().equals(ISBN)) {
                    book.setAvailable(true);
                    borrowedBooks.get(patronId).remove(ISBN);
                    return true;
                }
            }
        }
        return false;
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book + " - Available: " + book.isAvailable());
}
}


    
}
