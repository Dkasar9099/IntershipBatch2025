// Define the student object
const student = {
  name: "Sneha Patil",
  roll: "23IT019",
  course: "Information Technology",
  photo: "https://randomuser.me/api/portraits/women/44.jpg",
  college: "K. K. Wagh Polytechnic, Nashik"
};

// Create card container
const card = document.createElement("div");
card.style.width = "300px";
card.style.margin = "50px auto";
card.style.padding = "20px";
card.style.backgroundColor = "#fff";
card.style.borderRadius = "12px";
card.style.boxShadow = "0 4px 12px rgba(0, 0, 0, 0.2)";
card.style.fontFamily = "Segoe UI, sans-serif";
card.style.textAlign = "center";

// College Name
const college = document.createElement("h3");
college.innerText = student.college;
college.style.marginBottom = "15px";
college.style.fontSize = "16px";
college.style.color = "#2c3e50";
card.appendChild(college);

// Photo
const photo = document.createElement("img");
photo.src = student.photo;
photo.alt = "Student Photo";
photo.style.width = "100px";
photo.style.height = "100px";
photo.style.borderRadius = "50%";
photo.style.objectFit = "cover";
photo.style.border = "3px solid #3498db";
photo.style.marginBottom = "10px";
card.appendChild(photo);

// Name
const name = document.createElement("h2");
name.innerText = student.name;
name.style.color = "#333";
name.style.fontSize = "20px";
card.appendChild(name);

// Roll Number
const roll = document.createElement("p");
roll.innerText = Roll No: ${student.roll};
roll.style.color = "#555";
roll.style.fontSize = "14px";
card.appendChild(roll);

// Course
const course = document.createElement("p");
course.innerText = Course: ${student.course};
course.style.color = "#555";
course.style.fontSize = "14px";
card.appendChild(course);

// Barcode
const barcode = document.createElement("div");
barcode.style.height = "40px";
barcode.style.marginTop = "20px";
barcode.style.backgroundImage = "repeating-linear-gradient(to right, black 0 2px, white 2px 4px)";
card.appendChild(barcode);

// Append card to body
document.body.style.backgroundColor = "#f0f0f0";
document.body.appendChild(card);