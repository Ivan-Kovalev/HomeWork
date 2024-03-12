package homework_oop_v2;

public class Truck extends Transport implements Serviceable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(Transport truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
            System.out.println("Проверяем двигатель");
            System.out.println("Проверяем прицеп");
        }
    }
}
