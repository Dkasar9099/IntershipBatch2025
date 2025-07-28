// console.log("start Script");

// const id = setTimeout(()=>{
//     console.log("inside Timeout Function");
// },0);


// // for(let i = 1; i< 10000; i++){
// //     console.log("....");
// // }

// console.log("settime out id is ",id);
// console.log("clearing time out ");
// clearTimeout(id);
// console.log("Script Ends");





console.log("start Script");

const id = setInterval(()=>{
    console.log("inside Timeout Function");
},0);


for(let i = 1; i< 10000; i++){
    console.log("....");
}

console.log("settime out id is ",id);
console.log("clearing time out ");
clearTimeout(id);
console.log("Script Ends");
