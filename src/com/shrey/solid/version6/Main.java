package com.shrey.solid.version6;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Notifier> notifiers = new HashMap<>();
        notifiers.put("EMAIL", new EmailNotifier());
        notifiers.put("SMS", new SMSNotifier());
        notifiers.put("PUSH", new PushNotifier());

        NotificationService service = new NotificationService(notifiers);

        service.sendNotification("EMAIL", "Welcome!");
        service.sendNotification("SMS", "Your OTP is 123456");
        service.sendNotification("PUSH", "You’ve got a new update!");
        service.sendNotification("WHATSAPP", "Unsupported!");
    }
}