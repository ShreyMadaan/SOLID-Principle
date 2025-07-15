package com.shrey.solid.version5;

public class SlackNotifier implements TextNotifier{
    @Override
    public void sendText(String message) {
        System.out.println("Slack: " + message);
    }
}
