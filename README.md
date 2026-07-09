# 🚂 Train Consist Management Application

## 📌 Use Case 18 - Linear Search Bogie by ID

### 📖 Description

This use case demonstrates the implementation of the **Linear Search** algorithm to locate a specific bogie ID in an unsorted collection. The algorithm traverses each bogie ID sequentially until the required ID is found or the entire collection has been searched.

---

## ✨ Features

- Store multiple bogie IDs
- Search for a bogie ID using the Linear Search algorithm
- Display whether the bogie ID is found
- Handle unsuccessful search operations

---

## ☕ Java Concepts Used

- Linear Search
- Arrays
- for Loop
- String Comparison (`equals()`)
- Conditional Statements
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the linear search operation.

### TrainService.java

Implements the following method:

- `linearSearchBogieId()`

---

## ▶️ Expected Output

### Bogie ID Found

```text
========= Linear Search =========

Searching for Bogie ID : BG310

Result : Bogie ID Found
```

### Bogie ID Not Found

```text
========= Linear Search =========

Searching for Bogie ID : BG999

Result : Bogie ID Not Found
```

---

## 📁 Branch

```text
feature/linear-search-bogie-id
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Implement the Linear Search algorithm
- Traverse an array sequentially
- Compare string values using `equals()`
- Determine whether a search key exists in a collection
- Understand the time complexity of Linear Search

---

## 🚀 Search Process

| Step | Current Bogie ID | Search Key | Result |
|------|------------------|------------|--------|
| 1 | BG101 | BG310 | Not Matched |
| 2 | BG205 | BG310 | Not Matched |
| 3 | BG310 | BG310 | ✅ Found |
| 4 | Search Stops | — | Completed |

---

## ⏱️ Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | **O(1)** |
| Average Case | **O(n)** |
| Worst Case | **O(n)** |

---

## 👨‍💻 Author

**Ariyan Pujari**
