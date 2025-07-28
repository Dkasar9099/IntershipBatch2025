const numbers = [4,3,5,6,5];

const users = [
    {firstName:"Yatin",age : 22},
    {firstName:"mohit",age : 20},
    {firstName:"rajesh",age : 23},
    {firstName:"ramesh",age : 27},
    {firstName:"siddhi",age : 24},
]

const user_names = users.map((user)=>{
    return user.firstName;
})
console.log(user_names);