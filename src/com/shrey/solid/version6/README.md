# Version 6 – Applying Dependency Inversion Principle (DIP)

### ✅ What Changed:
`NotificationService` no longer creates notifier objects.

Instead, it **depends on the abstraction** (`Notifier`) and receives dependencies via constructor injection (from `Main.java`).

### ✅ DIP Applied:
- High-level module (`NotificationService`) doesn't depend on low-level implementations.
- Both depend on abstractions.
- Easier to test, extend, and configure externally.

This version completes the SOLID refactoring journey.
