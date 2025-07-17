# 🔤 String Indexing in JavaScript

## 📌 What is String Indexing?

String indexing means accessing individual **characters** in a string using their **position** (index).  
In JavaScript, strings are treated like arrays of characters, and each character has a numeric **index** starting from **0**.

---

## 🔢 Index Positions

- The **first character** of a string is at index **0**.
- The **last character** is at index **length - 1**.
- Indexing goes **left to right**.

Example (conceptually):

Index: 0 1 2 3 4
String: H E L L O


---

## 🧭 Accessing Characters

- You can access a specific character using its index.
- Indexes must be **non-negative integers**.
- If an index is **out of range**, it returns **undefined** (nothing).

---

## 📌 Important Points

- String indexing is **read-only** — you cannot change a character directly using its index.
- JavaScript strings are **immutable**, meaning once created, their characters cannot be altered individually.
- You can loop through a string using indexes to analyze or extract specific characters.

---

## ✅ Summary

- Indexing starts at **0**.
- Used to **read characters** from a string.
- Strings are **immutable** — they cannot be changed by index.

