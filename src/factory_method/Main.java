package factory_method;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailNotificationFactory());

        NotificationService smsService = new NotificationService(new SMSNotificationFactory());

        NotificationService pushService = new NotificationService(new PushNotificationFactory());

        emailService.sendNotification("Bem-vindo ao sistema!");
        smsService.sendNotification("Bem-vindo ao sistema!");
        pushService.sendNotification("Bem-vindo ao sistema!");
    }
}
