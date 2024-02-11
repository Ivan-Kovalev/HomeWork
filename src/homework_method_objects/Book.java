package homework_method_objects;

import java.util.Objects;

public class Book {

    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author authorBook, int yearPublicBook) {
        this.name = name;
        this.author = authorBook;
        this.yearOfPublication = yearPublicBook;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " + name + "\nГод публикации: " + yearOfPublication + "\n" + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

}
