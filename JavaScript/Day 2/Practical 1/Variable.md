🧮 Variables in JavaScript
🔹 What is a Variable?
A variable is used to store data that can be used and changed during the execution of a program.



🔑 Types of Variable Declarations
JavaScript provides three ways to declare variables:

var – Traditional way (older)

let – Modern and preferred for changeable values

const – Used for values that should not change



📦 Scope and Rules
Feature	var	let	const
Scope	Function-scoped	Block-scoped	Block-scoped
Re-declaration	Allowed	Not allowed	Not allowed
Re-assignment	Allowed	Allowed	Not allowed
Hoisting	Yes	Yes (but uninitialized)	Yes (but uninitialized)



📌 Best Practices
Use let when the value needs to change.

Use const for fixed values that must not change.

Avoid using var in modern JavaScript code.



✅ Summary
Variables are containers for storing data.

Use meaningful and descriptive names.

Always prefer let and const for clean, modern code.

