package binarysearch;

import java.util.Scanner;

public class binerysearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int se=in.nextInt();
        int[] arr={1};
        int result=Binarysearch(arr,se);
        if(result!=-1){
            System.out.println("The element is found at index "+result);
        }
        else{
            System.out.println("The Element is not found!");
        }
        in.close();
    }
    private static int Binarysearch(int[] arr,int key){
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=(s+e)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
