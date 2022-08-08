package Arrays;

public class RotateArrayToTheRightByK {
    //REVERSE FUNCTION
    public static void r(int arr[], int l, int h){
        while(l<h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
    public static void rotate(int[] arr, int k){
        //IF K IS GREATER THAN ARRAY LENGTH
        //THEN IT IS A COMPLETE ROTATION
        //SO WE DO THIS
        k = k%arr.length;
        r(arr, 0, arr.length-1);
        r(arr, 0, k-1);
        r(arr, k, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {-1,-100,3,99};
        rotate(arr,2);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
