# 🚂 Train Consist Management Application

## 📌 Use Case 8 - Filter Passenger Bogies Using Stream API

### 📖 Description

This use case demonstrates how to filter passenger bogies using the Java **Stream API**. It retrieves only the bogies whose seating capacity is greater than a specified value, showcasing the use of the `filter()` intermediate operation.

---

## ✨ Features

- Store passenger bogies
- Filter bogies based on seating capacity
- Display high-capacity passenger bogies
- Demonstrate collection filtering using Stream API

---

## ☕ Java Concepts Used

- Stream API
- filter()
- Lambda Expressions
- List
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the passenger bogie filtering operation.

### Bogie.java

- Stores passenger bogie details including:
  - Name
  - Capacity

### TrainService.java

Implements the following method:

- `filterPassengerBogies()`

---

## ▶️ Expected Output

```text
========= High Capacity Passenger Bogies =========

Sleeper --> 72 Seats
```

---

## 📁 Branch

```text
feature/filter-passenger-bogies
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Filter collections using the Stream API
- Use the `filter()` intermediate operation
- Apply lambda expressions for conditional filtering
- Process collections in a functional programming style
- Improve code readability using streams

---

## 🚀 Filtering Example

| Bogie Name | Capacity | Result |
|------------|---------:|--------|
| Sleeper | 72 | ✅ Included |
| AC Chair | 56 | ❌ Filtered Out |
| First Class | 24 | ❌ Filtered Out |

---

## 👨‍💻 Author

**Ariyan Pujari**
