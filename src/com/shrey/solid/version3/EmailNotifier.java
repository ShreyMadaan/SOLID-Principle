package com.shrey.solid.version3;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending message with message:" + message);
    }
}
