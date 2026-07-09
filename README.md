# 🚂 Train Consist Management Application

## 📌 Use Case 12 - Train Safety Compliance Check

### 📖 Description

This use case demonstrates how to validate the safety compliance of goods bogies using the Java Stream API. It ensures that cylindrical goods bogies are used only for transporting petroleum by applying the `allMatch()` terminal operation.

---

## ✨ Features

- Add passenger and goods bogies
- Validate safety rules for goods bogies
- Check cargo compatibility with bogie shape
- Display train safety compliance status

---

## ☕ Java Concepts Used

- Stream API
- filter()
- allMatch()
- Lambda Expressions
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the train safety compliance check.

### Bogie.java

- Stores additional properties such as:
  - Type
  - Shape
  - Cargo

### TrainService.java

Implements the following method:

- `checkSafetyCompliance()`

---

## ▶️ Expected Output

```text
========= Safety Compliance =========

Train is Safety Compliant.
```

If an invalid cargo assignment exists:

```text
========= Safety Compliance =========

Train is NOT Safety Compliant.
```

---

## 📁 Branch

```text
feature/safety-compliance-check
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Filter collections using the Stream API
- Validate every element using `allMatch()`
- Apply business rules using lambda expressions
- Model real-world safety constraints in Java
- Perform compliance checks on collections efficiently

---

## 🚀 Safety Rule

| Bogie Shape | Allowed Cargo | Status |
|-------------|---------------|--------|
| Cylindrical | Petroleum | ✅ Allowed |
| Cylindrical | Coal | ❌ Not Allowed |
| Rectangular | Coal | ✅ Allowed |
| Rectangular | Passengers | ✅ Allowed |

---

## 👨‍💻 Author

**Ariyan Pujari**
