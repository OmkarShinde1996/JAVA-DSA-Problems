package Arrays;

public class ArrayRotateCheck {
    //In this we are using linear search to find smallest element in the array and printing it's index as
    //rotated by number
    public static int arrayRotateCheck(int arr[]){
        int min=Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                x=i;
            }
        }
        return x;
    }
    //10 20 30 1
    //3
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4};
        System.out.print(arrayRotateCheck(arr));

    }
}
