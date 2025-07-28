const users = [
   {firstName:"Yatin",age : 22},
   {firstName:"mohit",age : 20},
   {firstName:"rajesh",age : 23},
   {firstName:"ramesh",age : 27},
   {firstName:"siddhi",age : 24},
]

// More often seen
users.forEach(function(user){
    console.log(user.firstName);
});

// recent in ES6
for(let user of users){
    console.log(user.firstName);
}

users.forEach((user,index)=>{
    console.log(user.firstName,index);
})