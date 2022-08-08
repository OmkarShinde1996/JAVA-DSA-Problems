package Arrays;

public class SelectionSort {
    //In selection sort we find min value in entire array and swap it with starting values.
    //Rounds to be performed = arr.lenght-1
    public static void selectionSort(int arr[]){
        for(int i =0; i<arr.length; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,5,7,3,8,0,6,9};
        selectionSort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
