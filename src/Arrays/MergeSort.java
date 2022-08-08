package Arrays;
//This sorting algo requires 2 sorted arrays

public class MergeSort {
    public static int[] mergenSort(int arr[],int arr1[]){
        int i=0;
        int j=0;
        int k=0;

        int arr3[] = new int[arr.length+arr1.length];
        while(i<arr.length && j<arr1.length){
            // we will get out of this loop until & unless 1 array scanning
            // is done and then we need to copy element of another array into arr3
            if(arr[i]<arr1[j]){
                arr3[k]=arr[i];
                k++;
                i++;
            }else{
                arr3[k]=arr1[j];
                j++;
                k++;
            }
        }
        while(i<arr.length){//in this loop will copy remaining ele of arr in arr3
            arr3[k]=arr[i];
            k++;
            i++;
        }
        while(j<arr1.length){//in this loop will copy remaining ele of arr1 in arr3
            arr3[k]=arr1[j];
            j++;
            k++;
        }
        return arr3;//return newly created array arr3
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4}; //Sorted array required
        int arr1[] = {1, 4, 5, 8, 9, 11, 23, 35}; //Sorted array required
        int arr3[]=mergenSort(arr,arr1);
        for(int i = 0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
