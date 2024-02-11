package homework;

public class Main {
    public static void main(String[] args) {

        Author john = new Author("John", "Jones");
        Author diana = new Author("Diana", "Jones");

        Book blue = new Book("Blue", john, 2021);
        System.out.println("Название книги - " + blue.getBookName());
        System.out.println("Автор книги - " + john.getAuthorFirsName() + " " + john.getAuthorSurname());
        System.out.println("Год публикации: " + blue.getYearPublicBook());

        System.out.println();

        Book green = new Book("Green", diana, 2023);
        System.out.println("Название книги - " + green.getBookName());
        System.out.println("Автор книги - " + diana.getAuthorFirsName() + " " + diana.getAuthorSurname());
        System.out.println("Год публикации: " + green.getYearPublicBook());

        green.setYearPublicBook(2024);

        System.out.println("Переиздание: " + green.getYearPublicBook());

    }
}
