public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return isAvailable; }
    
    public void setAvailable(boolean available) { this.isAvailable = available; }

    @Override
    public String toString() {
        return title + " by " + author + " (" + publicationYear + ") - ISBN:"+ISBN;
    }
}
    

