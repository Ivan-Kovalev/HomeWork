package homework_method;

import java.time.LocalDate;

public class Task2 {
    public static void detectAppVersion(int typeOS, int yearOfIssue) {

        int currentYear = LocalDate.now().getYear();

        if (typeOS == 0 && yearOfIssue >= currentYear) {
            System.out.println("Установите обычную версию приложения для IOS");
        } else if (typeOS == 0 && yearOfIssue < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS");
        } else if (typeOS == 1 && yearOfIssue >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (typeOS == 1 && yearOfIssue < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android");
        } else {
            throw new RuntimeException("Неизвестная версия OS");
        }

    }

    public static void main(String[] args) {

        int typeOSPhone = 0;
        int yearOfIssuePhone = 2022;
        detectAppVersion(typeOSPhone, yearOfIssuePhone);

    }
}
