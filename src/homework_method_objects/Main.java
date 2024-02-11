package homework_method_objects;

public class Main {

    public static void main(String[] args) {

        Author john = new Author("John", "Jones");
        Author diana = new Author("Diana", "Jones");

        Book blueBook = new Book("Blue", john, 2021);
        System.out.println(blueBook + "\n");

        Book greenBook = new Book("Green", diana, 2023);
        System.out.println(greenBook);

        if (blueBook.equals(greenBook)) {
            System.out.println("\nЭто одна и та же книга");
        }

        if (john.equals(diana)) {
            System.out.println("\nКниги одного автора");
        }

    }

}
