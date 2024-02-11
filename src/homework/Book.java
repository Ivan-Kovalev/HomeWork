package homework;

public class Book {

    private String bookName;
    private Author authorBook;
    private int yearPublicBook;

    public Book(String bookName, Author authorBook, int yearPublicBook) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.yearPublicBook = yearPublicBook;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearPublicBook() {
        return yearPublicBook;
    }

    public void setYearPublicBook(int yearPublicBook) {
        this.yearPublicBook = yearPublicBook;
    }


}
