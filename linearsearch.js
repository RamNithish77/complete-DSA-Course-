function linearsearch(arr,x){
if(arr.length==0){
    return -1
}
for(i=0;i<arr.length;i+=1){
    if(arr[i]==x){
        return i
    }
}
return -1
}
let x=5
let arr=[1,2,3,4,5]
console.log(linearsearch(arr,x))

