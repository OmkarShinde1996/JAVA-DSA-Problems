package Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[], int x){
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4,6,7,12,10};
        System.out.println(linearSearch(arr,19));
    }
}
