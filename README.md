# 🚂 Train Consist Management Application

## 📌 Use Case 20 - Defensive Programming Using IllegalStateException

### 📖 Description

This use case demonstrates the concept of **Defensive Programming** by validating the train's state before performing operations. If the train is not in a valid state (for example, it contains no bogies), an `IllegalStateException` is thrown to prevent invalid operations and ensure the application's reliability.

---

## ✨ Features

- Validate the train before performing operations
- Throw `IllegalStateException` for invalid train states
- Prevent operations on an empty train
- Handle runtime exceptions gracefully
- Improve application robustness

---

## ☕ Java Concepts Used

- Defensive Programming
- IllegalStateException
- Exception Handling
- try-catch
- Runtime Exceptions
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the train status validation method.
- Handles `IllegalStateException` using a `try-catch` block.

### TrainService.java

Implements the following method:

- `checkTrainStatus()`

---

## ▶️ Expected Output

### Valid Train State

```text
Train is ready for operation.
```

### Invalid Train State

```text
Train has no bogies. Operation cannot continue.
```

---

## 📁 Branch

```text
feature/defensive-programming
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Apply defensive programming principles
- Validate object state before performing operations
- Throw `IllegalStateException` for invalid runtime conditions
- Handle runtime exceptions effectively
- Build reliable and fault-tolerant Java applications

---

## 🚀 Validation Rules

| Train State | Result |
|-------------|--------|
| Train contains one or more bogies | ✅ Train is ready for operation |
| Train contains no bogies | ❌ IllegalStateException is thrown |

---

## 👨‍💻 Author

**Ariyan Pujari**
