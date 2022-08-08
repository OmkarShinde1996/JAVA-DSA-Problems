package Arrays;

public class FindSecondLargest {
    public static int secondLargest(int arr[]){
        int large=Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(arr.length<=1){//to check if length of array is less than equal to 1
            return Integer.MIN_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){//to find largest element and replace secondLargest with large
                secondLargest=large;
                large = arr[i];

            }else if(large>arr[i]){//if large>arr[i] we need to compare arr[i] with secondLargest
                if(secondLargest<arr[i] && arr[i]!=large){//make sure arr[i] is not equal to large
                    secondLargest=arr[i];
                }
            }
        }
        if(secondLargest==Integer.MIN_VALUE){//if all the elements in array are same print min value of integer
            return Integer.MIN_VALUE;
        }
        return secondLargest;//return secondLargest
    }

    //2 13 4 1 3 6 28
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,2,2};
        System.out.print(secondLargest(arr));

    }
}
