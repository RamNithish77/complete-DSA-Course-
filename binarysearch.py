def binarysearch(arr,key):
    start=0
    end=len(arr)-1
    while(start<=end):
        mid=(start+end)//2
        if(arr[mid]==key):
            return mid
        elif(arr[mid]>key):
            end=mid-1
        else:
            start=mid+1
    return-1
arr=list(map(int,input().split()))
search=int(input())
result=binarysearch(arr,search)
if(result!=-1):
    print(f"the Element is found at index {result}")
else:
    print("The Elemeny Not Found!")