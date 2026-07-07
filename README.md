# 🚂 Train Consist Management Application

## 📌 Use Case 3 - Track Unique Bogie IDs Using HashSet

### 📖 Description

This use case demonstrates the use of Java's **HashSet** to maintain a collection of unique bogie IDs. Duplicate bogie IDs are automatically ignored, ensuring that every bogie in the train has a unique identifier.

---

## ✨ Features

- Create a collection of unique bogie IDs
- Add multiple bogie IDs
- Prevent duplicate bogie IDs
- Display all unique bogie IDs

---

## ☕ Java Concepts Used

- HashSet
- Java Collections Framework
- add()
- Enhanced for-loop
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes methods to add and display unique bogie IDs.

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

> **Note:** The order of the IDs may vary because **HashSet does not maintain insertion order**.

---

## 📁 Branch

```text
feature/track-unique-bogie-ids
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Store only unique elements using `HashSet`
- Eliminate duplicate entries automatically
- Iterate through a `HashSet`
- Understand that `HashSet` does not preserve insertion order
- Apply uniqueness constraints in a real-world train management system

---

## 🚀 Sample Bogie IDs

| Bogie ID | Status |
|----------|--------|
| BG101 | Added |
| BG102 | Added |
| BG103 | Added |
| BG101 | Ignored (Duplicate) |
| BG102 | Ignored (Duplicate) |

---

## 👨‍💻 Author

**Ariyan Pujari**
