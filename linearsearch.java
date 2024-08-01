import java.util.Scanner;

class linearsearch{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x=input.nextInt();
        int[] arr={1,2,3,4,5};
        int result=linearSearch(arr,x);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("element found at index "+result);
        }
        input.close();
    }
    public static int linearSearch(int[] arr,int key){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}