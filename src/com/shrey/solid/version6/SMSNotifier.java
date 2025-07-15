package com.shrey.solid.version6;

public class SMSNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
