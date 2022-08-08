package Arrays;

public class Sort012 {
    public static void sort012(int[] arr){
        int zero=0,one=0,two=0,j=0;
        for(int i=0;i<arr.length;i++){//Counting 0s.1s and 2s in this loop
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        while(zero-1>=0){//placing 0s on jth position
            arr[j]=0;
            j++;
            zero--;
        }
        while(one-1>=0){//placing 1s on jth position
            arr[j]=1;
            j++;
            one--;
        }
        while(two-1>=0){//placing 2s on jth position
            arr[j]=2;
            j++;
            two--;
        }
    }

    //Duch flag Algo

    public static void sorting012(int[] arr){
        int n= arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
//0012
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0};
        sorting012(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
