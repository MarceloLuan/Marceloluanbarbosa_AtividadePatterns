package factory_method;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviado por EmailNotification: " + message);
    }
}
