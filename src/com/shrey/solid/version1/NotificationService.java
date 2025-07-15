package com.shrey.solid.version1;

public class NotificationService {

    public void sendNotification(String type, String message) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            System.out.println("Sending Email with message: " + message);
            // Email-specific logic here
        } else if ("SMS".equalsIgnoreCase(type)) {
            System.out.println("Sending SMS with message: " + message);
            // SMS-specific logic here
        } else if ("PUSH".equalsIgnoreCase(type)) {
            System.out.println("Sending Push Notification with message: " + message);
            // Push-specific logic here
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
