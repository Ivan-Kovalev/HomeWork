package homework_method;

public class Task3 {

    public static int sumDayDelivery(int distance) {

        int totalDay = 0;
        if (distance <= 20) {
            totalDay++;
        } else if (distance > 20 && distance <= 60) {
            totalDay += 2;
        } else if (distance > 60 && distance <= 100) {
            totalDay += 3;
        }
        return totalDay;

    }

    public static void main(String[] args) {

        int deliveryDistance = 95;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + sumDayDelivery(deliveryDistance));
        } else {
            System.out.println("Доставки нет!");
        }

    }
}
