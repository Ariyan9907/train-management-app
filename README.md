# 🚂 Train Consist Management Application

## 📌 Use Case 2 - Manage Passenger Bogies Using ArrayList

### 📖 Description

This use case demonstrates how to manage passenger bogies using Java's **ArrayList**. It covers basic collection operations such as adding, removing, searching, and displaying bogies while preserving insertion order.

---

## ✨ Features

- Initialize passenger bogies
- Add new passenger bogies
- Remove an existing bogie
- Check if a bogie exists
- Display all passenger bogies

---

## ☕ Java Concepts Used

- ArrayList
- add()
- remove()
- contains()
- Enhanced for-loop
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes passenger bogie management methods.
- Displays the application output.

### Train.java

- Stores passenger bogies using an `ArrayList<String>`.

### TrainService.java

Implements the following methods:

- `addPassengerBogies()`
- `displayBogies()`
- `removePassengerBogie()`
- `checkPassengerBogie()`

---

## ▶️ Expected Output

```text
======================================
 Train Consist Management App
======================================

Train initialized successfully.

========= Train Summary =========
Current Bogie Count : 0

Passenger bogies added successfully.

Current Passenger Bogies:
Sleeper
AC Chair
First Class

Removed Bogie : AC Chair

Sleeper is available.

Current Passenger Bogies:
Sleeper
First Class
```

---

## 📁 Branch

```text
feature/manage-passenger-bogies
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Store elements dynamically using `ArrayList`
- Add and remove elements from a collection
- Search elements using `contains()`
- Iterate through collections using an enhanced `for` loop
- Apply collection operations in a real-world train management scenario

---

## 👨‍💻 Author

**Ariyan Pujari**
