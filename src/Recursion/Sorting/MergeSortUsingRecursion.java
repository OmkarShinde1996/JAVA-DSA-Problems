package Recursion.Sorting;

public class MergeSortUsingRecursion {
    public static void mergeSort(int[] input,int si,int ei){
        if(si>=ei   ){
            return;
        }
        int mid = (si+ei)/2;
        mergeSort(input,si,mid);
        mergeSort(input,mid+1,ei);
        merge(input,si,ei);
    }
    public static void merge(int[] input, int si,int ei){
        int mid = (si+ei)/2;
        int arr3[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(input[i]<input[j]){
                arr3[k]=input[i];
                i++;
                k++;
            }else{
                arr3[k]=input[j];
                k++;
                j++;
            }
        }
        while(i<=mid){//in this loop will copy remaining ele of arr in arr3
            arr3[k]=input[i];
            i++;
            k++;
        }
        while(j<=ei){//in this loop will copy remaining ele of arr1 in arr3
            arr3[k]=input[j];
            k++;
            j++;
        }
        for(int index=0;index< arr3.length;index++){
            input[si+index]=arr3[index];
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 5, 4, 11, 9, 8, 35, 23};
        mergeSort(arr1,0, arr1.length-1);
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
