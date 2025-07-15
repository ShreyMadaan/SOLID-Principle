package com.shrey.solid.version2;

public class NotificationService {
    private final EmailService emailService = new EmailService();
    private final SMSService smsService = new SMSService();
    private final PushService pushService = new PushService();

    public void sendNotification(String type, String message) {
        switch (type.toUpperCase()) {
            case "EMAIL" -> emailService.send(message);
            case "SMS" -> smsService.send(message);
            case "PUSH" -> pushService.send(message);
            default -> System.out.println("Unsupported notification type: " + type);
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
