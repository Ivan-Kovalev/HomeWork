package homework_OOP;

public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 20, 11, 15, 15, 20),
                new Gryffindor("Гермиона Грейнджер", 16, 20, 10, 12, 12),
                new Gryffindor("Рон Уизли", 11, 0, 15, 15, 15)
        };

        Slytherin[] slytherin = {
                new Slytherin("Драко Малфой", 15, 10, 15, 2, 5, 10, 15),
                new Slytherin("Грэхэм Монтегю", 10, 0, 10, 8, 5, 10, 5),
                new Slytherin("Грегори Гойл", 9, 0, 10, 5, 5, 10, 5),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария Смит", 12, 10, 10, 15, 16),
                new Hufflepuff("Седрик Диггори", 16, 20, 20, 20, 15),
                new Hufflepuff("Джастин Финч-Флетчли", 12, 20, 15, 20, 16),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 10, 5, 5, 5, 10, 15),
                new Ravenclaw("Падма Патил", 11, 15, 16, 20, 10, 15),
                new Ravenclaw("Маркус Белби", 15, 12, 10, 10, 10, 15),
        };

        PrintStudent printStudent = new PrintStudent();
        printStudent.print(gryffindor);
        printStudent.print(slytherin);
        printStudent.print(hufflepuff);
        printStudent.print(ravenclaw);

        CompareStudent compareStudent = new CompareStudent();
        compareStudent.compare(gryffindor);
        compareStudent.compare(slytherin);
        compareStudent.compare(hufflepuff);
        compareStudent.compare(ravenclaw);
    }
}
