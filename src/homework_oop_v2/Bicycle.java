package homework_oop_v2;

public class Bicycle extends Transport implements Serviceable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(Transport bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
        }
    }
}
