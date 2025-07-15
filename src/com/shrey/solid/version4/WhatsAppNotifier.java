package com.shrey.solid.version4;

public class WhatsAppNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp message with message: " + message);
    }
}
