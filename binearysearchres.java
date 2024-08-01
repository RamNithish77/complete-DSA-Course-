package binarysearch;

import java.util.Scanner;

public class binearysearchres {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int se=in.nextInt();
        int[] arr={1};
        int result=Binarysearch(arr,se,0,arr.length-1);
        if(result!=-1){
            System.out.println("The element is found at index "+result);
        }
        else{
            System.out.println("The Element is not found!");
        }
        in.close();
    }
    private static int Binarysearch(int[] arr,int key,int s,int e){
        if(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]>key) {
                return Binarysearch(arr,key,s,mid-1);
            } else {
                return Binarysearch(arr,key,mid+1,e);
            }
        }
        else{
            return -1;
        }
    }
}
