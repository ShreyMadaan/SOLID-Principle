# Version 5 – Applying Interface Segregation Principle (ISP)

### ✅ What Changed:
The `Notifier` interface was split into two smaller interfaces:
- `TextNotifier`
- `AttachmentNotifier`

Now, each class only implements what it needs.

### ✅ ISP Applied:
- No notifier is forced to implement unused methods.
- `SlackNotifier` only sends text.
- `EmailNotifier` supports attachments too.

Small, specific interfaces lead to cleaner, focused code.
