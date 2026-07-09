# 🚂 Train Consist Management Application

## 📌 Use Case 6 - Map Bogie Capacity Using HashMap

### 📖 Description

This use case demonstrates how to use Java's **HashMap** to map each bogie to its seating capacity. It stores bogie names as keys and their corresponding capacities as values, enabling efficient retrieval and management of capacity information.

---

## ✨ Features

- Store bogie names with their seating capacities
- Retrieve seating capacity using the bogie name
- Display all bogie-capacity mappings
- Demonstrate key-value pair storage using `HashMap`

---

## ☕ Java Concepts Used

- HashMap
- Map Interface
- put()
- entrySet()
- Enhanced for-loop
- Java Collections Framework
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the bogie capacity mapping methods.
- Displays the bogie-capacity details.

### Train.java

- Stores bogie capacities using a `HashMap<String, Integer>`.

### TrainService.java

Implements the following methods:

- `addBogieCapacity()`
- `displayBogieCapacity()`

---

## ▶️ Expected Output

```text
Bogie capacities added successfully.

========= Bogie Capacity =========

Sleeper --> 72 Seats
AC Chair --> 56 Seats
First Class --> 24 Seats
```

> **Note:** The order of the entries may vary because **HashMap does not preserve insertion order**.

---

## 📁 Branch

```text
feature/map-bogie-capacity
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Store data as key-value pairs using `HashMap`
- Associate bogie names with their seating capacities
- Traverse a `HashMap` using `entrySet()`
- Retrieve values efficiently using keys
- Apply `HashMap` for real-world data mapping scenarios

---

## 🚀 Sample Bogie Capacity Mapping

| Bogie Name | Seating Capacity |
|------------|-----------------:|
| Sleeper | 72 Seats |
| AC Chair | 56 Seats |
| First Class | 24 Seats |

---

## 👨‍💻 Author

**Ariyan Pujari**
