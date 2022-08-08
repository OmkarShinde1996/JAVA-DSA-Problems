package Arrays;
//Traverse the given array ‘arr’ from left to right. While traversing, maintain count of non-zero
// elements in array. Let the count be ‘count’. For every non-zero element arr[i], put the element
//at ‘arr[count]’ and increment ‘count’. After complete traversal, all non-zero elements have already
// been shifted to front end and ‘count’ is set as index of first 0. Now all we need to do is that run a
// loop which makes all elements zero from ‘count’ till end of the array.

public class PushZerosAtEnd {
    public static void pushZerosAtEnd(int arr[]){
        int count=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count < arr.length){
            arr[count]=0;
            count++;
        }
    }
    //2 0 0 1 3 0 0
    //2 1 3 0 0 0 0
    public static void main(String[] args) {
        int arr[] = {2,0,0,1,3,0,0};
        pushZerosAtEnd(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
