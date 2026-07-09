# 🚂 Train Consist Management Application

## 📌 Use Case 18 - Search Bogie by ID Using Linear Search

### 📖 Description

This use case demonstrates the implementation of the **Linear Search** algorithm to search for a specific bogie ID in an unsorted collection. The algorithm traverses each element sequentially until the required bogie ID is found or the search reaches the end of the collection.

---

## ✨ Features

- Store multiple bogie IDs
- Search for a bogie ID using Linear Search
- Display whether the bogie ID exists
- Handle unsuccessful search operations

---

## ☕ Java Concepts Used

- Linear Search
- Arrays
- for Loop
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

### Bogie Found

```text
========= Linear Search =========

BG310 Found
```

### Bogie Not Found

```text
========= Linear Search =========

BG999 Not Found
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
- Traverse arrays sequentially
- Compare string values using `equals()`
- Determine whether a search key exists in a collection
- Apply searching techniques in real-world applications

---

## 🚀 Sample Search

| Bogie IDs | Search Key | Result |
|------------|------------|--------|
| BG101 | BG310 | ❌ Continue Searching |
| BG205 | BG310 | ❌ Continue Searching |
| BG310 | BG310 | ✅ Found |
| BG450 | BG310 | Search Stopped |
| BG512 | BG310 | Search Stopped |

---

## 👨‍💻 Author

**Ariyan Pujari**
