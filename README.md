# 🚂 Train Consist Management Application

## 📌 Use Case 10 - Calculate Total Seating Capacity Using Stream API

### 📖 Description

This use case demonstrates how to calculate the **total seating capacity** of all passenger and goods bogies using Java Stream API. It utilizes the `map()` operation to extract capacities and the `reduce()` operation to compute the total seating capacity of the train.

---

## ✨ Features

- Store bogie capacities
- Extract capacities using `map()`
- Calculate total seating capacity using `reduce()`
- Display the total seating capacity
- Demonstrate functional programming with Stream API

---

## ☕ Java Concepts Used

- Stream API
- map()
- reduce()
- Method References
- Lambda Expressions
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the total seating capacity calculation.

### TrainService.java

Implements the following method:

- `calculateTotalSeatingCapacity()`

---

## ▶️ Expected Output

```text
========= Total Seating Capacity =========

Total Seats : 422
```

---

## 📁 Branch

```text
feature/calculate-total-seating-capacity
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Transform stream elements using `map()`
- Aggregate data using `reduce()`
- Calculate totals in a functional programming style
- Use method references for cleaner code
- Process collections efficiently using Java Stream API

---

## 🚀 Capacity Calculation

| Bogie | Capacity |
|--------|---------:|
| Sleeper | 72 |
| AC Chair | 56 |
| First Class | 24 |
| Coal Wagon | 120 |
| Petroleum Tank | 150 |
| **Total Seating Capacity** | **422** |

---

## 👨‍💻 Author

**Ariyan Pujari**
