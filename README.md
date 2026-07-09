# 🚂 Train Consist Management Application

## 📌 Use Case 15 - Safe Cargo Assignment Using try-catch-finally

### 📖 Description

This use case demonstrates how to safely assign cargo to a goods bogie using Java's **try-catch-finally** exception handling mechanism. It validates cargo assignments, handles invalid operations gracefully, and ensures that the cleanup process is always executed.

---

## ✨ Features

- Assign cargo to goods bogies
- Validate cargo assignment
- Handle invalid cargo assignments using exceptions
- Ensure execution of the `finally` block
- Display assignment status

---

## ☕ Java Concepts Used

- Exception Handling
- try
- catch
- finally
- IllegalArgumentException
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the safe cargo assignment method.

### TrainService.java

Implements the following method:

- `assignCargo()`

---

## ▶️ Expected Output

### Valid Cargo Assignment

```text
Cargo assigned successfully.

Bogie : Petroleum Tank
Cargo : Petroleum

Cargo assignment process completed.
```

### Invalid Cargo Assignment

```text
Error : Petroleum Tank can carry only Petroleum.

Cargo assignment process completed.
```

---

## 📁 Branch

```text
feature/safe-cargo-assignment
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Handle runtime exceptions using `try-catch`
- Execute cleanup code using the `finally` block
- Throw and catch `IllegalArgumentException`
- Validate user input before processing
- Build robust and fault-tolerant Java applications

---

## 🚀 Cargo Assignment Rules

| Bogie | Allowed Cargo | Status |
|--------|---------------|--------|
| Petroleum Tank | Petroleum | ✅ Allowed |
| Petroleum Tank | Coal | ❌ Not Allowed |
| Coal Wagon | Coal | ✅ Allowed |
| Coal Wagon | Petroleum | ✅ Allowed |

---

## 👨‍💻 Author

**Ariyan Pujari**
