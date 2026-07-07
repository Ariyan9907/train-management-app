# 🚂 Train Consist Management Application

## 📌 Use Case 4 - Maintain Ordered Train Consist Using LinkedList

### 📖 Description

This use case demonstrates how to use Java's **LinkedList** to maintain the ordered sequence of bogies in a train. It performs insertion, deletion, and traversal operations while preserving the order of the train consist.

---

## ✨ Features

- Create an ordered train consist
- Add bogies to the train
- Insert a Pantry Car at a specific position
- Remove the first and last bogies
- Display the updated train consist

---

## ☕ Java Concepts Used

- LinkedList
- add()
- add(index, element)
- removeFirst()
- removeLast()
- Enhanced for-loop
- Java Collections Framework
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes LinkedList operations.
- Displays the final train consist.

### Train.java

- Stores the train consist using a `LinkedList<String>`.

### TrainService.java

Implements the following methods:

- `createTrainConsist()`
- `insertPantryCar()`
- `removeFirstAndLastBogie()`
- `displayTrainConsist()`

---

## ▶️ Expected Output

```text
Train consist created successfully.

Pantry Car inserted successfully.

First and Last bogies removed.

========= Ordered Train Consist =========

Sleeper
Pantry Car
AC
Cargo
```

---

## 📁 Branch

```text
feature/maintain-ordered-train-consist
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Maintain ordered data using `LinkedList`
- Insert elements at a specific position
- Remove the first and last elements efficiently
- Traverse a linked list using an enhanced `for` loop
- Apply `LinkedList` operations in a real-world train management scenario

---

## 👨‍💻 Author

**Ariyan Pujari**
```
