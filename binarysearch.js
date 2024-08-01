function binarysearch(arr,key){
    s=0
    e=arr.length-1
    while(s<=e){
        mid=parseInt((s+e)/2)
        if(arr[mid]==key){
            return mid
        }else if(arr[mid]>key){
            e=mid-1
        }else{
            s=mid+1
        }
    }
return -1
}
let se=9
let arr=[1,9]
let result=binarysearch(arr,se)
if(result!=-1){
    console.log(`The Element is found at index ${result}`)
}
else{
    console.log(`The Element Not found!`)
}