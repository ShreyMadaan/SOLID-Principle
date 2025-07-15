# Version 1 – Tightly Coupled Notification System

This is the most basic version of the Notification System.

### 🔍 Description:
All logic (Email, SMS, Push) is tightly coupled within a single `NotificationService` class using `if-else` conditions.

### ❌ SOLID Violations:
- **SRP (Single Responsibility Principle)**: One class handles all notification types.
- **OCP (Open/Closed Principle)**: To add a new type (e.g., WhatsApp), you must modify existing code.
- **DIP (Dependency Inversion Principle)**: Depends directly on low-level logic.

This version serves as a starting point before refactoring the system into cleaner components.
