package Arrays;
//In Insertion sort we compare 2nd element with 1st and swap them likewise 3rd element will be compared with
//2nd and 1st element if required swapping will be done
//same 4th element will be compared with 3rd, 2nd and 1st element and if required swapping will be done

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    //{2,4,1,3}
    public static void main(String[] args) {
        int arr[] = {2,4,1,3};
        insertionSort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
