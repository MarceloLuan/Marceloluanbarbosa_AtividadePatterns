package factory_method;

public class PushNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
