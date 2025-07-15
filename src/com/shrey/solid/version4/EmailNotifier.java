package com.shrey.solid.version4;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending message with message:" + message);
    }
}
