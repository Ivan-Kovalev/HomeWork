package homework_oop_v2;

public class ServiceStation {

    ActionForTransport actionForTransport = new ActionForTransport();

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                actionForTransport.updateTyre();
            }
            actionForTransport.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                actionForTransport.updateTyre();
            }
            actionForTransport.checkEngine();
            actionForTransport.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                actionForTransport.updateTyre();
            }
        }
    }
}
