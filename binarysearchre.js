function binarysearch(arr,key,s,e){
    if(s<=e){
        let mid=parseInt((s+e)/2)
        if(arr[mid]==key){
            return mid
        }else if(arr[mid]>key){
            return binarysearch(arr,key,s,mid-1)
        }else{
            return binarysearch(arr,key,mid+1,e)
        }
    }
    else{
        return -1
    }
}
let se=8
let arr=[12,111]
let result=binarysearch(arr,se,0,arr.length-1)
if(result!=-1){
    console.log(`The Element is found at index ${result}`)
}
else{
    console.log(`The Element Not found!`)
}