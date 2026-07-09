# 🚂 Train Consist Management Application

## 📌 Use Case 14 - Handle Invalid Bogie Capacity Using Custom Exception

### 📖 Description

This use case demonstrates how to create and use a **Custom Exception** to validate the seating capacity of a bogie. If an invalid capacity (less than or equal to zero) is provided, an `InvalidCapacityException` is thrown, ensuring that only valid bogie objects are created.

---

## ✨ Features

- Create a custom exception class
- Validate bogie seating capacity
- Throw an exception for invalid capacity
- Handle invalid input gracefully
- Prevent creation of invalid bogie objects

---

## ☕ Java Concepts Used

- Custom Exception
- Exception Handling
- throw
- throws
- try-catch
- Constructor Validation
- Object-Oriented Programming (OOP)

---

## 📂 Classes Modified

### TrainApplication.java

- Invokes the bogie creation process.

### Bogie.java

- Validates seating capacity inside the constructor.
- Throws `InvalidCapacityException` for invalid capacity.

### InvalidCapacityException.java

- Defines a custom exception for invalid bogie capacity.

### TrainService.java

Implements the following method:

- `addPassengerBogieObjects()`

---

## ▶️ Expected Output

### Valid Capacity

```text
Passenger bogies added successfully.
```

### Invalid Capacity

```text
Bogie capacity must be greater than zero.
```

---

## 📁 Branch

```text
feature/handle-invalid-bogie-capacity
```

---

## 📚 Learning Outcome

After completing this use case, you will understand how to:

- Create custom exceptions in Java
- Validate object data during construction
- Throw exceptions using the `throw` keyword
- Declare exceptions using the `throws` keyword
- Handle custom exceptions using `try-catch`
- Improve application reliability through input validation

---

## 🚀 Capacity Validation Rules

| Capacity | Result |
|----------|--------|
| Greater than 0 | ✅ Bogie Created |
| Less than or Equal to 0 | ❌ InvalidCapacityException Thrown |

---

## 👨‍💻 Author

**Ariyan Pujari**
