public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Effective Java", "Joshua Bloch", "123456789", 2018));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "987654321", 2008));

        // Display books
        System.out.println("Available Books:");
        library.displayBooks();

        // Add a patron
        patron patron = new patron("Sourav Pandey", "P1001");
        System.out.println("\n" + patron);

        // Checkout a book
        System.out.println("\nChecking out 'Effective Java'...");
        if (library.checkoutBook(patron.getId(), "123456789")) {
            System.out.println("Checkout successful!");
        } else {
            System.out.println("Checkout failed!");
        }

        // Display books after checkout
        System.out.println("\nBooks after checkout:");
        library.displayBooks();

        // Return a book
        System.out.println("\nReturning 'Effective Java'...");
        if (library.returnBook(patron.getId(), "123456789")) {
            System.out.println("Return successful!");
        } else {
            System.out.println("Return failed!");
        }
// Display books after return
System.out.println("\nBooks after return:");
library.displayBooks();
}

    
}
