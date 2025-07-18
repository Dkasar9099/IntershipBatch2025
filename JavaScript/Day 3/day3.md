#dot bracket accesing
#properties
#nested destructuring
#object destructuring
#arrow function
#spread operator use...


# JavaScript Concepts

## 1. Dot Bracket Accessing

JavaScript objects can be accessed using **dot notation** or **bracket notation**.

### Dot Notation
```javascript
const person = { name: "Alice", age: 25 };
console.log(person.name); // Alice
Bracket Notation
javascript
Copy
Edit
const person = { name: "Alice", age: 25 };
console.log(person["age"]); // 25
Use bracket notation when the property name is dynamic or not a valid identifier (e.g., contains spaces).



2. Object Properties
Objects have key-value pairs called properties.

javascript
Copy
Edit
const car = {
  brand: "Toyota",
  model: "Corolla",
  year: 2020
};

console.log(car.model); // Corolla
car.color = "Blue"; // Adding a new property
console.log(car); 
3. Nested Destructuring
Used to extract values from nested objects or arrays.

javascript
Copy
Edit
const user = {
  name: "John",
  address: {
    city: "New York",
    zip: 10001
  }
};

const { address: { city } } = user;
console.log(city); // New York



4. Object Destructuring
Allows unpacking values from an object into distinct variables.

javascript
Copy
Edit
const student = {
  name: "Ravi",
  age: 21,
  course: "CS"
};

const { name, course } = student;
console.log(name);   // Ravi
console.log(course); // CS



5. Arrow Functions
Shorter syntax for writing functions.

Traditional Function
javascript
Copy
Edit
function add(a, b) {
  return a + b;
}
Arrow Function
javascript
Copy
Edit
const add = (a, b) => a + b;
console.log(add(5, 3)); // 8
For a single parameter:

javascript
Copy
Edit
const square = x => x * x;



6. Spread Operator (...)
Used to copy or combine arrays and objects.

Arrays
javascript
Copy
Edit
const nums = [1, 2, 3];
const moreNums = [...nums, 4, 5];
console.log(moreNums); // [1, 2, 3, 4, 5]
Objects
javascript
Copy
Edit
const user = { name: "Sara", age: 22 };
const updatedUser = { ...user, age: 23 };
console.log(updatedUser); // { name: "Sara", age: 23 }
📘 Note: All code examples above are in JavaScript (ES6+).

javascript
Copy
Edit

Would you like me to save or export this `.md` file for download?








Ask ChatGPT
