package adapter.examples.books;

/**
 * Cliente.
 */
public class Client {
    public static void main(String[] args) {
        Book book;
        book = new AdapterBook(new SimpleBook("Refactoring", "Martin Fowler"));
        System.out.println(book.getTitleAndAuthor());
    }
}
