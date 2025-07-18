# 🔢 Primitive Data Types in JavaScript

## 📘 What are Primitive Data Types?

Primitive data types are the **basic building blocks** of data in JavaScript.  
They represent **single values** and are **immutable**, meaning they cannot be altered once created.

---

## 🔹 List of Primitive Data Types

JavaScript has **7 primitive types**:

| Data Type     | Description                                        |
|---------------|----------------------------------------------------|
| `Number`      | Represents numeric values (integer or floating point) |
| `String`      | Represents a sequence of characters (text)         |
| `Boolean`     | Represents logical values: `true` or `false`       |
| `Null`        | Represents an intentional absence of value         |
| `Undefined`   | Represents a declared variable with no value       |
| `BigInt`      | Represents large integers beyond normal number limits |
| `Symbol`      | Represents a unique and immutable identifier       |

---

## 🧠 Characteristics of Primitives

- **Immutable**: Cannot be changed after creation.
- **Compared by value**, not by reference.
- Stored directly in memory.
- Each value is independent of others.

---

## 🧾 Description of Each Type

### ✅ Number
- Used for all numeric values (including decimals).
- Special numeric values include `Infinity`, `-Infinity`, and `NaN`.

### ✅ String
- Represents textual data.
- Defined using single (`'`), double (`"`), or backticks (`` ` ``).

### ✅ Boolean
- Only has two values: `true` or `false`.
- Commonly used in conditions and logic.

### ✅ Null
- Represents "no value" or "nothing".
- Intentionally assigned to indicate emptiness.

### ✅ Undefined
- A variable that has been declared but not assigned a value.
- Automatically assigned by JavaScript.

### ✅ BigInt
- Used for integers larger than the `Number` type can handle safely.
- Often used in financial, scientific, or cryptographic applications.

### ✅ Symbol
- Used to create unique identifiers (especially for object properties).
- Each symbol is guaranteed to be unique.

---

## ❗ Note

- Primitive types are **not objects**.
- Even though you can use methods on them (like `"text".toUpperCase()`), JavaScript temporarily wraps them in objects.

---

## ✅ Summary

| Type      | Example Values             |
|-----------|-----------------------------|
| Number    | 10, 3.14, -5, NaN           |
| String    | "Hello", 'World'           |
| Boolean   | true, false                |
| Null      | null                       |
| Undefined | undefined                  |
| BigInt    | Very large integers        |
| Symbol    | Unique identifiers         |

Primitive data types form the **foundation** of all data handling in JavaScript.
