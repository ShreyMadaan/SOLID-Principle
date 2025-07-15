# Version 3 – Applying Open/Closed Principle (OCP)

### ✅ What Changed:
We introduced a common interface: `Notifier`.

All specific notifiers (`EmailNotifier`, `SMSNotifier`, `PushNotifier`) implement this interface.

The `NotificationService` uses a `Map<String, Notifier>` for extensibility.

### ✅ OCP Applied:
- System is **open for extension** but **closed for modification**.
- New types (e.g., `WhatsAppNotifier`) can be added without modifying existing code.

No more `if-else` logic — behavior is now polymorphic.
