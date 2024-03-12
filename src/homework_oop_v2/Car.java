package homework_oop_v2;

public class Car extends Transport implements Serviceable{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(Transport car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
            System.out.println("Проверяем двигатель");
        }
    }

}
