# 🚂 Train Consist Management Application

## 📌 Use Case 3 - Track Unique Bogie IDs Using HashSet

### 📖 Description

This use case demonstrates how to use Java's **HashSet** to manage unique bogie IDs. It ensures that duplicate IDs are automatically ignored while storing only distinct bogie identifiers.

---

## ✨ Features

- Create a collection of bogie IDs
- Add unique bogie IDs
- Prevent duplicate entries
- Display all unique bogie IDs

---

## ☕ Java Concepts Used

- HashSet
- add()
- Enhanced for-loop
- Java Collections Framework
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes HashSet-based bogie ID management methods.
- Displays the list of unique bogie IDs.

### Train.java

- Stores bogie IDs using a `HashSet<String>`.

### TrainService.java

Implements the following methods:

- `addBogieIds()`
- `displayUniqueBogieIds()`

---

## ▶️ Expected Output

```text
Bogie IDs added successfully.

========= Unique Bogie IDs =========

BG101
BG102
BG103
```

> **Note:** The display order may vary because `HashSet` does **not** maintain insertion order.

---

## 📁 Branch

```text
feature/track-unique-bogie-ids
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Store only unique elements using `HashSet`
- Automatically eliminate duplicate entries
- Iterate through a `HashSet`
- Choose `HashSet` when uniqueness is more important than insertion order

---

## 👨‍💻 Author

**Ariyan Pujari**
