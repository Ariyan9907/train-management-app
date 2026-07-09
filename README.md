# 🚂 Train Consist Management Application

## 📌 Use Case 9 - Group Bogies by Type Using Stream API

### 📖 Description

This use case demonstrates how to group bogies based on their type using Java Stream API and the `Collectors.groupingBy()` collector. It organizes passenger and goods bogies into separate groups, making data processing and reporting more efficient.

---

## ✨ Features

- Store passenger and goods bogies
- Group bogies based on their type
- Display grouped bogies
- Demonstrate data grouping using Stream API

---

## ☕ Java Concepts Used

- Stream API
- Collectors.groupingBy()
- Lambda Expressions
- HashMap
- List
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the bogie grouping operation.

### Bogie.java

- Stores bogie details including:
  - Name
  - Capacity
  - Type

### TrainService.java

Implements the following method:

- `groupBogiesByType()`

---

## ▶️ Expected Output

```text
========= Grouped Bogies =========

Passenger

Sleeper --> 72 Seats
AC Chair --> 56 Seats
First Class --> 24 Seats

Goods

Coal Wagon --> 120 Seats
Petroleum Tank --> 150 Seats
```

---

## 📁 Branch

```text
feature/group-bogies-by-type
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Group collection elements using `Collectors.groupingBy()`
- Process collections using Java Stream API
- Organize data based on object properties
- Use lambda expressions for grouping operations
- Apply grouping techniques in real-world Java applications

---

## 🚀 Grouping Example

| Bogie Name | Type | Group |
|------------|------|-------|
| Sleeper | Passenger | Passenger |
| AC Chair | Passenger | Passenger |
| First Class | Passenger | Passenger |
| Coal Wagon | Goods | Goods |
| Petroleum Tank | Goods | Goods |

---

## 👨‍💻 Author

**Ariyan Pujari**
