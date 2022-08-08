package Arrays;
//The idea is based on the fact that if we make sure that all even positioned (at index 0, 2, 4, ..) elements are greater than their adjacent odd elements, we don’t need to worry about odd positioned element. Following are simple steps.
//1) Traverse all even positioned elements of input array, and do following.
//….a) If current element is smaller than previous odd element, swap previous and current.
//….b) If current element is smaller than next odd element, swap next and current.
public class SortArrayInWaveForm {
    static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sortInWave(int[] arr, int n) {
        for(int i=0;i<n;i=i+2){
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);

            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
    }
    //2 1 10 5 49 23 90
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sortInWave(arr,5);
        for (int i : arr)
            System.out.print(i+" ");
    }
}
