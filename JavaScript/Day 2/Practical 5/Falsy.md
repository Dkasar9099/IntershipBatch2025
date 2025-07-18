# 🚫 Falsy Values in JavaScript

## 📘 What Are Falsy Values?

In JavaScript, a **falsy value** is a value that is **considered false** when evaluated in a **Boolean context** (like inside `if` statements or logical conditions).

---

## ❌ List of Falsy Values

There are **only 7** values in JavaScript that are considered **falsy**:

| Falsy Value | Description                          |
|-------------|--------------------------------------|
| `false`     | The Boolean value false              |
| `0`         | The number zero                      |
| `-0`        | Negative zero                        |
| `""`        | Empty string (single or double quotes) |
| `null`      | Absence of any value                 |
| `undefined` | A declared variable with no value    |
| `NaN`       | Not a Number (invalid number result) |

---

## ✅ Truthy vs Falsy

- Any value **not listed above** is considered **truthy**.
- Falsy values are commonly used in **conditionals** to control program flow.

---

## 🧠 Use Case Example (Concept)

If a variable holds a falsy value, it behaves like `false`:


---

## ⚠️ Important Notes

- Strings with content like `"0"` or `"false"` are **truthy**, because they are non-empty.
- Objects (`{}`) and arrays (`[]`) are also **truthy**, even if empty.

---

## ✅ Summary

- Falsy values behave like `false` in Boolean logic.
- Knowing them helps avoid unexpected behavior in conditional checks.
- JavaScript automatically converts values to Boolean in logical operations.

