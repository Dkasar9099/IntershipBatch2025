 const users = [
    {userId :1 ,firstName:"Yatin",age : 22},
    {userId :2,firstName:"mohit",age : 20},
    {userId :3,firstName:"rajesh",age : 23},
    {userId :4,firstName:"ramesh",age : 27},
    {userId :5,firstName:"siddhi",age : 24},
]

const userfound = users.find((user)=>{

    return user.userId===4;
    
});
console.log(userfound);
