// Perform sorting of an array in descending order.
let arr=[45,5,59,89,52,78,56];
console.log("The array is: "+arr)
arr.sort((a,b)=>{
    return b-a;})
console.log("The sorted array in descending order is: "+arr);
