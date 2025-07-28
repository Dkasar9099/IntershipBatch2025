# 📌 Introduction to Events in JavaScript

## ✅ What is an Event?

An **event** is an action or occurrence that happens in the browser — like a user clicking a button, typing in a form field, or moving the mouse.

JavaScript can "listen" for these events and respond using **event handlers**.

---

## 🧠 Common Types of Events

| Event Type | Description                      |
|------------|----------------------------------|
| `click`    | Triggered when an element is clicked |
| `mouseover`| When the mouse pointer is over an element |
| `keydown`  | When a key is pressed             |
| `submit`   | When a form is submitted          |
| `load`     | When the page or resource finishes loading |

---

## ⚙️ Adding Event Listeners

### ✅ Using `addEventListener()`

```javascript
const button = document.getElementById("myBtn");

button.addEventListener("click", function () {
  alert("Button Clicked!");
});
