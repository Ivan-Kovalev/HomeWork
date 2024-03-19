package homework_oop_v2;

public class Bicycle extends Transport implements Serviceable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
        }
    }

}
