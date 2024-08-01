def binarysearch(arr,key,s,e):
    if(s<=e):
        mid=s+e//2
        if(arr[mid]==key):
            return mid
        elif(arr[mid]>key):
            return binarysearch(arr,key,s,mid-1)
        else:
            return binarysearch(arr,key,mid+1,e)
    else:
        return -1
arr=list(map(int,input().split()))
search=int(input())
result=binarysearch(arr,search,0,len(arr)-1)
if(result!=-1):
    print(f"the Element is found at index {result}")
else:
    print("The Elemeny Not Found!")