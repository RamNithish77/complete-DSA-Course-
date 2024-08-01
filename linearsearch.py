def linearsearch(arr,key):
    if(len(arr)==0):
         return -1
    for i in range(len(arr)):
        if(arr[i]==key):
            return i
    return -1
x=int(input())
li=list(map(int,input().split()))
result=linearsearch(li,x)
if(result!=-1):
    print(f"The element found at the index {result}")
else:
    print("Element not found")
        