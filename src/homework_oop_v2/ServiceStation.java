package homework_oop_v2;

public class ServiceStation {

    public void check(Serviceable transport) {
        if (transport != null) {
            transport.service();
        }
    }

}
