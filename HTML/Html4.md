✅ 1. Media Query
A Media Query is a CSS feature that allows you to apply styles only when certain conditions are met, such as screen size, resolution, orientation, etc. This is the foundation of responsive web design.

🔹 Syntax:
css
Copy code
@media (condition) {
  /* CSS rules here */
}

🔹 Example:
css
Copy code
/* Default for mobile */
body {
  background-color: lightblue;
}

/* For screens 768px and wider (e.g., tablets, desktops) */
@media (min-width: 768px) {
  body {
    background-color: lightgreen;
  }
}
🔹 Common Conditions:
Condition	Meaning
min-width	Apply styles if screen is at least that width
max-width	Apply styles if screen is at most that width
orientation	portrait or landscape
resolution	Screen DPI (used in printing or high-res displays)





✅ 2. CSS Grid
CSS Grid Layout is a powerful 2D layout system for placing items into rows and columns. It gives you full control over the layout of a webpage.

🔹 Basic Usage:
css
Copy code
.container {
  display: grid;
  grid-template-columns: repeat(3, 1fr); /* 3 equal columns */
  gap: 10px; /* spacing between grid items */
}
html
Copy code
<div class="container">
  <div>Box 1</div>
  <div>Box 2</div>
  <div>Box 3</div>
</div>
🔹 Key Properties:
Property	Description
display: grid	Turns an element into a grid container
grid-template-columns	Defines the number and width of columns
grid-template-rows	Defines the number and height of rows
gap	Space between rows and columns
grid-column, grid-row	Controls item placement and span in grid

