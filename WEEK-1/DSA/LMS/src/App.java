public class App {
    public static void main(String[] args) {
        Libary library = new Libary(); // Fixed typo here

        // Adding books
        library.addBook(new Books(1, "Effective Java", "Joshua Bloch"));
        library.addBook(new Books(2, "OOP through C++", "Robert Martin"));
        library.addBook(new Books(3, "Design Patterns", "Erich Gamma"));

        // Display all books
        System.out.println("All Bookss in the Libary:");
        library.displayBooks();

        // Linear search by title
        String searchTitle = "OOP through C++";
        Books book = library.linearSearchByTitle(searchTitle);
        if (book != null) {
            System.out.println("\nLinear Search: Found - " + book);
        } else {
            System.out.println("\nLinear Search: Books not found.");
        }

        // Another linear search example
        String searchTitle2 = "x";
        Books book2 = library.linearSearchByTitle(searchTitle2);
        if (book2 != null) {
            System.out.println("\nLinear Search: Found - " + book2);
        } else {
            System.out.println("\nLinear Search: Books not found.");
        }

        // Binary search by title
        searchTitle = "Effective Java";
        book = library.binarySearchByTitle(searchTitle);
        if (book != null) {
            System.out.println("\nBinary Search: Found - " + book);
        } else {
            System.out.println("\nBinary Search: Books not found.");
        }

        // Another binary search example
        searchTitle2 = "y";
        book2 = library.binarySearchByTitle(searchTitle2);
        if (book2 != null) {
            System.out.println("\nBinary Search: Found - " + book2);
        } else {
            System.out.println("\nBinary Search: Books not found.");
        }
    }
}
