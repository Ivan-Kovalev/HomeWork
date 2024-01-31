package homework_method;

public class Task1 {

    public static void detectLeapYear(int thisYear) {

        boolean leapYear = thisYear % 4 == 0 && thisYear % 100 != 0 || thisYear % 400 == 0;
        if (leapYear) {
            System.out.println(thisYear + " год - високосный год");
        } else {
            System.out.println(thisYear + " год - невисокосный год");
        }

    }

    public static void main(String[] args) {

        int year = 2024;
        detectLeapYear(year);

    }
}
