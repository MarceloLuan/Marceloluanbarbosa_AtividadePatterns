package factory_method;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
