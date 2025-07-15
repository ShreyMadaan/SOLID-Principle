package com.shrey.solid.version5;

public class SMSNotifier implements TextNotifier{
    @Override
    public void sendText(String message) {
        System.out.println("SMS: " + message);
    }
}
