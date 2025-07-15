package com.shrey.solid.version5;

public class EmailNotifier implements TextNotifier,AttachmentNotifier{
    @Override
    public void sendAttachment(String filePath) {
        System.out.println("Email: Sending Attachment - " + filePath);
    }

    @Override
    public void sendText(String message) {
        System.out.println("Email: " + message);
    }
}
