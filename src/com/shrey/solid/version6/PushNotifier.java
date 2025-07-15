package com.shrey.solid.version6;

public class PushNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}
