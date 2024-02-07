package homework_method_objects;

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
    public boolean equals(Object obj) {
        Book b2 = (Book) obj;
        return name.equals(b2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

}
