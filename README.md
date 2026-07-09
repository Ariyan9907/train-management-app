# 🚂 Train Consist Management Application

## 📌 Use Case 5 - Preserve Insertion Order Using LinkedHashSet

### 📖 Description

This use case demonstrates how to use Java's **LinkedHashSet** to store train bogies while preserving their insertion order and preventing duplicate entries. It combines the uniqueness of a `HashSet` with the ordered behavior of a linked list.

---

## ✨ Features

- Store train bogies in insertion order
- Prevent duplicate bogie entries
- Display bogies in the order they were added
- Demonstrate ordered collection management

---

## ☕ Java Concepts Used

- LinkedHashSet
- Java Collections Framework
- add()
- Enhanced for-loop
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the train formation methods.
- Displays the ordered train formation.

### Train.java

- Stores train bogies using a `LinkedHashSet<String>`.

### TrainService.java

Implements the following methods:

- `createTrainFormation()`
- `displayTrainFormation()`

---

## ▶️ Expected Output

```text
Train formation created successfully.

========= Train Formation =========

Engine
Sleeper
Cargo
Guard
```

> **Note:** Even if a duplicate bogie is added (for example, **Sleeper**), it is stored only once while maintaining the original insertion order.

---

## 📁 Branch

```text
feature/preserve-insertion-order
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Preserve insertion order using `LinkedHashSet`
- Prevent duplicate elements in a collection
- Iterate through an ordered set
- Choose `LinkedHashSet` when both uniqueness and insertion order are required
- Apply ordered collection management in a train consist application

---

## 🚀 Train Formation Example

| Added Bogie | Status |
|--------------|--------|
| Engine | ✅ Added |
| Sleeper | ✅ Added |
| Cargo | ✅ Added |
| Guard | ✅ Added |
| Sleeper | ❌ Ignored (Duplicate) |

### Final Train Formation

```text
Engine
Sleeper
Cargo
Guard
```

---

## 👨‍💻 Author

**Ariyan Pujari**
