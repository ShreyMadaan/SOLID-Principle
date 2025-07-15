# Notification System – SOLID Principles in Java

This repository demonstrates how a simple Notification System evolves over time using the **SOLID principles** of object-oriented design.

Each version builds upon the previous one to improve structure, flexibility, and maintainability using one core principle at a time.

---

## 🧱 Project Structure

src/
└── com/
└── shrey/
└── solid/
├── version1/ // Tightly Coupled
├── version2/ // Single Responsibility Principle (SRP)
├── version3/ // Open/Closed Principle (OCP)
├── version4/ // Liskov Substitution Principle (LSP)
├── version5/ // Interface Segregation Principle (ISP)
└── version6/ // Dependency Inversion Principle (DIP)



---

## ✅ Versions Breakdown

| Version | Principle | Summary |
|--------|-----------|---------|
| **1** | ❌ No SOLID | All logic in a single class, tightly coupled |
| **2** | ✅ SRP | Each notification type has its own class |
| **3** | ✅ OCP | Easily extend notification types without modifying code |
| **4** | ✅ LSP | New notifiers can be substituted without breaking behavior |
| **5** | ✅ ISP | Interfaces are split so classes only implement what they need |
| **6** | ✅ DIP | High-level modules depend on abstractions, not concretions |

---

## 👨‍💻 Technologies

- Java 17+
- IntelliJ IDEA
- No frameworks — pure Java OOP

---

## 📂 How to Run

Each version has a `main()` method inside `NotificationService.java` or a `Main.java` class.

To test a version:

1. Open `src/com/shrey/solid/versionX`
2. Run the `main()` method

---

## 🧠 Motivation

Understanding and applying **SOLID principles** is essential for writing clean, scalable, and testable code. This project demonstrates exactly how to refactor and structure code incrementally toward better design.

---

## 💼 Author

**Shrey Madaan**  
[LinkedIn](www.linkedin.com/in/shrey-madaan-bb3167137) • [GitHub](https://github.com/ShreyMadaan)

---

## ⭐️ Star This Repo

If this helped you learn SOLID better or if you found it impressive — consider starring the repo!

