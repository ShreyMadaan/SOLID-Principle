package com.shrey.solid.version4;

public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
