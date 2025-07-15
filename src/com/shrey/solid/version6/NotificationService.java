package com.shrey.solid.version6;

import java.util.Map;

public class NotificationService {
    private final Map<String, Notifier> notifierMap;

    // Dependencies are injected from outside
    public NotificationService(Map<String, Notifier> notifierMap) {
        this.notifierMap = notifierMap;
    }

    public void sendNotification(String type, String message) {
        Notifier notifier = notifierMap.get(type.toUpperCase());
        if (notifier != null) {
            notifier.send(message);
        } else {
            System.out.println("Unsupported notification type: " + type);
        }
    }
}
