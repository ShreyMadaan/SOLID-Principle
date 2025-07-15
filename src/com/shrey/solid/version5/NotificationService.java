package com.shrey.solid.version5;

public class NotificationService {
    public static void main(String[] args) {
        TextNotifier email = new EmailNotifier();
        TextNotifier sms = new SMSNotifier();
        TextNotifier slack = new SlackNotifier();

        AttachmentNotifier emailAttachment = (AttachmentNotifier) email;

        email.sendText("Welcome via Email!");
        sms.sendText("OTP via SMS");
        slack.sendText("Slack message");

        emailAttachment.sendAttachment("invoice.pdf");
    }
}
