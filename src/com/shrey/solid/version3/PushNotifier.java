package com.shrey.solid.version3;

public class PushNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending push notification with message: " + message);
    }
}
