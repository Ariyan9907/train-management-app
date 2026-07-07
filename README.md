# 🚂 Train Consist Management Application

## 📌 Use Case 13 - Compare Loop and Stream Performance

### 📖 Description

This use case demonstrates how to compare the execution time of a traditional **for-each loop** and the **Java Stream API** using `System.nanoTime()`. It helps analyze the performance of different approaches for processing collections.

---

## ✨ Features

- Measure execution time using `System.nanoTime()`
- Filter passenger bogies using a traditional loop
- Filter passenger bogies using the Stream API
- Compare loop and stream execution times
- Display the performance results

---

## ☕ Java Concepts Used

- Stream API
- filter()
- Lambda Expressions
- System.nanoTime()
- Performance Measurement
- Enhanced for-loop

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the performance comparison method.

### TrainService.java

Implements the following method:

- `comparePerformance()`

---

## ▶️ Expected Output

```text
========= Performance Comparison =========

Loop Execution Time   : 6543 ns
Stream Execution Time : 8921 ns
```

> **Note:** The execution times will vary on every run depending on the system configuration and JVM optimizations.

---

## 📁 Branch

```text
feature/compare-loop-vs-stream-performance
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Measure execution time using `System.nanoTime()`
- Compare traditional loops with Stream API operations
- Analyze performance differences between two approaches
- Use Streams for concise and readable collection processing
- Apply performance testing in Java applications

---

## 🚀 Performance Comparison

| Approach | Purpose |
|----------|---------|
| Enhanced for-loop | Iterates through the collection manually |
| Stream API | Filters the collection using functional programming |

---

## 👨‍💻 Author

**Ariyan Pujari**
