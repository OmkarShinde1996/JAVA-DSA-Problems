package Arrays;
//Create two variables, l and r, initialize l = 0 and r = n-1
//Iterate the steps below till l <= r, lowerbound is less than the upperbound
//Check if the mid value or index mid = low + (high – low) / 2, is the peak element or not, if yes then print the element and terminate.
//Else if the element on the left side of the middle element is greater then check for peak element on the left side, i.e. update r = mid – 1
//Else if the element on the right side of the middle element is greater then check for peak element on the right side, i.e. update l = mid + 1
public class FindPeakElementIndex {
    public static int peakElement(int[] arr,int n)
    {
        return peak(arr,0,n-1,n);
    }
    public static int peak(int[] arr,int low,int high,int n){
        int mid=low+(high-low)/2;
        if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])){
            return mid;
        }else if(mid > 0 && arr[mid - 1] > arr[mid]){
            return peak(arr,low,(mid-1),n);
        }else{
            return peak(arr,(mid+1),high,n);
        }
    }

    public static void main(String[] args) {
        int arr[]={ 1, 3, 20, 4, 1, 0 };
        System.out.print(peakElement(arr,6));
    }
}
