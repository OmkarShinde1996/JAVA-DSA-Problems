package Arrays;

public class BinarySearch {
    //In binary search array should be sorted. In this we find mid of the array and compare it with given element
    //to find in array if it is greater than mid element then we go right or else go left and do same thing again
    //until we didn't find the element or we didn't cross start point with end point
    public static int binarySearch(int arr[], int x){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(x==arr[mid]){
                return mid;
            }else if(x>arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 8, 9, 11, 23, 35};
        System.out.println(binarySearch(arr, 11));
    }
}
