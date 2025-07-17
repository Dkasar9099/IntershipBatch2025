# 🧮 Variable Keywords in JavaScript

In JavaScript, you can declare variables using **three main keywords**: `var`, `let`, and `const`. Each keyword has specific rules and behaviors.

---

## 🔹 1. `var`

- Introduced in **ES5 (1999)**.
- Has **function-level scope**.
- Allows **re-declaration and re-assignment**.
- Gets **hoisted** (moved to the top), but initialized as `undefined`.

**Usage**: Generally avoided in modern JavaScript due to scope issues.

---

## 🔹 2. `let`

- Introduced in **ES6 (2015)**.
- Has **block-level scope** (inside `{ }`).
- Allows **re-assignment**, but **not re-declaration** in the same scope.
- Hoisted but **not initialized** (results in error if accessed before declaration).

**Usage**: Used when variable value is expected to change.

---

## 🔹 3. `const`

- Introduced in **ES6 (2015)**.
- Has **block-level scope**.
- **Cannot be re-assigned or re-declared**.
- Must be **initialized at the time of declaration**.

**Usage**: Used for values that should remain constant (like configuration settings or fixed values).

---

## 🧾 Summary Table

| Feature         | `var`           | `let`           | `const`         |
|-----------------|------------------|------------------|------------------|
| Scope           | Function          | Block            | Block            |
| Re-declaration  | ✅ Yes            | ❌ No            | ❌ No            |
| Re-assignment   | ✅ Yes            | ✅ Yes           | ❌ No            |
| Hoisting        | ✅ Yes (undefined) | ✅ Yes (TDZ*)     | ✅ Yes (TDZ*)     |
| Initialization  | Optional         | Optional         | Required         |

> **TDZ**: Temporal Dead Zone — accessing the variable before declaration causes an error.

---

## ✅ Best Practices

- Use `let` for values that may change.
- Use `const` for fixed values.
- Avoid using `var` in modern JavaScript.

---
