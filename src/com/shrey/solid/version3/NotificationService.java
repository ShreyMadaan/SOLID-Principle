package com.shrey.solid.version3;
import java.util.HashMap;
import java.util.Map;

public class NotificationService {
    private final Map<String, Notifier> notifiers = new HashMap<>();

    public NotificationService() {
        notifiers.put("EMAIL", new EmailNotifier());
        notifiers.put("SMS", new SMSNotifier());
        notifiers.put("PUSH", new PushNotifier());
    }

    public void sendNotification(String type, String message) {
        Notifier notifier = notifiers.get(type.toUpperCase());
        if (notifier != null) {
            notifier.send(message);
        } else {
            System.out.println("Unsupported notification type: " + type);
        }
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification("EMAIL", "Welcome to the app!");
        service.sendNotification("SMS", "Your OTP is 123456");
        service.sendNotification("PUSH", "You have a new message.");
        service.sendNotification("WHATSAPP", "This type is unsupported.");
    }
}
