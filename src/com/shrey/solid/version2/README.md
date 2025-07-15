# Version 2 – Applying Single Responsibility Principle (SRP)

### ✅ What Changed:
Each notification type (Email, SMS, Push) has its own class: `EmailService`, `SMSService`, and `PushService`.

The `NotificationService` is now responsible only for coordinating them.

### ✅ SRP Applied:
- Each class has **one reason to change**.
- Separation of concerns is clear.
- Code becomes more maintainable and testable.

This is the first major step toward a SOLID design.
