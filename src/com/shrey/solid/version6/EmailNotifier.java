package com.shrey.solid.version6;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
