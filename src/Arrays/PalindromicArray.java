package Arrays;
//First pass each element to reverse function and then compare it ewith actual element of the array
//if all elements are same when reversed the return 1 or else return 0.
public class PalindromicArray {
    static int reverse(int num){
        int result=0;
        while(num!=0){
            int a=num%10;
            result=result*10+a;
            num=num/10;
        }
        return result;
    }
    public static int palinArray(int[] a, int n)
    {
        int count=0;
        for(int i=0;i<n;i++){
            if(reverse(a[i])==a[i]){
                count++;
            }
        }
        if(count==n){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int arr[]={121, 131, 20} ;
        System.out.print(palinArray(arr,3));
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
