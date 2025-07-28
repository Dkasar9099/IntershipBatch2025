# ⏳ Asynchronous JavaScript – A Complete Guide

JavaScript is single-threaded and synchronous by default, but we often deal with tasks that take time (e.g., network requests, timers). Asynchronous code allows us to run such operations **without blocking the main thread**.

---

## 🔁 1. Callback Functions

A **callback** is a function passed as an argument to another function to be executed later.

### ✅ Example:

```javascript
function greetUser(name, callback) {
  console.log("Hi " + name);
  callback();
}

function sayBye() {
  console.log("Goodbye!");
}

greetUser("Alice", sayBye);


❌ Callback Hell (Pyramid of Doom)

doTask1(() => {
  doTask2(() => {
    doTask3(() => {
      console.log("Done");
    });
  });
});


📦 2. Promises
A Promise is an object representing the eventual completion or failure of an asynchronous task.

🔹 Syntax

let promise = new Promise((resolve, reject) => {
  // async operation
  let success = true;
  if (success) {
    resolve("Operation Successful");
  } else {
    reject("Operation Failed");
  }
});


🔹 Using .then() and .catch()

promise
  .then((message) => {
    console.log("Success:", message);
  })
  .catch((error) => {
    console.log("Error:", error);
  });

  
🔹 Promise Chaining
doTask1()
  .then(doTask2)
  .then(doTask3)
  .catch((error) => console.log(error));
⏱ 3. setTimeout()
setTimeout() runs a function once after a specified delay.

✅ Syntax:

setTimeout(function () {
  console.log("This runs after 2 seconds");
}, 2000); // 2000 ms = 2 seconds
🔹 With arrow function:
setTimeout(() => {
  console.log("Delayed message");
}, 1000);
🔁 4. setInterval()
setInterval() runs a function repeatedly at a given interval.

✅ Syntax:

let counter = 0;

let intervalId = setInterval(() => {
  console.log("Counter:", ++counter);

  if (counter === 5) {
    clearInterval(intervalId); // stops the interval
  }
}, 1000);
