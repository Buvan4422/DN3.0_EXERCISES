public class Books {
    private int bookId;
    private String title;
    private String author;

    public Books(int bkID, String title, String author) {
        this.bookId = bkID;
        this.title = title;
        this.author = author;
    }

    public int getBkId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}